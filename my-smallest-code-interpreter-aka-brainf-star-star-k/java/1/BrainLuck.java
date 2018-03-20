public class BrainLuck {
  public static final char OP_NEXT = '>';
  public static final char OP_PREVIOUS = '<';
  public static final char OP_INCREMENT = '+';
  public static final char OP_DECREMENT = '-';
  public static final char OP_WRITE = '.';
  public static final char OP_READ = ',';
  public static final char OP_JUMP_ZERO = '[';
  public static final char OP_JUMP_NONZERO = ']';
  
  private final String code;

  public BrainLuck(final String code) {
    this.code = code;
  }

  public String process(final String input) {
    final Data data = new Data(64); // tradeoff: performance / memory footprint
    int inputPointer = 0;
    final StringBuilder output = new StringBuilder();
    for (int instructionPointer = 0; instructionPointer < code.length(); instructionPointer++) {
      final char instruction = code.charAt(instructionPointer);
      switch (instruction) {
        case OP_NEXT:
          data.next();
          break;
        case OP_PREVIOUS:
          data.previous();
          break;
        case OP_INCREMENT:
          data.increment();
          break;
        case OP_DECREMENT:
          data.decrement();
          break;
        case OP_WRITE:
          output.append((char) Byte.toUnsignedInt(data.get()));
          break;
        case OP_READ:
          data.set((byte) input.charAt(inputPointer++));
          break;
        case OP_JUMP_ZERO:
          if (data.get() == 0) {
            int level = 1;
            for (instructionPointer = instructionPointer + 1; instructionPointer < code.length(); instructionPointer++) {
              final char nextInstruction = code.charAt(instructionPointer);
              if (nextInstruction == OP_JUMP_ZERO) {
                level++;
              } else if (nextInstruction == OP_JUMP_NONZERO && --level == 0) {
                break;
              }
            }
          }
          break;
        case OP_JUMP_NONZERO:
          if (data.get() != 0) {
            int level = 1;
            for (instructionPointer = instructionPointer - 1; instructionPointer >= 0; instructionPointer--) {
              final char previousInstruction = code.charAt(instructionPointer);
              if (previousInstruction == OP_JUMP_NONZERO) {
                level++;
              } else if (previousInstruction == OP_JUMP_ZERO && --level == 0) {
                break;
              }
            }
          }
          break;
      }
    }
    return output.toString();
  }
}

class Data {
  private final int growth;
  private byte[] data;
  private int pointer = 0;

  Data(final int growth) {
    this.growth = growth;
    data = new byte[growth];
  }

  void next() {
    pointer++;
  }

  void previous() {
    pointer--;
  }

  void increment() {
    ensureCapacity();
    data[pointer]++;
  }

  void decrement() {
    ensureCapacity();
    data[pointer]--;
  }

  byte get() {
    ensureCapacity();
    return data[pointer];
  }

  void set(final byte b) {
    ensureCapacity();
    data[pointer] = b;
  }

  private void ensureCapacity() {
    final int difference = data.length - pointer;
    final int rate;
    final int destPos;

    if (difference <= 0) {
      rate = 1 - difference / growth;
      destPos = 0;
    } else if (difference > data.length) {
      rate = 1 + difference / growth;
      destPos = rate * growth;
    } else {
      return;
    }

    final byte[] data = new byte[this.data.length + rate * growth];
    System.arraycopy(this.data, 0, data, destPos, this.data.length);
    this.data = data;
    pointer += destPos;
  }
}
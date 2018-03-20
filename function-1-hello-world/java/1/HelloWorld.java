public class HelloWorld {
  public static String greet() {
    final String echoUntilZero = ",[.[-],]";
    return new BrainFuck(echoUntilZero).process("hello world!\0bye bye!");
  }
}

class BrainFuck {
  public static final char OP_NEXT = '>';
  public static final char OP_PREVIOUS = '<';
  public static final char OP_INCREMENT = '+';
  public static final char OP_DECREMENT = '-';
  public static final char OP_WRITE = '.';
  public static final char OP_READ = ',';
  public static final char OP_JUMP_ZERO = '[';
  public static final char OP_JUMP_NONZERO = ']';
  
  private final String code;

  public BrainFuck(final String code) {
    this.code = code;
  }

  public String process(final String input) {
    final Data data = new Data(2);
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
            instructionPointer = matchNext(instructionPointer);
          }
          break;
        case OP_JUMP_NONZERO:
          if (data.get() != 0) {
            instructionPointer = matchPrevious(instructionPointer);
          }
          break;
      }
    }
    return output.toString();
  }

  private int matchNext(final int instructionPointer) {
    return match(instructionPointer, true);
  }

  private int matchPrevious(final int instructionPointer) {
    return match(instructionPointer, false);
  }

  private int match(final int start, final boolean next) {
    final int step;
    final char same;
    final char match;
    if (next) {
      step = 1;
      same = OP_JUMP_ZERO;
      match = OP_JUMP_NONZERO;
    } else {
      step = -1;
      same = OP_JUMP_NONZERO;
      match = OP_JUMP_ZERO;
    }
    
    for (int instructionPointer = start + step, level = 1; instructionPointer < code.length(); instructionPointer += step) {
      final char nextInstruction = code.charAt(instructionPointer);
      if (nextInstruction == same) {
        level++;
      } else if (nextInstruction == match && --level == 0) {
        return instructionPointer;
      }
    }
    throw new IllegalStateException(String.format("no match for start=%s and next=%b", start, next));
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
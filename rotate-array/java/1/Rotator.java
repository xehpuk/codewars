public class Rotator {
  public Object[] rotate(final Object[] data, final int n) {
    final int length = data.length;
    final Object[] rotatedData = new Object[length];
    final int rotateBy = (n % length + length) % length;
    final int offset = length - rotateBy;
    System.arraycopy(data, 0, rotatedData, rotateBy, offset);
    System.arraycopy(data, offset, rotatedData, 0, rotateBy);
    return rotatedData;
  }
}
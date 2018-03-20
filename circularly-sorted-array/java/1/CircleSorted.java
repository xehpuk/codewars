public class CircleSorted {

    public boolean isCircleSorted(int[] a) {
      boolean jump = false;
      for (int i = 0; i < a.length - 1; i++) {
        if (a[i] > a[i + 1]) {
          if (jump) {
            return false;
          }
          jump = true;
        }
      }
      return !jump || a[0] > a[a.length - 1];
    }

}
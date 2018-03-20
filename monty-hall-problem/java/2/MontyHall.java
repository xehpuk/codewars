public class MontyHall {
  public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
    return Math.round(java.util.Arrays.stream(participantGuesses)
                                      .filter(guess -> guess != correctDoorNumber)
                                      .count() * 100f / participantGuesses.length);
  }
}
class champMedals {
  public static void main(String[] args) {
    List<Integer> num = new ArrayList<Integer>();
    num.add();
  }

  public static List<Long> calculateOutputValues(List<Long> medals) {
    int maxMedals = 0;
    int atLeastOneWinCount = 0;
    int noWinCount = 0;
    int totalMedalsWonInLast3 = 0;
    int size = medals.size();
    for (int i = 0; i < size; i++) {
      if (medals.get(i) > maxMedals) {
        maxMedals = medals.get(i);
      }
      if (medals.get(i) > 0) {
        atLeastOneWinCount++;
      }
      if (medals.get(i) == 0) {
        noWinCount++;
      }
      if (i >= size - 3) {
        totalMedalsWonInLast3 += medals.get(i);
      }
    }
    List<Integer> result = new ArrayList<Integer>();
    result.add(totalMedalsWonInLast3);
    result.add(maxMedals);
    result.add(atLeastOneWinCount);
    result.add(noWinCount);
    return result;
  }
}
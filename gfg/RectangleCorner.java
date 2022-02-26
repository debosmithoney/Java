package gfg;

import java.util.*;

public class RectangleCorner {
  public static void main(String[] args) {
    int[][] x = {
        { 1, 0, 0, 1, 0 },
        { 0, 0, 1, 0, 1 },
        { 0, 0, 0, 1, 0 },
        { 1, 0, 1, 0, 1 }
    };
    System.out.println(ValidCorner(x));
  }

  static boolean ValidCorner(int matrix[][]) {
    HashMap<Integer, Integer> mapX = new HashMap<>();
    HashMap<Integer, Integer> mapY = new HashMap<>();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 1) {
          mapX.put(i, mapX.getOrDefault(i, 0) + 1);
          mapY.put(j, mapY.getOrDefault(j, 0) + 1);
        }
      }
    }
    int cntx = 0, cnty = 0;
    for (int k : mapX.keySet())
      if (mapX.get(k) >= 2)
        cntx++;
    for (int k : mapY.keySet())
      if (mapY.get(k) >= 2)
        cnty++;
    return (cntx >= 2 && cnty >= 2);
  }
}

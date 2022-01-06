import java.util.ArrayList;
import java.util.*;
public class PascalTri {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // compute the first numRows of Pascal's triangle
        for(int i = 0; i < numRows; i++){
            List<Integer> innerList = new ArrayList<>(i+1);
            result.add(innerList);
            innerList.add(0, 1);
            if(i>0) innerList.add(1, 1);
            int j = 1;
            if(i>1){
                while(j < i){
                    innerList.add(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
                    j++;
                }
            }
        }
        return result;
    }
}

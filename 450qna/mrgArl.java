import java.util.*;

public class mrgArl {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <k; i++) {
            for(int j = 0; j < kArrays.get(i).size(); j++) {
                
            }
        }
        
        for(int i = 1;i<k;i++) {
            kArrays.get(0).addAll(kArrays.get(i));
        }
        Collections.sort(kArrays.get(0));
        return kArrays.get(0);
	}
}

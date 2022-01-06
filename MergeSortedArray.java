public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n])
                nums1[size--] = nums1[m--];
            else
                nums1[size--] = nums2[n--];
        }
        if(m>0){
            while(m>=0){
                nums1[size--]= nums1[m--];
            }
        }
        else
        {
            while(n>=0){
                nums1[size--]= nums2[n];
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n =nums1.length;
        int m = nums2.length;
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(nums1,m, nums2,n);
        for(int i=0;i<(m+n-1);i++)
        System.out.print(nums1[i]+" ");
    }
}

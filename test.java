public class test {
    public int read(int[] x,int s){
        for (int i = 0; i <x.length; i++){
            if(x[i] == s) return i+1;
        }
        return -1;
    }
    public static void main(String[] args){
        test obj = new test();
        int[] x = {8,2,3,4,3};
        // int[] y = obj.read(x);
        // for(int i=0; i<y.length-1; i++){
        //     System.out.print(y[i]+ " ");
        // }
        System.out.println(obj.read(x,1));
    }
}

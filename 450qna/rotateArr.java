import java.util.*;

class rotateArr {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int [n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int k=sc.nextInt();
        rotate(a,n,k);
		sc.close();
	}
    public static void rotate(int a[],int n, int k){
        int arr[] =new int[n];
        for (int i=0;i<n;i++){
            if(i+k<n) arr[i]=a[i+k];
            else arr[i] = a[i+k-n];
        }
        for (int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
     }
}
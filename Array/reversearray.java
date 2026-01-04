public class reversearray {

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        for(int ele: arr){
          System.err.print(ele +" ");
        }
        System.err.println();

        int i=0, j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
         System.err.println();
    }
}

public class transposeInSame {

    public static void print(int[][] arr){
        int m=arr.length, n=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.err.print(arr[i][j]+" ");
            }
            System.err.println();
        }

        System.err.println();
    }
//  Transposing in the same matrix 
    public static void main(String[] args) {
        
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        print(arr);

         for(int i=0; i<m; i++){
            for(int j=0; j<=i; j++){
              int temp=arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
            }
        }
        print(arr);

// Rotating 90degree 

         for(int i=0; i<m; i++){
         int a=0, b=m-1;
         while(a<b){
        // swap arr[i][a] and arr[i][b]
        int temp=arr[i][a];
           arr[i][a]=arr[i][b];
           arr[i][b]=temp;
           a++;
           b--;
         }
       }
     print(arr);
    }


  
}

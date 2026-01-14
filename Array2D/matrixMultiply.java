public class matrixMultiply {
     public static void print(int[][] arr){
        int m = arr.length , n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.err.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int[][] a={{1,2,1},{2,1,2}};
        int[][] b={{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        if(a[0].length!=b.length){
            System.out.print("Multiplication not possible");

        }else{
            int[][] c=new int[a.length][b[0].length];
            for(int i=0; i<c.length; i++){
                for(int j=0; j<c[0].length; j++){
                    for(int k=0; k<b.length; k++){
                        c[i][j]+= (a[i][k]*b[k][j]);

                    }
                    
                }
                
            }
            print(a);
            System.out.println(" ");
            print(b);
            System.out.println(" ");
            print(c);
        }
    }
}

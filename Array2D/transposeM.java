public class transposeM {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int m=arr.length , n=arr[0].length;

        // ROW WISE PRINTING 
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.err.println();
        // }

        //COLUMN WISE PRINTING

        // for(int j=0; j<n; j++){
        //     for(int i=0; i<m; i++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.err.println();
        // }

        //storing
        int[][] transpose=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[i][j]=arr[j][i];
                System.err.print(transpose[i][j]+" ");
            }
            System.err.println();
        }


    }

}

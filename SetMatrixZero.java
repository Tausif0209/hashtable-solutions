public class SetMatrixZero {
   public void setZeroes(int[][] matrix) {
        //O(m+n) space complexity
        // ArrayList<Integer> row=new ArrayList<>();
        // ArrayList<Integer> col=new ArrayList<>();
        // int i,j;
        // for( i=0;i<matrix.length;i++)
        // {
        //     for( j=0;j<matrix[0].length;j++)
        //     {
        //         if(matrix[i][j]==0)
        //         {
        //             if(!row.contains(i))
        //             row.add(i);
        //             if(!col.contains(j))
        //             col.add(j);
        //         }
        //     }
        // }
        // for(int r:row)
        // {
        //     for(j=0;j<matrix[0].length;j++)
        //     {
        //         matrix[r][j]=0;
        //     }
        // }
        //  for(int c:col)
        // {
        //     for(i=0;i<matrix.length;i++)
        //     {
        //         matrix[i][c]=0;
        //     }
        // }
        //constant space complexity
        
        boolean firstRow=false;
        boolean firstCol=false;
        for(int i=0;i<matrix[0].length;i++){
            firstRow= firstRow || matrix[0][i]==0;
            }
        for(int i=0;i<matrix.length;i++){
            firstCol=firstCol || matrix[i][0]==0;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]!=0) continue;
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]!=0) continue;
            for(int j=1;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }
        if(firstRow) {
            for(int i=0;i<matrix[0].length;i++){
            matrix[0][i]=0;
            }
        }
         if(firstCol) {
            for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
            }
        }
        
    }
}

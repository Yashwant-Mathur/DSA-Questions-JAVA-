class Solution {
    public int[][] generateMatrix(int n) {
        //int m=matrix.length;
        //int n=matrix[0].length;
        int top=0;
        int down=n-1;
        int left=0;
        int right=n-1;

        int dir=0;
        int[][] arr = new int[n][n];
        int num=1;

        while(top<=down && left<=right){
           if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                   arr[top][i]=num;
                   num++;

                }top++;
            }
            if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    arr[i][right]=num;
                     num++;

                }right--;
            }
            if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    arr[down][i]=num;                
                    num++;
                }down--;
            }
            if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    arr[i][left]=num;
                    num++;
                }left++;
            }
            dir+=1;
            if(dir==4)
            {
                dir=0;
            }
        }
        return arr;
        
    }
}
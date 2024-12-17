class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
         int n=gas.length;
        int m=cost.length;
        int sum1g=0;
        int sum2c=0;
        int totalgas=0;
        int totalcost=0;
        int currentgas = 0;
        int startindex = 0;
        int k;
        for(int i=0;i<n;i++)
        {
         sum1g+=gas[i];
         sum2c+=cost[i];
        }
       if(sum1g<sum2c)
       {
        return -1;
        }
        int arr[]=new int[n];
       // for(int i=0;i<n;i++)
        //{
       //     arr[i]=gas[i]-cost[i];
       // }
        
           // for( k=0;k<n;k++)
           // {
            //    if(arr[k]<0)
             //   {
            //        continue;
            //    }
            //    else
              //  {
                //   break;
               // }
            //}
            for(int i=0;i<n;i++)
            {
               totalgas+=gas[i];
               totalgas-=cost[i];
               currentgas+=gas[i]-cost[i];
               if(currentgas<0)
               {
                currentgas=0;
                startindex=i+1;
               }
            }
        

 return startindex;
 }
}
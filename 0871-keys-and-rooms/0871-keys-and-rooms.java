class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean[] visited=new boolean[rooms.size()];
       visited[0]=true;
       dfs(rooms,visited,0);
       return isvisited(visited);
    }
public void dfs(List<List<Integer>>rooms,boolean[] visited, int room){
    List<Integer> rm=rooms.get(room);
    for(int i=0;i<rm.size();i++)
    {
        int key =rm.get(i);
        if(visited[key]==false)
        {
            visited[key]=true;
            dfs(rooms,visited,key);
        }
    }
}
boolean isvisited(boolean[] visit)
{
    for(boolean i:visit)
    {
        if(!i)
        {
            return false;
        }

    }
    return true;
}

}//using boolean array of list 

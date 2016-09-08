
public class p200 {
	 public static int numIslands(char[][] grid) {
			if(grid==null || grid.length==0) return 0;
			int islands = 0;
			for(int i=0;i<grid.length;i++) {
				for(int j=0;j<grid[i].length;j++) {
					if(grid[i][j]=='1') {
						explore(grid,i,j);
						islands++;
					}
				}
			}
			return islands;
	    }
	 public static void explore(char[][] grid,int i,int j){
		 grid[i][j]='2';
		 int dx[]={-1,0,0,1};
		 int dy[]={0,1,-1,0};
		 for(int d=0;d<dx.length;d++){
			 if(i+dy[d]>=0&&i+dy[d]<grid.length&&j+dx[d]>=0&&j+dx[d]<grid[0].length&&grid[i+dy[d]][j+dx[d]]=='1'){
				 explore(grid,i+dy[d],j+dx[d]);
			 }
		 }
	 } 
	 public static void main(String args[]){
		 char grid[][]={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		 System.out.println(numIslands(grid));
	 }
}
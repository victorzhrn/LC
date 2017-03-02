import java.util.Arrays;
import java.util.LinkedList;

public class Building {

	public int[][] distMatrix, grid;
	private int x, y;
	private int rows, cols;

	public Building(int x_loc, int y_loc, int[][] grid) {
		this.x = x_loc;
		this.y = y_loc;
		this.rows = grid.length;
		this.cols = grid[0].length;
		this.grid = grid;
		constructDistMatrix();
	}

	public void constructDistMatrix() {
		this.distMatrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				distMatrix[i][j] = -1;
			}
		}
		LinkedList<Location> queue = new LinkedList<Location>();
		queue.add(new Location(x,y,-1));
		while(!queue.isEmpty()){
			Location l = queue.remove();
			int i = l.x;
			int j = l.y;
			if (i < 0 || i >= rows || j < 0 || j >= cols || this.distMatrix[i][j] != -1){
				continue;
			}else{
				if ((grid[i][j] == 1 || grid[i][j] == 2) && !(this.x == i && this.y == j)) {
					this.distMatrix[i][j] = Integer.MAX_VALUE;
					continue;
				}
				int newDist = l.prevd+1;
				this.distMatrix[i][j]=newDist;
				queue.add(new Location(i-1,j,newDist));
				queue.add(new Location(i+1,j,newDist));
				queue.add(new Location(i,j-1,newDist));
				queue.add(new Location(i,j+1,newDist));
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (distMatrix[i][j]==-1) distMatrix[i][j]=Integer.MAX_VALUE;
			}
		}
	}
	
	public class Location{
		private int x,y,prevd;
		public Location(int m, int n,int d){
			x=m;
			y=n;
			prevd = d;
		}
	}

}

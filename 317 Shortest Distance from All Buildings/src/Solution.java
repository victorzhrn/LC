import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static int shortestDistance(int[][] grid) {
    	HashSet<int[][]> hs = new HashSet<int[][]>();
    	int rows = grid.length;
    	int cols = grid[0].length;
    	for ( int i = 0; i < rows; i++){
    		for (int j = 0; j < cols; j++){
    			if (grid[i][j]==1){
    				Building b = new Building(i,j,grid);
    				
    				hs.add(b.distMatrix);
    			}
    		}
    	}
    	int[][] finalDistMatrix = new int[rows][cols];
    	for ( int i = 0; i < rows; i++){
    		for (int j = 0; j < cols; j++){
    			if (grid[i][j]==1 || grid[i][j]==2){
    				finalDistMatrix[i][j]= Integer.MAX_VALUE;
    			}else{
    				
    				for (int[][] m : hs){
    					finalDistMatrix[i][j]+=m[i][j];
    					if (m[i][j]== Integer.MAX_VALUE) {
    						finalDistMatrix[i][j]=Integer.MAX_VALUE;
    						System.out.println("corrected value: "+finalDistMatrix[i][j]);
    						break;
    					}
    				}
    			}
    		}
    	}
    	
    	
    	
    	int min = finalDistMatrix[0][0];
    	for ( int i = 0; i < rows; i++){
    		for (int j = 0; j < cols; j++){
    			if (finalDistMatrix[i][j] < min) min = finalDistMatrix[i][j];
    		}
    	}
    	
    	if (min == Integer.MAX_VALUE) min= -1;
    	
        return min; 
    }
    
    
}
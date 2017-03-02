package checkBlackSurrounded;

import java.util.Arrays;
import java.util.HashSet;

/*
 * the task is to determine if the black chess on a board is surrounded by whites
 * the board is represented as a 2-D char array. 
 * return True if blacks are surrounded
 * return False otherwise
 */

public class Solution {
	public static boolean checkBlack(char[][] board) {
		int rows = board.length;
		int cols = board[0].length;
		boolean[][] checkBoard = new boolean[rows][cols];
		HashSet<int[]> allBlacks = new HashSet<int[]>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == 'b');
				checkBoard[i][j] = true;
				int[] black_loc = { i, j };
				allBlacks.add(black_loc);
			}
		}
		return false;
	}
	
	public boolean checkSurroundedByEmpty(int[] a, int rows, int cols,char[][] board){
		int x = a[0];
		int y = a[1];
		if (x-1>=0) {
			boolean leftOK = (board[x][y]=='e');
		}else{
			boolean leftOK = false;
		}
		
		
		return false;
		
	}
}

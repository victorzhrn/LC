package checkBlackSurrounded;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

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
		Stack<int[]> allBlacks = new Stack<int[]>();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == 'b') {
					checkBoard[i][j] = true;
					int[] black_loc = { i, j };
					allBlacks.push(black_loc);
				}
			}
		}

		while(!allBlacks.isEmpty()) {
			int[] a = allBlacks.pop();
			int x = a[0], y = a[1];
			if (checkSurroundedByEmpty(a,rows,cols,board)){
				checkBoard[x][y] = false;
				board[x][y] = 'e';
				if (x-1>=0 && board[x-1][y]=='b') {
					int[] newBlack = {x-1,y};
					allBlacks.push(newBlack);
				}
				if (x+1 < rows && board[x+1][y]=='b'){
					int[] newBlack = {x+1,y};
					allBlacks.push(newBlack);
				}
				if (y-1 >=0 && board[x][y-1]=='b'){
					int[] newBlack = {x,y-1};
					allBlacks.push(newBlack);
				}
				if (y+1 < cols && board[x][y+1]=='b'){
					int[] newBlack = {x,y+1};
					allBlacks.push(newBlack);
				}
			}
		}
		for (int i = 0; i < rows ; i ++){
			for (int j = 0; j <cols; j++){
				if (checkBoard[i][j]) return true;
			}
		}

		return false;
	}
	

	public static boolean checkSurroundedByEmpty(int[] a, int rows, int cols, char[][] board) {
		int x = a[0];
		int y = a[1];
		boolean leftOK = false, rightOK = false, aboveOK = false, belowOK = false;
		if (x - 1 >= 0)
			leftOK = (board[x - 1][y] == 'e');
		if (x + 1 < rows)
			rightOK = (board[x + 1][y] == 'e');
		if (y - 1 >= 0)
			belowOK = (board[x][y - 1] == 'e');
		if (y + 1 < cols)
			aboveOK = (board[x][y + 1] == 'e');
		return leftOK || rightOK || aboveOK || belowOK;
	}
}


public class NumMatrix {
	public int[][] matrix, bit;
	// bit contains column sum

	public NumMatrix(int[][] m) {
		matrix = m;
		if (m == null || m.length == 0)
			return;
		int r = m.length;
		int c = m[0].length;
		bit = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				bit[i][j] = constructBIT(m, i, j, bit);
			}
		}

	}

	public int constructBIT(int[][] m, int i, int j, int[][] b) {
		if(i==0) return m[i][j];
		return b[i-1][j] + m[i][j];
	}

	public void update(int row, int col, int val) {
		int r = bit.length;
		int diff = val - matrix[row][col];
		matrix[row][col] = val;
		for (int i = row; i < r; i++) {
			bit[i][col]+=diff;
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		if (bit == null) return 0;
		int bigsum = 0;
		for (int j=col1; j<=col2;j++){
			bigsum+=bit[row2][j];
		}
		if (row1==0) return bigsum;
		int smallsum = 0;
		for (int j=col1; j<=col2;j++){
			smallsum+=bit[row1-1][j];
		}
		return bigsum-smallsum;	
	}
}

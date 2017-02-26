import static org.junit.Assert.*;

import org.junit.Test;


/*
 * notice the complex test requires time efficiency
 * USE BIT!!! binary indexed tree! 
 */

public class NumMatrixTest {

	@Test
	public void update() {
		int [][] matrix = {{3, 0, 1, 4, 2},
				{5, 6, 3, 2, 1},
				{1, 2, 0, 1, 5},
				{4, 1, 0, 1, 7},
				{1, 0, 3, 0, 5}};
		NumMatrix m = new NumMatrix(matrix);
		assertEquals(0,matrix[3][2]);
		m.update(3, 2, 2);
		assertEquals(2,matrix[3][2]);
	}
	
	@Test
	public void testBIT(){
		int [][] matrix = {{3, 0, 1, 4, 2},
				{5, 6, 3, 2, 1},
				{1, 2, 0, 1, 5},
				{4, 1, 0, 1, 7},
				{1, 0, 3, 0, 5}};
		NumMatrix m = new NumMatrix(matrix);
		assertEquals(3,m.bit[0][0]);
		assertEquals(0,m.bit[0][1]);
		assertEquals(1,m.bit[0][2]);
		assertEquals(8,m.bit[1][0]);
		assertEquals(6,m.bit[1][1]);
		assertEquals(4,m.bit[2][2]);
		assertEquals(20,m.bit[4][4]);
		
	}
	
	@Test
	public void sumTest() {
		int [][] matrix = {{3, 0, 1, 4, 2},
				{5, 6, 3, 2, 1},
				{1, 2, 0, 1, 5},
				{4, 1, 0, 1, 7},
				{1, 0, 3, 0, 5}};
		NumMatrix m = new NumMatrix(matrix);
		assertEquals(14,m.sumRegion(0,0,1,1));
		assertEquals(18,m.sumRegion(0,0,1,2));
		assertEquals(10,m.sumRegion(0,1,1,2));
		assertEquals(14,m.sumRegion(1,0,2,1));
		assertEquals(11,m.sumRegion(1, 1,2,2));
		assertEquals(8,m.sumRegion(2, 1, 4, 3));
	}
	
	@Test 
	public void sumTest2(){
		int [][] matrix = {{3, 0, 1, 4, 2},
				{5, 6, 3, 2, 1},
				{1, 2, 0, 1, 5},
				{4, 1, 0, 1, 7},
				{1, 0, 3, 0, 5}};
		NumMatrix m = new NumMatrix(matrix);
		m.update(3, 2, 2);
		assertEquals(10,m.sumRegion(2, 1, 4, 3));
		assertEquals(6,m.sumRegion(1, 1, 1, 1));
	}
	
	@Test 
	public void sumTest3(){
		int [][] matrix = {{2,4},{-3,5}};
		NumMatrix m = new NumMatrix(matrix);
		m.update(0, 1, 3);
		m.update(1, 1, -3);
		m.update(0, 1, 1);
		assertEquals(-3,m.sumRegion(0, 0, 1, 1));
		
	}
	
	

}

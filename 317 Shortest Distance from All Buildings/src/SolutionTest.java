import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testBuilding() {
		int[][] grid = { { 1, 0, 2, 0, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 } };
		Building b = new Building(2,2,grid);
		b.constructDistMatrix();
		assertEquals(Integer.MAX_VALUE,b.distMatrix[0][0]);
		assertEquals(3, b.distMatrix[1][0]);
		assertEquals(1, b.distMatrix[2][1]);
	}
	
	@Test 
	public void testSolution1(){
		int[][] grid = { { 1, 0, 2, 0, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 } };
		assertEquals(7, Solution.shortestDistance(grid));
	}
	

	@Test 
	public void testSolution2(){
		int[][] grid = { { 1,1},{0,1} };
		assertEquals(-1, Solution.shortestDistance(grid));
	}

}

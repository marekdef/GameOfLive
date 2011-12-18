package pl.jug.coderetreat.gameoflife;

import org.junit.Before;
import org.junit.Test;

public class IllegalArgumentsTest {
	
	private Algorithm algo;

	@Before
	public void setUp() {
		algo = new Algorithm();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeX() {
		int testBoard[][] = new int[][] {
				{1, 0, 0},
				{0, 0, 0}
		};
		
		algo.countAliveNeighbours(testBoard, -1, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeY() {
		int testBoard[][] = new int[][] {
				{1, 0, 0},
				{0, 0, 0}
		};
		
		algo.countAliveNeighbours(testBoard, 0, -1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testXOutOfBounds() {
		int testBoard[][] = new int[][] {
				{1, 0, 0},
				{0, 0, 0}
		};
		
		algo.countAliveNeighbours(testBoard, 3, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testYOutOfBounds() {
		int testBoard[][] = new int[][] {
				{1, 0, 0},
				{0, 0, 0}
		};
		
		algo.countAliveNeighbours(testBoard, 0, 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullBoard() {
		algo.countAliveNeighbours(null, 0, 0);
	}
	
}

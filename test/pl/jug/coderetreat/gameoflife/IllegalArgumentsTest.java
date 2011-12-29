package pl.jug.coderetreat.gameoflife;

import junit.framework.Assert;

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
	
	@Test
	public void testTooBigValueInCell() {
		int testBoardWithBigValue[][] = new int[][] {
				{0, 1, 0},
				{0, 5, 0}
		};
		
		int testBoardWithNormal[][] = new int[][] {
				{0, 1, 0},
				{0, 1, 0}
		};
				
		int countAliveNeighboursBigValue = algo.countAliveNeighbours(testBoardWithBigValue, 1, 1);
		int countAliveNeighboursNormalValue = algo.countAliveNeighbours(testBoardWithNormal, 1, 1);
		
		Assert.assertEquals(1, countAliveNeighboursBigValue);
		Assert.assertEquals(1, countAliveNeighboursNormalValue);
	}
	
	@Test
	public void testDeadInCenter() {
		int testBoardOneNeighbour[][] = new int[][] {
				{1, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		};
		
		int testBoardAllZero[][] = new int[][] {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		};
		
		int countAliveNeighboursOneNeighbour = algo.countAliveNeighbours(testBoardOneNeighbour, 1, 1);
		
		int countAliveNeighboursZeroNeighbour = algo.countAliveNeighbours(testBoardAllZero, 1, 1);
		
		Assert.assertEquals(1, countAliveNeighboursOneNeighbour);
		Assert.assertEquals(0, countAliveNeighboursZeroNeighbour);
	}
	
}


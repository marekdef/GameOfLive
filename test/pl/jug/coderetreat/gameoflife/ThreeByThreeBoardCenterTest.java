package pl.jug.coderetreat.gameoflife;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ThreeByThreeBoardCenterTest {

	private Algorithm algo;

	@Before
	public void setUp() {
		algo = new Algorithm();
	}

	@Test
	public void testCountNeighboursZero() {
		int testBoard[][] = new int[][] {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		};
		
		int countNeighbours = algo.countAliveNeighbours(testBoard, 1, 1);
		
		Assert.assertEquals(0, countNeighbours);
	}
	
	@Test
	public void testCountNeighboursZeroOnAliveCell() {
		int testBoard[][] = new int[][] {
				{0, 0, 0},
				{0, 1, 0},
				{0, 0, 0}
		};
		
		int countNeighbours = algo.countAliveNeighbours(testBoard, 1, 0);
		
		Assert.assertEquals(0, countNeighbours);
	}
	
	@Test
	public void testCountNeighboursOneOnAliveCell() {
		int testBoard[][] = new int[][] {
				{1, 0, 0},
				{0, 1, 0},
				{0, 0, 0}
		};
		
		int countNeighbours = algo.countAliveNeighbours(testBoard, 1, 1);
		
		Assert.assertEquals(1, countNeighbours);
	}

}

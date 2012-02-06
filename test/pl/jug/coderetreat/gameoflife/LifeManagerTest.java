package pl.jug.coderetreat.gameoflife;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LifeManagerTest {

	private Algorithm algo;
	
	@Before
	public void setUp() throws Exception {
		algo = new Algorithm();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKillByLoneliness() {
		int[][] testBoard = new int[][] {
				{0, 0, 0},
				{0, 1, 0},
				{0, 0, 0}
		};
		
		algo.calculateLiving(testBoard, 1, 1);
		int cellAfter = testBoard[1][1];
		
		assertEquals(0, cellAfter);
		
		testBoard = new int[][] {
				{0, 0, 0},
				{0, 1, 0},
				{0, 1, 0}
		};
		
		algo.calculateLiving(testBoard, 1, 1);
		cellAfter = testBoard[1][1];
		
		assertEquals(0, cellAfter);
	}
	
	@Test
	public void testNoChange() {
		int[][] testBoard = new int[][] {
				{0, 0, 0},
				{0, 1, 0},
				{1, 0, 1}
		};
		
		algo.calculateLiving(testBoard, 1, 1);
		int cellAfter = testBoard[1][1];
		assertEquals(1, cellAfter);
		
		testBoard = new int[][] {
				{0, 1, 0},
				{0, 1, 0},
				{1, 0, 1}
		};
		
		algo.calculateLiving(testBoard, 1, 1);
		cellAfter = testBoard[1][1];
		assertEquals(1, cellAfter);
	}
	
	@Test
	public void testTooManyNeighbours() {
		int[][] testBoard = new int[][] {
				{1, 0, 0},
				{0, 1, 1},
				{1, 0, 1}
		};
		
		algo.calculateLiving(testBoard, 1, 1);
		int cellAfter = testBoard[1][1];
		assertEquals(0, cellAfter);
	}

}

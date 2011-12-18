package pl.jug.coderetreat.gameoflife;

public class Algorithm {

	public int countAliveNeighbours(int[][] testBoard, int i, int j) {
		if(testBoard == null) {
			throw new IllegalArgumentException("Board not initialized");
		}
		
		if(i < 0 || j < 0 || i >= testBoard.length || j >= testBoard[0].length) {
			throw new IllegalArgumentException(String.format("Coordinates %d %d out of bounds %d %d", i, j, testBoard.length, testBoard[0].length));
		}
		
		int result = -1;
		
		int sX, sY, eX, eY; // start X and Y, end X and Y
		
		if(i == 0) {
			sX = 0;
		} else {
			sX = i - 1;
		}
		
		if(j == 0) {
			sY = 0;
		} else {
			sY = j - 1;
		}
		
		if(i == testBoard.length - 1) {
			eX = testBoard.length -1;
		} else {
			eX = i + 1;
		}
		
		if(j == testBoard[0].length - 1) {
			eY = testBoard[0].length - 1;
		} else {
			eY = j + 1;
		}
		
		return result;		
	}

}

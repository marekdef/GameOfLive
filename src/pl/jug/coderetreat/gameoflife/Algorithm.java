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
		
		int sX = Math.max(0, i - 1);
		int sY = Math.max(0, j - 1);
		int eX = Math.min(testBoard.length -1, i + 1);
		int eY = Math.min(testBoard[0].length, j + 1);
		
		for(int r = sY; r <= eY; r++) {
			for(int c = sX; c <= eX; c++) {
				result += testBoard[r][c];
			}
		}
		
		if(result < 0) {
			result = 0;
		}
		
		return result;		
	}

}

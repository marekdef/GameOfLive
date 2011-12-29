package pl.jug.coderetreat.gameoflife;

public class Algorithm {

	public int countAliveNeighbours(int[][] testBoard, int row, int column) {
		if(testBoard == null) {
			throw new IllegalArgumentException("Board not initialized");
		}
		
		if(row < 0 || column < 0 || row >= testBoard.length || column >= testBoard[0].length) {
			throw new IllegalArgumentException(String.format("Coordinates %d %d out of bounds %d %d", row, column, testBoard.length, testBoard[0].length));
		}
		
		int result = -1;
		
		int startRow = Math.max(0, row - 1);
		int startColumn = Math.max(0, column - 1);
		int endRow = Math.min(testBoard.length -1, row + 1);
		int endColumn = Math.min(testBoard[0].length - 1, column + 1);
		
		for(int c = startColumn; c <= endColumn; c++) {
			for(int r = startRow; r <= endRow; r++) {
				result += testBoard[r][c];
			}
		}
		
		if(result < 0) {
			result = 0;
		}
		
		return result;		
	}

}

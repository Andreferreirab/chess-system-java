package boardgame;

// Os atributos e métodos protected o são para que sejam visíveis somente pela camada boardgame, e não por outras camadas, no caso a camada de xadrez, e também pelas subclasses de peças.

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {	
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove (Position position) {
		//hook methods: método concerto fazendo uso de um método abastrato
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		
		for (int i = 0; i < mat.length ; i++ ) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}

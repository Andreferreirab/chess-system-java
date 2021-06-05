package boardgame;

// Os atributos e m�todos protected o s�o para que sejam vis�veis somente pela camada boardgame, e n�o por outras camadas, no caso a camada de xadrez, e tamb�m pelas subclasses de pe�as.

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
		//hook methods: m�todo concerto fazendo uso de um m�todo abastrato
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

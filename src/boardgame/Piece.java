package boardgame;

// Os atributos e m�todos protected o s�o para que sejam vis�veis somente pela camada boardgame, e n�o por outras camadas, no caso a camada de xadrez, e tamb�m pelas subclasses de pe�as.

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {	
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}	
}

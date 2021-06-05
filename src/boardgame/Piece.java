package boardgame;

// Os atributos e métodos protected o são para que sejam visíveis somente pela camada boardgame, e não por outras camadas, no caso a camada de xadrez, e também pelas subclasses de peças.

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

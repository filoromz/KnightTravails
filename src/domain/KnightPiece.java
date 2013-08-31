package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a Knight chess piece.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 10:20 PM
 */
public class KnightPiece extends ChessPiece
{
	public KnightPiece( boolean isWhite, ChessPosition position, ChessPiece prev )
	{
		super( isWhite, position, prev );
	}

	public KnightPiece( boolean isWhite, String position )
	{
		super( isWhite, new ChessPosition( (int) position.charAt( 0 ), Integer.parseInt( String.valueOf( position.charAt( 1 ) ) ) ), null );
	}

	public List<BoardGamePiece> getNeighbours()
	{
		List<BoardGamePiece> neighbours = new ArrayList<BoardGamePiece>();

		int x = m_position.getX();
		int y = m_position.getY();

		//Calculate the possible '8' positions of the Knight piece.
		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x + 2, y + 1 ), this ) );
		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x - 2, y + 1 ), this ) );

		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x + 2, y - 1 ), this ) );
		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x - 2, y - 1 ), this ) );

		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x + 1, y + 2 ), this ) );
		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x - 1, y - 2 ), this ) );

		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x + 1, y + 2 ), this ) );
		neighbours.add( new KnightPiece( m_isWhite, new ChessPosition( x - 1, y - 2 ), this ) );
		return neighbours;
	}
}

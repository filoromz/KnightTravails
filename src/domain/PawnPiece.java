package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a Pawn chess piece.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 30/08/13 12:25 AM
 */
public class PawnPiece extends ChessPiece
{
	public PawnPiece( boolean isWhite, ChessPosition position, ChessPiece previous )
	{
		super( isWhite, position, previous );
	}

	public PawnPiece( boolean isWhite, String position )
	{
		super( isWhite, new ChessPosition( (int) position.charAt( 0 ), Integer.parseInt( String.valueOf( position.charAt( 1 ) ) ) ), null );
	}

	public List<BoardGamePiece> getNeighbours()
	{
		List<BoardGamePiece> neighbours = new ArrayList<BoardGamePiece>();

		int x = m_position.getX();
		int y = m_position.getY();

		//Calculate the 2 positions depending on the colour (assume white is at the bottom)
		if( m_isWhite )
		{
			neighbours.add( new PawnPiece( m_isWhite, new ChessPosition( x, y + 1 ), this ) );
			neighbours.add( new PawnPiece( m_isWhite, new ChessPosition( x, y + 2 ), this ) );
		}
		else
		{
			neighbours.add( new PawnPiece( m_isWhite, new ChessPosition( x, y - 1 ), this ) );
			neighbours.add( new PawnPiece( m_isWhite, new ChessPosition( x, y - 2 ), this ) );
		}

		return neighbours;
	}
}

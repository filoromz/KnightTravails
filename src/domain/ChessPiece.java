package domain;

/**
 * Abstract class ChessPiece which will store common features related to a chess piece.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 30/08/13 12:38 AM
 */
public abstract class ChessPiece implements BoardGamePiece
{
	boolean m_isWhite;
	ChessPosition m_position;
	ChessPiece m_prevPiece;

	public ChessPiece( boolean isWhite, ChessPosition position, ChessPiece prev )
	{
		m_isWhite = isWhite;
		m_position = position;
		m_prevPiece = prev;
	}

	public Position getCoordinates()
	{
		return m_position;
	}

	public BoardGamePiece getPreviousPiece()
	{
		return m_prevPiece;
	}


	public boolean equals( Object obj )
	{
		if( obj instanceof ChessPiece )
		{
			ChessPosition position = (ChessPosition) ( (ChessPiece) obj ).getCoordinates();
			return m_position.getX()==position.getX() && m_position.getY()==position.getY();
		}
		return false;
	}

	public int hashCode()
	{
		return m_position.getX()*17 + m_position.getY()*31;
	}

}

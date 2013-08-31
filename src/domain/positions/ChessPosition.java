package domain.positions;

/**
 * A ChessPosition concrete class which represents the co-ordinates of a chess piece.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 10:25 PM
 */
public class ChessPosition implements Position
{
	private int m_x;
	private int m_y;

	public ChessPosition( final int a, final int b )
	{
		m_x = a;
		m_y = b;
	}

	public String toString()
	{
		return Character.toUpperCase( (char) m_x ) + "" + m_y;
	}

	public int getX()
	{
		return m_x;
	}

	public int getY()
	{
		return m_y;
	}
}

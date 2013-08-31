package display;

import domain.pieces.BoardGamePiece;

import java.util.List;

/**
 * Display abstract class
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 31/08/13 1:58 PM
 */
public abstract class Display
{
	final List<BoardGamePiece> m_solution;
	final String[] m_args;

	public Display( final String[] args, final List<BoardGamePiece> solution )
	{
		m_args = args;
		m_solution = solution;
	}

	public abstract void displaySolution();
}

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
	List<BoardGamePiece> m_solution;

	public Display( final List<BoardGamePiece> solution )
	{
		m_solution = solution;
	}

	public abstract void displaySolution();
}

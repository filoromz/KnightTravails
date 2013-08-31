package algorithms;

import domain.boards.BoardLayout;
import domain.pieces.BoardGamePiece;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Abstract class MoveSolver. This class will contain any common methods that need to be implemented
 * by subclasses to solve a particular move problem.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 30/08/13 10:07 PM
 */
public abstract class MoveSolver
{
	final BoardGamePiece m_startPiece;
	final BoardGamePiece m_endPiece;
	final BoardLayout m_board;
	final Queue<BoardGamePiece> m_piecesToCheck = new LinkedBlockingQueue<BoardGamePiece>();
	final Set<BoardGamePiece> m_seenPieces = new HashSet<BoardGamePiece>();
	final List<BoardGamePiece> m_solution = new ArrayList<BoardGamePiece>();

	public MoveSolver( final BoardGamePiece startPiece, final BoardGamePiece endPiece, final BoardLayout board )
	{
		m_startPiece = startPiece;
		m_endPiece = endPiece;
		m_board = board;
	}

	public abstract List<BoardGamePiece> solve();
}

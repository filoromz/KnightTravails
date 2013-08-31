package algorithms;

import domain.BoardGamePiece;
import domain.BoardLayout;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Abstract class MoveSolver. This class will contain any common classes that need to be implemented
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
	BoardGamePiece m_startPiece;
	BoardGamePiece m_endPiece;
	BoardLayout m_board;
	Queue<BoardGamePiece> m_piecesToCheck = new LinkedBlockingQueue<BoardGamePiece>();
	Set<BoardGamePiece> m_seenPieces = new HashSet<BoardGamePiece>();
	List<BoardGamePiece> m_solution = new ArrayList<BoardGamePiece>();

	public MoveSolver( BoardGamePiece startPiece, BoardGamePiece endPiece, BoardLayout board )
	{
		m_startPiece = startPiece;
		m_endPiece = endPiece;
		m_board = board;
	}

	public abstract void solve();

	public abstract void printSolution();

}

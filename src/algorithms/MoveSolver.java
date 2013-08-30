package algorithms;

import domain.BoardGamePiece;
import domain.BoardLayout;

import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: Rommel
 * Date: 30/08/13
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class MoveSolver {
    BoardGamePiece m_startPiece;
    BoardGamePiece m_endPiece;
    BoardLayout m_board;
    Queue<BoardGamePiece> m_piecesToCheck= new LinkedBlockingQueue<BoardGamePiece>();
    Set<BoardGamePiece> m_seenPieces= new HashSet<BoardGamePiece>();

    public MoveSolver(BoardGamePiece startPiece, BoardGamePiece endPiece, BoardLayout board) {
        m_startPiece = startPiece;
        m_endPiece= endPiece;
        m_board= board;
    }

    public abstract List<BoardGamePiece> solve();

}

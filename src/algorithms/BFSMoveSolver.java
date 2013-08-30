package algorithms;

import domain.BoardGamePiece;
import domain.BoardLayout;

import java.util.*;

/**
 * Implementation of a solver for the KnightsTravails
 * using the Breadth First Search (BFS) approach.
 *
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:44 PM
 */
public class BFSMoveSolver extends MoveSolver {
    public BFSMoveSolver(BoardGamePiece startPiece, BoardGamePiece endPiece, BoardLayout board) {
        super(startPiece, endPiece, board);
    }

    public List<BoardGamePiece> solve() {
        //lets add the starting node..
        m_piecesToCheck.add(m_startPiece);
        m_seenPieces.add(m_startPiece);
        BoardGamePiece tempPiece;

        while (!m_piecesToCheck.isEmpty()) {
            System.out.println("Pieces to check not empty yet..");
            tempPiece = m_piecesToCheck.remove();
            System.out.println("Piece to check: " + tempPiece.getCoordinates());

            if (tempPiece.equals(m_endPiece)) {
                System.out.println("Huzzah! " + tempPiece.getCoordinates() + "==" + m_endPiece.getCoordinates());
                return retrieveHistory(tempPiece);
            }

            for (BoardGamePiece neighbour : tempPiece.getNeighbours()) {
                if (!m_seenPieces.contains(neighbour) && m_board.isValidPosition(neighbour)) {
                    System.out.println("Adding node to queue: " + neighbour.getCoordinates() + " and its parent node is: " + neighbour.getPreviousPiece().getCoordinates());
                    m_piecesToCheck.add(neighbour);
                    m_seenPieces.add(neighbour); // so we don't add it again to the queue.
                }
            }
        }
        return new ArrayList<BoardGamePiece>();
    }

    private List<BoardGamePiece> retrieveHistory(BoardGamePiece piece) {
        List<BoardGamePiece> history = new ArrayList<BoardGamePiece>();
        history.add(piece);
        BoardGamePiece prevPiece = piece.getPreviousPiece();
        while (prevPiece != null) {
            //don't add the starting node.
            if (prevPiece.getPreviousPiece() != null) {
                history.add(prevPiece);
            }
            prevPiece = prevPiece.getPreviousPiece();
        }
        Collections.reverse(history);
        return history;
    }
}

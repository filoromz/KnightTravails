package domain;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:42 PM
 */
public interface BoardGamePiece {
    public List<BoardGamePiece> getNeighbours();

    public Position getCoordinates();

    public BoardGamePiece getPreviousPiece();

}

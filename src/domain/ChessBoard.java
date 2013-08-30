package domain;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:36 PM
 */
public class ChessBoard implements BoardLayout {
    public static final int ALPHABET_START_INDEX = 96; //96 == 'a'

    public static final int MIN_ROW = 1;
    public static final int MAX_ROW = 8;
    public static final int MIN_COL = ALPHABET_START_INDEX;
    public static final int MAX_COL = ALPHABET_START_INDEX+MAX_ROW;

    public boolean isValidPosition(BoardGamePiece piece) {
        ChessPosition pos = (ChessPosition) piece.getCoordinates();
        return pos.getX() >= MIN_COL && pos.getX() <= MAX_COL && pos.getY() >= MIN_ROW && pos.getY() <= MAX_ROW;
    }
}

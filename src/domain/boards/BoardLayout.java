package domain.boards;

import domain.pieces.BoardGamePiece;

/**
 * BoardLayout interface which will have common methods of different board games which can be used
 * to aid/assist in solving the KnightsTravails problem.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 30/08/13 12:41 AM
 */
public interface BoardLayout
{
	public boolean isValidPosition( final BoardGamePiece node );
}

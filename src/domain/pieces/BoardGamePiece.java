package domain.pieces;


import domain.positions.Position;

import java.util.List;

/**
 * BoardGamePiece interface. This can be implemented for future extension of the KnightsTravails problem
 * to board game pieces other than chess! :)
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:42 PM
 */
public interface BoardGamePiece
{
	public List<BoardGamePiece> getNeighbours();

	public Position getPosition();

	public BoardGamePiece getPreviousPiece();
}

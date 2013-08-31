package display;

import domain.pieces.BoardGamePiece;

import java.util.List;

/**
 * SimpleDisplay concrete class which simply prints out the solution
 * to the KnightTravails problem to standard output (ie. console).
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 31/08/13 1:56 PM
 */
public class SimpleDisplay extends Display
{
	public SimpleDisplay( final List<BoardGamePiece> solution )
	{
		super( solution );
	}

	public void displaySolution()
	{
		System.out.print( "Solution: " );
		if( m_solution.isEmpty() )
		{
			System.out.print( "IMPOSSIBLE!" );
		}
		else
		{
			for( BoardGamePiece piece : m_solution )
			{
				System.out.print( piece.getPosition() + " " );
			}
		}
		System.out.println();
	}
}

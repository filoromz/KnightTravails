package algorithms;

import domain.BoardGamePiece;
import domain.BoardLayout;

import java.util.Collections;

/**
 * Implementation of a solver for the KnightsTravails
 * using the Breadth First Search (BFS) approach.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:44 PM
 */
public class BFSMoveSolver extends MoveSolver
{
	public BFSMoveSolver( BoardGamePiece startPiece, BoardGamePiece endPiece, BoardLayout board )
	{
		super( startPiece, endPiece, board );
	}

	public void solve()
	{
		//lets add the starting node..
		m_piecesToCheck.add( m_startPiece );
		m_seenPieces.add( m_startPiece );
		BoardGamePiece tempPiece;

		while( !m_piecesToCheck.isEmpty() )
		{
			System.out.println( "Pieces to check not empty yet.." );
			tempPiece = m_piecesToCheck.remove();
			System.out.println( "Piece to check: " + tempPiece.getCoordinates() );

			if( tempPiece.equals( m_endPiece ) )
			{
				System.out.println( "Huzzah! " + tempPiece.getCoordinates() + "==" + m_endPiece.getCoordinates() );
				retrieveHistory( tempPiece );
			}

			for( BoardGamePiece neighbour : tempPiece.getNeighbours() )
			{
				if( !m_seenPieces.contains( neighbour ) && m_board.isValidPosition( neighbour ) )
				{
					System.out.println( "Adding node to queue: " + neighbour.getCoordinates() + " and its parent node is: " + neighbour.getPreviousPiece().getCoordinates() );
					m_piecesToCheck.add( neighbour );
					m_seenPieces.add( neighbour ); // so we don't add it again to the queue.
				}
			}
		}
	}

	@Override
	public void printSolution()
	{
		System.out.println( "Solution: " );
		if( m_solution.isEmpty() )
		{
			System.out.print( "IMPOSSIBLE!" );
		}
		else
		{
			for( BoardGamePiece piece : m_solution )
			{
				System.out.print( piece.getCoordinates() + " " );
			}
		}
		System.out.println();
	}

	private void retrieveHistory( BoardGamePiece piece )
	{
		m_solution.add( piece );
		BoardGamePiece prevPiece = piece.getPreviousPiece();
		while( prevPiece!=null )
		{
			//don't add the starting node.
			if( prevPiece.getPreviousPiece()!=null )
			{
				m_solution.add( prevPiece );
			}
			prevPiece = prevPiece.getPreviousPiece();
		}
		Collections.reverse( m_solution );
	}
}

package algorithms;

import domain.boards.BoardLayout;
import domain.pieces.BoardGamePiece;

import java.util.Collections;
import java.util.List;

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
	public BFSMoveSolver( final BoardGamePiece startPiece, final BoardGamePiece endPiece, final BoardLayout board )
	{
		super( startPiece, endPiece, board );
	}

	public List<BoardGamePiece> solve()
	{
		//lets add the starting piece
		m_piecesToCheck.add( m_startPiece );
		m_seenPieces.add( m_startPiece );
		BoardGamePiece tempPiece;

		while( !m_piecesToCheck.isEmpty() )
		{
//			System.out.println( "Pieces to check not empty yet.." );
			tempPiece = m_piecesToCheck.remove();
//			System.out.println( "Piece to check: " + tempPiece.getPosition() );

			if( tempPiece.equals( m_endPiece ) )
			{
//				System.out.println( "Huzzah! " + tempPiece.getPosition() + "==" + m_endPiece.getPosition() );
				populateSolution( tempPiece );
			}

			for( BoardGamePiece neighbour : tempPiece.getNeighbours() )
			{
				if( !m_seenPieces.contains( neighbour ) && m_board.isValidPosition( neighbour ) )
				{
//					System.out.println( "Adding piece to queue: " + neighbour.getPosition() + " and its parent piece is: " + neighbour.getPreviousPiece().getPosition() );
					m_piecesToCheck.add( neighbour );
					// so we don't add it again to the queue.
					m_seenPieces.add( neighbour );
				}
			}
		}
		return m_solution;
	}

	private void populateSolution( final BoardGamePiece piece )
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

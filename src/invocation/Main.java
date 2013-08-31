package invocation;

import algorithms.BFSMoveSolver;
import algorithms.MoveSolver;
import domain.ChessBoard;
import domain.KnightPiece;

/**
 * Main invocation class which will create an instance of a MoveSolver
 * and solve the KnightsTravails problem.
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:43 PM
 */
public class Main
{
	public static void main( String[] args )
	{
		MoveSolver solver = new BFSMoveSolver( new KnightPiece( true, args[0] ), new KnightPiece( true, args[1] ), new ChessBoard() );

		System.out.println( "Starting Position: " + args[0].toUpperCase() + " Ending Position: " + args[1].toUpperCase() );

		solver.solve();
		solver.printSolution();
	}
}

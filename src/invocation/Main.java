package invocation;

import algorithms.BFSMoveSolver;
import algorithms.MoveSolver;
import display.Display;
import display.SimpleDisplay;
import domain.boards.BoardLayout;
import domain.boards.ChessBoard;
import domain.pieces.BoardGamePiece;
import domain.pieces.chess.KnightPiece;

import java.util.List;

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
		BoardGamePiece startPiece = new KnightPiece( true, args[0] );           //create a Knight chess piece that is White and has position args[0].
		BoardGamePiece endPiece = new KnightPiece( true, args[1] );             //create a Knight chess piece that is White and has position args[1].
		BoardLayout board = new ChessBoard();                                   //create a standard 8x8 chess board
		MoveSolver solver = new BFSMoveSolver( startPiece, endPiece, board );   //create a solver which will solve using the BFS algorithm.

		System.out.println( "Starting Position: " + args[0].toUpperCase() + " Ending Position: " + args[1].toUpperCase() );

		List<BoardGamePiece> solution = solver.solve();

		//How should we display the solution?
		Display display = new SimpleDisplay( solution );
		display.displaySolution();
	}
}

package invocation;

import algorithms.BFSMoveSolver;
import algorithms.MoveSolver;
import domain.BoardGamePiece;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 9:43 PM
 */
public class Main
{
    public static void main(String[] args)
    {
        MoveSolver solver= new BFSMoveSolver(new domain.KnightPiece(true, args[0]), new domain.KnightPiece(true, args[1]), new domain.ChessBoard());
        //MoveSolver solver= new BFSMoveSolver(new PawnPiece(true, args[0]), new PawnPiece(true, args[1]), new ChessBoard());

        System.out.println("Starting Position: " + args[0].toUpperCase() + " Ending Position: " + args[1].toUpperCase());
        List<BoardGamePiece> solution= solver.solve();

        System.out.println("Solution: ");
        if( solution.isEmpty() )
        {
            System.out.print("IMPOSSIBLE!");
        }
        else
        {
            for( BoardGamePiece piece : solution )
            {
                System.out.print( piece.getCoordinates() + " ");
            }
        }
        System.out.println();
    }
}

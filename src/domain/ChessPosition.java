package domain;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Rommel Vergara (308149777)
 * @version 1.0
 * @since 29/08/13 10:25 PM
 */
public class ChessPosition implements Position {
    int m_x;
    int m_y;

    public ChessPosition(int a, int b) {
        m_x = a;
        m_y = b;
    }

    public String toString() {
        return Character.toUpperCase((char) m_x) + "" + m_y;
    }

    public int getX() {
        return m_x;
    }

    public int getY() {
        return m_y;
    }
}

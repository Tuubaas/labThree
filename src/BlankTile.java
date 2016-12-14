import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Manages painting of a special area of the screen.
 *
 * Whenever the object should paint itself, it is told
 * what size and position that should be used to paint it.
 */
public class BlankTile implements GameTile {

    /**
     * {@inheritDoc}
     */
    @Override
    public void draw(Graphics g, int x, int y, Dimension d) {

    }
}
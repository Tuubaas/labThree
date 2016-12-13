import java.awt.Dimension;
import java.awt.List;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public abstract class GameUtils implements GameModel {
    
        protected ArrayList<PropertyChangeListener> observers = new ArrayList<PropertyChangeListener>();
    
        /**
         * Set the tile on a specified position in the gameboard.
         * 
         * @param pos
         *            The position in the gameboard matrix.
         * @param tile
         *            The type of tile to paint in specified position
         */
        protected void setGameboardState(final Position pos, final GameTile tile) {
            setGameboardState(pos.getX(), pos.getY(), tile);
        }

        /**
         * Set the tile on a specified position in the gameboard.
         * 
         * @param x
         *            Coordinate in the gameboard matrix.
         * @param y
         *            Coordinate in the gameboard matrix.
         * @param tile
         *            The type of tile to paint in specified position
         */
        protected abstract void setGameboardState(final int x, final int y,
                final GameTile tile);

        /**
         * Returns the GameTile in logical position (x,y) of the gameboard.
         * 
         * @param pos
         *            The position in the gameboard matrix.
         */
        public GameTile getGameboardState(final Position pos) {
            return getGameboardState(pos.getX(), pos.getY());
        }

        /**
         * Returns the GameTile in logical position (x,y) of the gameboard.
         * 
         * @param x
         *            Coordinate in the gameboard matrix.
         * @param y
         *            Coordinate in the gameboard matrix.
         */
        public abstract GameTile getGameboardState(final int x, final int y);

        /**
         * Returns the size of the gameboard.
         */
        public abstract Dimension getGameboardSize();

        /**
         * This method is called repeatedly so that the game can update it's state.
         * 
         * @param lastKey
         *            The most recent keystroke.
         */
        public abstract void gameUpdate(int lastKey) throws GameOverException;
    
}

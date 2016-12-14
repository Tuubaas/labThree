import java.beans.PropertyChangeListener;

public interface IObservable {
    /**
     * 
     * @param observer
     */
    public void addObserver(PropertyChangeListener observer);
    
    /**
     * 
     * @param observer
     */
    public void removeObserver(PropertyChangeListener observer);
}

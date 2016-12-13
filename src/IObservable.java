import java.beans.PropertyChangeListener;

public interface IObservable {
    /**
     * 
     * @param observer
     */
    void addObserver(PropertyChangeListener observer);
    
    /**
     * 
     * @param observer
     */
    void removeObserver(PropertyChangeListener observer);
}

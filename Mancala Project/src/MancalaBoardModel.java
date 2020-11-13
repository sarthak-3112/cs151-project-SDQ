import java.util.ArrayList;
import javax.swing.event.*;

public class MancalaBoardModel {
	int[] playerA;
	int[] playerB;
	ArrayList<ChangeListener> listeners;
	
	/**
	 * Constructs the model and initializes data structures
	 */
	public MancalaBoardModel() {
		playerA = new int[7];
		playerB = new int[7];
		listeners = new ArrayList<ChangeListener>();
		
		//fill slots with 0
		for(int i = 0; i < 7; i++) {
			playerA[i] = 0;
			playerB[i] = 0;
		}
	}
	
	/**
	 * Attach a ChangeListener
	 * @param l the ChangeListener
	 */
	public void attach(ChangeListener l) {
		listeners.add(l);
	}
}

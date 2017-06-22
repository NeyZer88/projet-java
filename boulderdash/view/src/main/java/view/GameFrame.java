package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameFrame extends Jframe implements KeyListener{
	private static final long serialVersionUID = -5222658361778310082L;
	protected IEventPerformer eventPerformer;
	private int keyCode;
	
	public IEventPerformer getIEventPerformer(){
		return eventPerformer;
	}
	
	public void setIEventPerformer (IEventPerformer eventPerformer){
		this.eventPerformer = eventPerformer;
		eventPerformer.setGameFrame(this);
	}

}



	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		
	}

	public void keyReleased(KeyEvent e) {
		keyCode = 0;
		
	}


	public void keyTyped(KeyEvent e) {	

	}

	}}
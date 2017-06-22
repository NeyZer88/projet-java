package view;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import keylistener.TestKeyListener;


public class GameFrame extends JFrame implements KeyListener{
	
	GamePanel GamePanel = new GamePanel();
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
	
	public static void main(String[] args) {
        // build a windows type KeyListener 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                KeyListener frame = new GameFrame();
                ((Window) frame).setVisible(false);
            }
        });
    }


	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		
	}

	public void keyReleased(KeyEvent e) {
		keyCode = 0;
		
	}


	public void keyTyped(KeyEvent e) {	
	}
	
	//setter and getters keyCode
	public int getkeyCode(){
		return keyCode;
	}
	
	public void setkeyCode (int keyCode){
		this.keyCode = keyCode;
	}
	}
	
	
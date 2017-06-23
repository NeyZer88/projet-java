package view;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * class GameFrame instantiate and use the frame to display a file
 * @author VALENTIN
 *
 */
public class GameFrame extends JFrame implements KeyListener{
	
	public GameFrame(view.GamePanel gamePanel, IEventPerformer eventPerformer, int keyCode) throws HeadlessException {
		super();
		GamePanel = gamePanel;
		GameFrame.eventPerformer = eventPerformer;
		GameFrame.keyCode = keyCode;
		
	}

	static GamePanel GamePanel = new GamePanel();
	private static final long serialVersionUID = -5222658361778310082L;
	protected static IEventPerformer eventPerformer;
	private static int keyCode;
	
	public IEventPerformer getIEventPerformer(){
		return eventPerformer;
	}
	
	public void setIEventPerformer (IEventPerformer eventPerformer){
		GameFrame.eventPerformer = eventPerformer;
		eventPerformer.setGameFrame(this);
	}
	
	public void gameFrame(String[] args)
    {
            JFrame frame = new JFrame("boulderdash");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            GamePanel panel = new view.GamePanel();
            
                    
            panel.setLayout(new GridLayout(3,1));
            
            frame.add(panel);
            
            /**
             * define the size of the frame and his visibility
             */
            frame.setSize(getWidth(), getHeight());
            frame.setVisible(true);
            
    }
	
	public static void main(String[] args) {
        /**
         *  build a windows type KeyListener 
         */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                KeyListener frame = new GameFrame(GamePanel, eventPerformer, keyCode);
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
		/**
		 * do nothing
		 */
	}
	
	//setter and getters keyCode
	
	public int getkeyCode(){
		return keyCode;
	}
	
	public void setkeyCode (int keyCode){
		GameFrame.keyCode = keyCode;
	}

	public GamePanel getGamePanel() {
		return GamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		GamePanel = gamePanel;
	}

	public IEventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(IEventPerformer eventPerformer) {
		GameFrame.eventPerformer = eventPerformer;
	}

	public int getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(int keyCode) {
		GameFrame.keyCode = keyCode;
	}

	public void setGameFrame(ViewFacade viewFacade) {
		
	}
	}
	
	
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameFrame implements KeyListener{
	
	

	public void GameFrame(){
		this.setTitle ("boulderdash");
	}
	
	
	public class TestKeyListener extends JFrame {
	    private static final long serialVersionUID = -5222658361778310082L;
	 
	    private TestKeyListener() {
	        // création de la fenêtre
	        super("TestKeyListener");
	         
	        // ajout d'un seul composant dans cette fenêtre : un JLabel
	        JLabel label = new JLabel("tape pour test");
	        add(label, BorderLayout.CENTER);
	         
	     // ajoute un écouteur d'événements personnalisé à la fenêtre
	        addKeyListener(new TitreKeyListener(label));
	        
	

}



	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	

	}

	}}
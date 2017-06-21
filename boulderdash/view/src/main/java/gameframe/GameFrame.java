package gameframe;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

import keylistener.TitreKeyListener;

public class Gameframe {
	
	

	public void GameFrame(){
		this.setTitle ("boulderdash");
	}
	
	public void keyPressed(){
		
	}
	
	public void keyReleased(){
		
	}
	
	public void keyTyped(){
		
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

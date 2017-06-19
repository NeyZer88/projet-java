package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame {
	public fenetre(){
		this.setTitle("Ma première fenêtre Java");
	    this.setSize(400, 100);
	    this.setLocationRelativeTo(null);               
	 
	    //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(pan);               
	    this.setVisible(true);
	  }       
	}


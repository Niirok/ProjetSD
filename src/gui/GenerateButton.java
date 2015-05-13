package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class GenerateButton extends JButton implements ActionListener {
    private MainFrame mainFrame;
    
    GenerateButton(String nom, MainFrame mf){
	super(nom);
	this.mainFrame = mf;
	addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	//faire le traitement du fichier
    }
}

package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
    private JTextArea resultDisplay,databaseDisplay,descriptionDisplay;
    private JButton bGenerate,bQuit;
    
    public MainFrame(){
        this.setSize(600, 600); // hauteur et largueur de la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ferme le programme au moement de la fermeture de l'interface
        this.setResizable(false); //Impose une taille définitive
        this.setTitle("You may also like...");
        Container cf = this.getContentPane();
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Current DataBase"));
        databaseDisplay = new JTextArea(1,2); //zone de texte avec 1 ligne et 2colonnes
        p1.add(databaseDisplay);
        cf.add("West", p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEADING));
        p2.add(new JLabel("Film description: "));
        descriptionDisplay = new JTextArea();
        p2.add(descriptionDisplay);
        cf.add("North",p2);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.add(new JLabel("Now you can watch: "));
        resultDisplay = new JTextArea();
        p3.add(resultDisplay);
        cf.add("Center",p3);
        
        JPanel p4 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.TRAILING));
        bGenerate = new JButton("Generate");
        bQuit = new JButton("Quit");
        p4.add(bGenerate);
        p4.add(bQuit);
        cf.add("South",p4);
    }
}





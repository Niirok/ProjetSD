package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
    private JFileChooser choix; //Permet à l'utilisateur de choisir la base de données
    private int retour = 0; //Retour sur la validité du path du chemin choisi
    private String path = "";//chemin du fichier choisi
    
    //String temporaire contenant la chaine a afficher sur l'ecran principal.
    private String stringDB = "";//String temporaire contenant la chaine a afficher sur l'ecran des statistiques.
    private String Description = "";// chaine de description des films
    private JPanel container = new JPanel();
    private JTextArea databaseDisplay = new JTextArea(19,28);//Ecran principal ecran
    private JTextArea descriptionDisplay = new JTextArea(8,9);//Ecran des stats 
    private JTextArea resultDisplay = new JTextArea(3,3);
    //private JButton bGenerate,bQuit;
    
    public MainFrame(){
	this.setSize(900,500);
	this.setTitle("You may also like...");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	initComposant();//On initialise le conteneur avec tous les composants
	//On ajoute le conteneur
	this.setContentPane(container);
	this.setVisible(true);
	}
    private void initComposant(){
        
	JPanel option = new JPanel();//Initialistion du JPanel qui va contenir nos boutons
	option.setPreferredSize(new Dimension(360, 625));
	JScrollPane scrollPane = new JScrollPane(databaseDisplay, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//Ajout d'une scrollbar au textarea
	databaseDisplay.setEditable(false);
	
	JButton charge = new JButton("Charger un fichier");//application de la classe chargefichierlistener sur notre bouton
	charge.addActionListener(new ChargeFichierListener());//application de la classe validelistener sur notre bouton
	JButton bGenerate = new JButton("Generate");
	bGenerate.addActionListener(new ValideListener());
	//On ajoute les boutons dans le JPanel	
	option.add(charge);
	option.add(bGenerate);
        
        JPanel panEcran = new JPanel();
	panEcran.add(scrollPane);
	panEcran.setPreferredSize(new Dimension(360, 360));
        
	JPanel descriPanel = new JPanel();
	JLabel titleDesc = new JLabel("Video Description: \n");
        descriPanel.add(titleDesc);
	descriPanel.add(descriptionDisplay);
        descriPanel.setPreferredSize(new Dimension(235, 140));
	descriPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	descriptionDisplay.setEditable(false);
	descriptionDisplay.setText(Description);
        
        JPanel resultPan = new JPanel();
        JLabel titleRslt = new JLabel("Then, you may like: ");
        resultPan.add(titleRslt);
        resultPan.add(resultDisplay);
        resultPan.setPreferredSize(new Dimension(200,200));
        resultDisplay.setEditable(false);
        
        
        //on range tous les panels dans un panel general
        //DescriPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
	container.add(panEcran, BorderLayout.WEST);
        container.add(descriPanel, BorderLayout.NORTH);      
	container.add(resultPan, BorderLayout.CENTER);
	container.add(option, BorderLayout.SOUTH);
        
	}
    class ChargeFichierListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			choix = new JFileChooser(new File("."));
			choix.setDialogTitle("Choisir un fichier");
			int retour = choix.showOpenDialog(null);
			if (retour == JFileChooser.APPROVE_OPTION){
				path = choix.getSelectedFile().getAbsolutePath(); 
                                System.out.println("prout");
                        
			}
                       
		}
	}
    class ValideListener implements ActionListener{
		//On gere l'appuie sur le bouton "lancer la résolution"
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				//appel de NineSquarePuzzle pour resoudre le puzzle
				interfaceresolve is = new interfaceresolve(getMainFrame());
                                
                                is.resolve(getMainFrame());
				//ecran.setText(chaineEcran);
				//stats.setText(chaineStats);
			}catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Nom du fichier incorrect, veuillez reessayer !");
			}catch (IOException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}   
                    }
	}
    
    public String getNomFichier(){
		return path;
	}
    public void setStringDB(String chaine){
		stringDB = chaine;
	}
    public MainFrame getMainFrame(){
		return this;
	}
    public void setChaineStatistique(String description) {
		this.Description = description;
	}      
    public JTextArea getDataBaseDisplay(){
            return this.databaseDisplay;
        }
    }





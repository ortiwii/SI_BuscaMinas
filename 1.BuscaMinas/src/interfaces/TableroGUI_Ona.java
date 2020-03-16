package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import pack1.FondoSwing;

public class TableroGUI_Ona extends JFrame {
	
	private JPanel panelGelaxkak;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroGUI_Ona frame = new TableroGUI_Ona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel getPanelGelaxkak() {
		if (panelGelaxkak == null) {
			panelGelaxkak = new JPanel();
			panelGelaxkak.setLayout(new GridBagLayout());
		}
		return panelGelaxkak;
	}
	private void gelaxkakSortu (int nLerro, int nZutabe) throws IOException {
		for (int y = 0; y < nLerro; y++) {
			for (int x = 0; x < nZutabe; x++) {
				JLabel gelaxkaBerri = gelaxkaSortu();
				getPanelGelaxkak().add(
					gelaxkaBerri,
					new GridBagConstraints(x, y, 1, 1, 0.0, 0.0,
								     GridBagConstraints.CENTER,
								     GridBagConstraints.NONE, 
	                                               new Insets(0, 0, 0, 0), 0, 0));
			}
		}
	}
	private JLabel gelaxkaSortu() throws IOException {
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createLoweredBevelBorder());
		FondoSwing cara = new FondoSwing(ImageIO.read(new File("C:/Users/Gorka/git/SI_BuscaMinas/1.BuscaMinas/src/irudiak/tablero.gif")));
        label.setBorder(cara);
		label.setMaximumSize(new Dimension(20, 20));
		label.setMinimumSize(new Dimension(18, 18));
		label.setSize(new Dimension(18, 18));
		//Listenerra gehitu
		return label;
	}

	public TableroGUI_Ona() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		try {
			this.gelaxkakSortu(10, 7);
		} catch (IOException e) {
			e.printStackTrace();
		}
		panelGelaxkak.setVisible(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getPanelGelaxkak(), BorderLayout.CENTER);
	}
}

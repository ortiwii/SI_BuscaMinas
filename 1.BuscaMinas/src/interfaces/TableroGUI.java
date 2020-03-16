package interfaces;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import pack1.FondoSwing;

import javax.swing.JSplitPane;
import java.awt.Panel;

public class TableroGUI extends JFrame {
	
	private JPanel panelGelaxkak;
	private JPanel minaKopurua;
	private JPanel aurpegia;
	private JPanel denbora;
	private JPanel gelaxkak;
	private JPanel mina_batekoak;
	private JPanel mina_hamarrekoak;
	private JPanel denbora_batekoak;
	private JPanel denbora_hamarrekoak;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroGUI frame = new TableroGUI();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JLabel gelaxkaSortu() {
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createLoweredBevelBorder());
		label.setIcon("C:\\Users\\Gorka\\git\\SI_BuscaMinas\\1.BuscaMinas\\src\\irudiak\\tablero.gif");
		label.setMaximumSize(new Dimension(20, 20));
		label.setMinimumSize(new Dimension(18, 18));
		label.setSize(new Dimension(18, 18));
		//Listenerra gehitu
		return label;
	}
    private JPanel getPanelGelaxkak() {
		if (panelGelaxkak == null) {
			panelGelaxkak = new JPanel();
			panelGelaxkak.setLayout(new GridBagLayout());
		}
		return panelGelaxkak;
	 }
    private void hasieratu (int nLerro, int nZutabe) {
    	for (y = 0; y < nLerro; y++) {
    		for (x = 0; x < nZutabe; x++) {
    			JLabel gelaxkaBerri = gelaxkaSortu();
    			getListaCasillas().add(gelaxkaBerri);
    			getPanelCasillas().add(
    				gelaxkaBerri,
    				new GridBagConstraints(x, y, 1, 1, 0.0, 0.0,
    							     GridBagConstraints.CENTER,
    							     GridBagConstraints.NONE, 
                                                   new Insets(0, 0, 0, 0), 0, 0));
    		}
    	  }

    }

	public TableroGUI() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		getContentPane().setLayout(null);
		getContentPane().add(getMinaKopurua());
		getContentPane().add(getAurpegia());
		getContentPane().add(getDenbora());
		try {
            FondoSwing cara = new FondoSwing(ImageIO.read(new File("C:/Users/Gorka/git/SI_BuscaMinas/1.BuscaMinas/src/irudiak/cara1.gif")));
            this.getAurpegia().setBorder(cara);
            
            FondoSwing zero = new FondoSwing(ImageIO.read(new File("C:/Users/Gorka/git/SI_BuscaMinas/1.BuscaMinas/src/irudiak/n0.gif")));
            this.getDenbora_batekoak().setBorder(zero);
            this.getDenbora_hamarrekoak().setBorder(zero);
            this.getMina_batekoak().setBorder(zero);
            this.getMina_hamarrekoak().setBorder(zero);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

		getContentPane().add(getGelaxkak());
	}
	private JPanel getMinaKopurua() {
		if (minaKopurua == null) {
			minaKopurua = new JPanel();
			minaKopurua.setBounds(30, 34, 80, 40);
			minaKopurua.setLayout(new BorderLayout(0, 0));
			minaKopurua.add(getMina_batekoak(), BorderLayout.WEST);
			minaKopurua.add(getMina_hamarrekoak(), BorderLayout.EAST);
		}
		return minaKopurua;
	}
	private JPanel getAurpegia() {
		if (aurpegia == null) {
			aurpegia = new JPanel();
			aurpegia.setBounds(160, 13, 70, 70);
		}
		return aurpegia;
	}
	private JPanel getDenbora() {
		if (denbora == null) {
			denbora = new JPanel();
			denbora.setBounds(280, 34, 80, 40);
			denbora.setLayout(new BorderLayout(0, 0));
			denbora.add(getDenbora_batekoak(), BorderLayout.WEST);
			denbora.add(getDenbora_hamarrekoak(), BorderLayout.EAST);
		}
		return denbora;
	}
	private JPanel getGelaxkak() {
		if (gelaxkak == null) {
			gelaxkak = new JPanel();
			gelaxkak.setBounds(12, 108, 358, 332);
		}
		return gelaxkak;
	}
	private JPanel getMina_batekoak() {
		if (mina_batekoak == null) {
			mina_batekoak = new JPanel();
			FlowLayout fl_mina_batekoak = (FlowLayout) mina_batekoak.getLayout();
			fl_mina_batekoak.setHgap(20);
		}
		return mina_batekoak;
	}
	private JPanel getMina_hamarrekoak() {
		if (mina_hamarrekoak == null) {
			mina_hamarrekoak = new JPanel();
			FlowLayout fl_mina_hamarrekoak = (FlowLayout) mina_hamarrekoak.getLayout();
			fl_mina_hamarrekoak.setHgap(20);
		}
		return mina_hamarrekoak;
	}
	private JPanel getDenbora_batekoak() {
		if (denbora_batekoak == null) {
			denbora_batekoak = new JPanel();
			FlowLayout fl_denbora_batekoak = (FlowLayout) denbora_batekoak.getLayout();
			fl_denbora_batekoak.setHgap(20);
		}
		return denbora_batekoak;
	}
	private JPanel getDenbora_hamarrekoak() {
		if (denbora_hamarrekoak == null) {
			denbora_hamarrekoak = new JPanel();
			FlowLayout fl_denbora_hamarrekoak = (FlowLayout) denbora_hamarrekoak.getLayout();
			fl_denbora_hamarrekoak.setHgap(20);
		}
		return denbora_hamarrekoak;
	}
}

package interfaces;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
import pack1.GelaxkaEgoera;

import javax.swing.JSplitPane;
import java.awt.Panel;
import java.awt.event.MouseEvent;

public class TableroGUI extends JFrame {
	private JPanel panel;
	private JPanel minaKopurua;
	private JPanel aurpegia;
	private JPanel denbora;
	private JPanel gelaxkak;
	private JButton gelaxka,kaxa;
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

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public TableroGUI() throws IOException {
		initialize();
	}
	private void initialize() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		getContentPane().setLayout(null);
		getContentPane().add(getMinaKopurua());
		getContentPane().add(getAurpegia());
		getContentPane().add(getDenbora());
		getTablero(10,10);
		
		
		
		try {
            FondoSwing cara = new FondoSwing(ImageIO.read(new File("./src/irudiak/cara1.gif")));
            this.getAurpegia().setBorder(cara);
            
            //FondoSwing a=new FondoSwing(ImageIO.read(new File("./src/irudiak/tablero.gif")));
            //this.getGelaxkak().setBorder(a);
            //this.getGelaxkak().setBorder(a);
            //this.getGelaxkak().setBorder(a);
            
            FondoSwing zero = new FondoSwing(ImageIO.read(new File("./src/irudiak/n0.gif")));
            this.getDenbora_batekoak().setBorder(zero);
            this.getDenbora_hamarrekoak().setBorder(zero);
            this.getMina_batekoak().setBorder(zero);
            this.getMina_hamarrekoak().setBorder(zero);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

		getContentPane().add(getGelaxkak());
	}
	private void getTablero(int pE,int pZ) throws IOException {
		if (gelaxkak==null) {
			gelaxkak=getGelaxkak();
			GridLayout g=new GridLayout(pE,pZ,0,0);
			gelaxkak.setLayout(g);
			JButton[][] b=new JButton[pE][pZ];
			FondoSwing a=new FondoSwing(ImageIO.read(new File("./src/irudiak/tablero.gif")));
			GelaxkaEgoera gE = new GelaxkaEgoera();
			for (int i=0;i<pE;i++) {
				for(int z=0;z<pZ;z++) {
					kaxa = new JButton();
					kaxa.addMouseListener(gE);
					kaxa.setBorder(a);
					b[i][z]=kaxa;
					gelaxkak.add(kaxa);
				}
			}			
		}
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
	private JPanel getGelaxkak() throws IOException {
		if (gelaxkak == null) {
			gelaxkak = new JPanel();
			gelaxkak.setBounds(12, 108, 358, 332);	
		}
		return gelaxkak;
	}
	private JButton getGelaxka() throws IOException {
		if (gelaxka==null) {
			gelaxka=new JButton();
		}
		
		
		return gelaxka;
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


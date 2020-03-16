package pack1;
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
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JSplitPane;
import java.awt.Panel;

public class prueba extends JFrame {
	JPanel panelGelaxkak;
	ArrayList<JLabel> ListaGelaxkak;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba frame = new prueba();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prueba() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		getContentPane().setLayout(null);
		this.sortuGelaxkak();
		getContentPane().add(getPanelGelaxkak());
		try {

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

	}
	private JLabel gelaxkaSortu() {
		JLabel label = new JLabel();
		label.setBorder(BorderFactory.createLoweredBevelBorder());
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
	private void sortuGelaxkak () {
		int x,y=0;
		for (y = 0; y < 9; y++) {
			for (x = 0; x < 9; x++) {
				JLabel gelaxkaBerri = gelaxkaSortu();
				ListaGelaxkak.add(gelaxkaBerri);
				getPanelGelaxkak().add(
					gelaxkaBerri,
					new GridBagConstraints(x, y, 1, 1, 0.0, 0.0,
								     GridBagConstraints.CENTER,
								     GridBagConstraints.NONE, 
	                                               new Insets(0, 0, 0, 0), 0, 0));
			}
		  }
	}
}

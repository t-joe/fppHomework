package homework6.prob2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FlowLayoutClass extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton btnRed;
	JButton btnOrange;
	JButton btnGreen;
	JButton btnBlue;
	JButton btnYellow;
	JButton btnRGB;
	JButton btnPink;

	public FlowLayoutClass() {
		Events ev = new Events();
		JPanel p1 = new JPanel(null);
		btnRed = new JButton();
		btnRed.setBounds(10, 10, 100, 100);
		btnRed.setBackground(Color.RED);
		btnRed.addActionListener(ev);

		btnOrange = new JButton();
		btnOrange.setBounds(120, 10, 100, 100);
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.addActionListener(ev);

		btnGreen = new JButton();
		btnGreen.setBounds(230, 10, 100, 100);
		btnGreen.setBackground(Color.GREEN);
		btnGreen.addActionListener(ev);

		btnBlue = new JButton();
		btnBlue.setBounds(340, 10, 100, 100);
		btnBlue.setBackground(Color.BLUE);
		btnBlue.addActionListener(ev);

		btnYellow = new JButton();
		btnYellow.setBounds(450, 10, 100, 100);
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.addActionListener(ev);

		btnRGB = new JButton();
		btnRGB.setBounds(560, 10, 100, 100);
		btnRGB.setBackground(new Color(128, 0, 128));
		btnRGB.addActionListener(ev);

		btnPink = new JButton();
		btnPink.setBounds(670, 10, 100, 100);
		btnPink.setBackground(Color.PINK);
		btnPink.addActionListener(ev);

		p1.add(btnRed);
		p1.add(btnOrange);
		p1.add(btnGreen);
		p1.add(btnBlue);
		p1.add(btnYellow);
		p1.add(btnRGB);
		p1.add(btnPink);

		this.add(p1);
		this.setBounds(100, 100, 800, 160);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Rainbow Color Frame");
	}

	public static void main(String[] args) {
		new FlowLayoutClass();
	}

	class Events implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();
			if (jb == btnRed) 
				JOptionPane.showMessageDialog(jb,
						"Red is the color of fire and blood, so it is associated with energy, war, danger, strength, power, determination as well as passion, desire, and love");
			else if(jb == btnOrange)
				JOptionPane.showMessageDialog(jb,
						"Orange is associated with meanings of joy, warmth, heat, sunshine, enthusiasm, creativity, success, encouragement, change, determination,\n health, stimulation, happiness, fun, enjoyment, balance, sexuality, freedom, expression, and fascination.");
			else if(jb == btnGreen)
				JOptionPane.showMessageDialog(jb,
						"Green, the color of life, renewal, nature, and energy, is associated with meanings of growth, harmony, freshness, safety, fertility, and environment.");
			else if(jb == btnBlue)
				JOptionPane.showMessageDialog(jb,
						"Blue is the color of the sky and sea. It is often associated with depth and stability. It symbolizes trust, loyalty, wisdom, confidence, intelligence, faith, truth, and heaven.");
			else if(jb == btnYellow)
				JOptionPane.showMessageDialog(jb,
						"On one hand yellow stands for freshness, happiness, positivity, clarity, energy, optimism, enlightenment, remembrance, intellect, honor, loyalty, and joy,\n but on the other, it represents cowardice and deceit");
			else if(jb == btnRGB)
				JOptionPane.showMessageDialog(jb,
						"The color purple is often associated with royalty, nobility, luxury, power, and ambition. Purple also represents meanings of wealth, extravagance, creativity,\n wisdom, dignity, grandeur, devotion, peace, pride, mystery, independence, and magic.");
			else 
				JOptionPane.showMessageDialog(jb,
						"Pink, a delicate color that means sweet, nice, playful, cute, romantic, charming, feminine, and tenderness, is associated with bubble gum, flowers, babies, little girls, cotton candy, and sweetness.");
		}

	}
}

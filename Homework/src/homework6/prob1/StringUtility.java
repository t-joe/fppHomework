package homework6.prob1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringUtility extends JFrame {

	JPanel panel;
	JButton btnCount;
	JButton btnReverse;
	JButton btnRemoveDup;
	JTextField txtInput;
	JTextField txtOutput;
	JLabel lblInput;
	JLabel lblOutput;
	private static final long serialVersionUID = 1L;

	public StringUtility() {
		this.setTitle("String utility");
		panel = new JPanel(null);
		
		btnCount = new JButton("Count letters");
		btnCount.setBounds(10, 10, 150, 20);
		panel.add(btnCount);

		btnReverse = new JButton("Reverse letters");
		btnReverse.setBounds(10, 40, 150, 20);
		panel.add(btnReverse);

		btnRemoveDup = new JButton("Remove duplicates");
		btnRemoveDup.setBounds(10, 70, 150, 20);
		panel.add(btnRemoveDup);

		txtInput = new JTextField();
		txtInput.setBounds(170, 30, 200, 25);
		panel.add(txtInput);

		txtOutput = new JTextField();
		txtOutput.setEnabled(false);
		txtOutput.setBounds(170, 70, 200, 25);
		panel.add(txtOutput);

		lblInput = new JLabel("Input");
		lblInput.setText("Input");
		lblInput.setBounds(170, 10, 50, 20);
		panel.add(lblInput);

		lblOutput = new JLabel("Output");
		lblOutput.setBounds(170, 50, 100, 20);
		panel.add(lblOutput);

		btnCount.addActionListener(e -> {
			txtOutput.setText(String.valueOf(txtInput.getText().length()));
		});

		btnReverse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String reverse = txtInput.getText();
				StringBuilder sb = new StringBuilder();
				//StringUtility su = new StringUtility();
				sb.append(reverse);
				txtOutput.setText(sb.reverse().toString());
			}
		});
		
		btnRemoveDup.addActionListener(new events());
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, 400, 200);
		this.setResizable(false);
	}
	class events implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String str  = txtInput.getText();
			StringBuilder sb = new StringBuilder();
			str.chars().distinct().forEach(c-> sb.append((char)c));
			txtOutput.setText(sb.toString());	
		}
	}
	public static void main(String[] args) {
		new StringUtility();
	}

}

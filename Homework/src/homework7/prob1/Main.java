package homework7.prob1;

import javax.swing.JFrame;
import javax.swing.*;

public class Main extends JFrame{

	public static void main(String[] args) {
		new Main();		
	}

	public Main()
	{
		JPanel pnl = new JPanel(null);
		
		JLabel lblMile = new JLabel("Mile");
		lblMile.setBounds(10, 10, 100, 30);
		
		JLabel lblPound = new JLabel("Pound");
		lblPound.setBounds(10, 50, 100, 30);
		
		JLabel lblGallon = new JLabel("Gallon");
		lblGallon.setBounds(10, 90, 100, 30);
		
		JLabel lblFah = new JLabel("Fahrenheit");
		lblFah.setBounds(10, 130, 100, 30);
		
		JLabel lblKilom = new JLabel("Kilometer");
		lblKilom.setBounds(230, 10, 100, 30);
		
		JLabel lblKilog = new JLabel("Kilogram");
		lblKilog.setBounds(230, 50, 100, 30);
		
		JLabel lblLiters = new JLabel("Liters");
		lblLiters.setBounds(230, 90, 100, 30);
		
		JLabel lblCentig = new JLabel("Centrigrade");
		lblCentig.setBounds(230, 130, 100, 30);
		
		JTextField txtMile = new JTextField();
		txtMile.setBounds(120, 10, 100, 30);
		
		JTextField txtPound = new JTextField();
		txtPound.setBounds(120, 50, 100, 30);
		
		JTextField txtGallon = new JTextField();
		txtGallon.setBounds(120, 90, 100, 30);
		
		JTextField txtFah = new JTextField();
		txtFah.setBounds(120, 130, 100, 30);
		
		JTextField txtKilom = new JTextField();
		txtKilom.setBounds(340, 10, 100, 30);
		
		JTextField txtKilog = new JTextField();
		txtKilog.setBounds(340, 50, 100, 30);
		
		JTextField txtLiters = new JTextField();
		txtLiters.setBounds(340, 90, 100, 30);
		
		JTextField txtCentig = new JTextField();
		txtCentig.setBounds(340, 130, 100, 30);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(190, 170, 100, 30);
		btnConvert.addActionListener(e->{
			if(!txtMile.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtMile.getText()) * 1.609;
				txtKilom.setText(String.valueOf(dl));
			}
			else if(!txtKilom.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtKilom.getText()) / 1.609;
				txtMile.setText(String.valueOf(dl));
			}
			
			if(!txtPound.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtPound.getText()) / 2.205;
				txtKilog.setText(String.valueOf(dl));
			}
			else if(!txtKilog.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtKilog.getText()) * 2.205;
				txtPound.setText(String.valueOf(dl));
			}
			
			if(!txtGallon.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtGallon.getText()) * 3.785;
				txtLiters.setText(String.valueOf(dl));
			}
			else if(!txtLiters.getText().isEmpty()){
				double dl = Double.parseDouble(txtLiters.getText()) / 3.785;
				txtGallon.setText(String.valueOf(dl));
			}
			
			if(!txtFah.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtFah.getText());
				txtCentig.setText(String.valueOf((dl - 32) * 5/9));
			}
			else if(!txtCentig.getText().isEmpty())
			{
				double dl = Double.parseDouble(txtCentig.getText());
				txtCentig.setText(String.valueOf((dl * 9/5) + 32));
			}
		});
		
		pnl.add(lblMile);
		pnl.add(lblPound);
		pnl.add(lblGallon);
		pnl.add(lblFah);
		pnl.add(lblKilom);
		pnl.add(lblKilog);
		pnl.add(lblLiters);
		pnl.add(lblCentig);
		
		pnl.add(txtMile);
		pnl.add(txtPound);
		pnl.add(txtGallon);
		pnl.add(txtFah);
		pnl.add(txtKilom);
		pnl.add(txtKilog);
		pnl.add(txtLiters);
		pnl.add(txtCentig);
		pnl.add(btnConvert);
		
		pnl.setVisible(true);
		this.setVisible(true);
		this.setBounds(200, 200, 500, 250);
		this.setResizable(false);
		this.add(pnl);
		this.setTitle("Metric Conversion Assitant");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

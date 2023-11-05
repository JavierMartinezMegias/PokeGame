package Pantallas;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Combate extends JFrame
{

	private JPanel contentPane;

	private boolean ataqueJugador1;
	private boolean ataqueJugador2;
	

	/**
	 * Create the frame.
	 */
	public Combate(int pokemonPlayer1,int pokemonPlayer2)
	{
		JFrame combateFrame = new JFrame("Combate");
		combateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		combateFrame.setSize(1200, 800);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1029, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ataque Normal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador1 = true;
			}
		});
		btnNewButton.setBounds(95, 603, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ataque Especial");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador1 = false;
			}
		});
		btnNewButton_1.setBounds(95, 634, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ataque Normal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador2 = true;
			}
		});
		btnNewButton_2.setBounds(946, 603, 139, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ataque especial");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador2 = false;
			}
		});
		btnNewButton_3.setBounds(946, 634, 139, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Combatir ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(534, 629, 155, 61);
		contentPane.add(btnNewButton_4);
		combateFrame.getContentPane().add(contentPane);
		combateFrame.setVisible(true);
	}

}

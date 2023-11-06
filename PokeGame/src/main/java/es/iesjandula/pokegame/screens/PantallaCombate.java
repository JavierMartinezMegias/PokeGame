package es.iesjandula.pokegame.screens;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import es.iesjandula.pokegame.functions.Combate;
import es.iesjandula.pokegame.functions.Pokemon;

import javax.swing.JLabel;

public class PantallaCombate extends JFrame
{

	private JPanel contentPane;

	private boolean ataqueJugador1;
	private boolean ataqueJugador2;
	

	/**
	 * Create the frame.
	 */
	public PantallaCombate(int pokemonPlayer1,int pokemonPlayer2,List<Pokemon> pokemonsP1 ,List<Pokemon> pokemonsP2)
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
		btnNewButton.setBounds(95, 658, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ataque Especial");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador1 = false;
			}
		});
		btnNewButton_1.setBounds(95, 692, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ataque Normal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador2 = true;
			}
		});
		btnNewButton_2.setBounds(946, 658, 139, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ataque especial");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ataqueJugador2 = false;
			}
		});
		btnNewButton_3.setBounds(946, 692, 139, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Combatir ");
		btnNewButton_4.setBounds(533, 673, 155, 61);
		contentPane.add(btnNewButton_4);
		combateFrame.getContentPane().add(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(127, 84, 328, 23);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Nombre: " + pokemonsP1.get(pokemonPlayer1).getNombre_pokemon());
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(127, 118, 342, 23);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1.setText("Vida: " + String.valueOf(pokemonsP1.get(pokemonPlayer1).getHP()));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(826, 84, 243, 23);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setText("Nombre: " + pokemonsP2.get(pokemonPlayer2).getNombre_pokemon());
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(826, 118, 219, 23);
		contentPane.add(lblNewLabel_3);
		combateFrame.setVisible(true);
		
		lblNewLabel_3.setText("Vida: " + String.valueOf(pokemonsP2.get(pokemonPlayer2).getHP()));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(50, 152, 463, 495);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(pokemonsP1.get(pokemonPlayer1).getUrlImagen()));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(632, 159, 520, 488);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(pokemonsP2.get(pokemonPlayer2).getUrlImagen()));
		
		Combate combate = new Combate();
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				combate.combate(pokemonsP1.get(pokemonPlayer1),pokemonsP2.get(pokemonPlayer2),ataqueJugador1,ataqueJugador2,pokemonsP1,pokemonsP2);
				lblNewLabel.setText("Nombre: " + pokemonsP1.get(pokemonPlayer1).getNombre_pokemon());
				lblNewLabel_1.setText("Vida: " + String.valueOf(pokemonsP1.get(pokemonPlayer1).getHP()));
				lblNewLabel_2.setText("Nombre: " + pokemonsP2.get(pokemonPlayer2).getNombre_pokemon());
				lblNewLabel_3.setText("Vida: " + String.valueOf(pokemonsP2.get(pokemonPlayer2).getHP()));
			}
		});
		
	}



}

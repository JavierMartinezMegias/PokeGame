package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Carlos.Pokemon;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class SeleccionPokemons extends JFrame
{

	private JPanel contentPane;
	private JLabel nameLabel_1;
	private JLabel hpLabel_1;
	int select1 = 0;
	int select2 = 0;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SeleccionPokemons(List<Pokemon> player1, List<Pokemon> player2)
	{

		JFrame gameFrame = new JFrame("Juego de Cartas de Pokémon");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setSize(800, 600);

		JPanel gamePanel = new JPanel(new GridLayout(1, 2));

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(0, 0, 0)); // Cambia el color del panel izquierdo a negro

		// Obtén el Pokémon izquierdo de player1
		Pokemon pokemonIzquierdo = player1.get(select1); // Supongamos que obtienes el primer Pokémon de player1

		// Cargar la imagen del Pokémon
		String imageUrl = pokemonIzquierdo.getUrlImagen(); // Asume que tienes la URL de la imagen
		ImageIcon pokemonImage = new ImageIcon(imageUrl);
		leftPanel.setLayout(null);
		JLabel imageLabel = new JLabel(pokemonImage);
		imageLabel.setBounds(27, 12, -1, -1);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		leftPanel.add(imageLabel);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.BLACK); // Cambia el color del panel derecho a negro

		// Obtén el Pokémon derecho de player2
		Pokemon pokemonDerecho = player2.get(0); // Supongamos que obtienes el primer Pokémon de player2

		nameLabel_1 = new JLabel("Nombre: " + pokemonDerecho.getNombre_pokemon());
		nameLabel_1.setBounds(0, 0, 392, 14);
		nameLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		// Cargar la imagen del Pokémon
		imageUrl = pokemonDerecho.getUrlImagen(); // Asume que tienes la URL de la imagen
		pokemonImage = new ImageIcon(imageUrl);

		JPanel bottomPanel = new JPanel(new BorderLayout());

		// Panel para las flechas izquierdas
		JPanel leftArrowsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		// Panel para el botón "Elegir"
		JPanel choosePanel = new JPanel(new FlowLayout());

		bottomPanel.add(leftArrowsPanel, BorderLayout.WEST);
		bottomPanel.add(choosePanel, BorderLayout.CENTER);

		gamePanel.add(leftPanel);

		JLabel nombrePoke1 = new JLabel("New label");
		nombrePoke1.setForeground(new Color(255, 255, 255));
		nombrePoke1.setBounds(39, 41, 292, 14);
		nombrePoke1.setText("Nombre: " + player1.get(select1).getNombre_pokemon());
		leftPanel.add(nombrePoke1);

		JLabel vidaPoke1 = new JLabel("Vida: ");
		vidaPoke1.setForeground(new Color(255, 255, 255));
		vidaPoke1.setBounds(39, 66, 272, 14);
		vidaPoke1.setText("Vida: " + player1.get(select1).getTotal());
		leftPanel.add(vidaPoke1);

		JLabel ataquePoke1 = new JLabel("New label");
		ataquePoke1.setForeground(new Color(255, 255, 255));
		ataquePoke1.setBounds(39, 91, 292, 14);
		vidaPoke1.setText("Ataque: " + player1.get(select1).getAttack());
		leftPanel.add(ataquePoke1);

		JLabel ataqueEspecialPoke1 = new JLabel("New label");
		ataqueEspecialPoke1.setForeground(new Color(255, 255, 255));
		ataqueEspecialPoke1.setBounds(39, 116, 306, 14);
		ataqueEspecialPoke1.setText("Ataque Especial: " + player1.get(select1).getSp_atk());
		leftPanel.add(ataqueEspecialPoke1);

		JLabel defensa = new JLabel("Defensa: 0");
		defensa.setForeground(Color.WHITE);
		defensa.setBounds(39, 141, 306, 14);
		defensa.setText("Defensa : " + player1.get(select1).getDefense());
		leftPanel.add(defensa);

		JLabel defensaEspecial = new JLabel("Defenda Especial: 0");
		defensaEspecial.setForeground(Color.WHITE);
		defensaEspecial.setBounds(39, 166, 306, 14);
		defensaEspecial.setText("Defensa Especial: " + player1.get(select1).getSp_def());
		leftPanel.add(defensaEspecial);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (select1 == 0)
				{
					select1 = 4;

				} else
				{
					select1 -= 1;

				}
				nombrePoke1.setText("Nombre: " + player1.get(select1).getNombre_pokemon());
				vidaPoke1.setText("Vida: " + String.valueOf(player1.get(select1).getTotal()));
				ataquePoke1.setText("Ataque normal: " + String.valueOf(player1.get(select1).getAttack()));
				ataqueEspecialPoke1.setText("Ataque especial: " + String.valueOf(player1.get(select1).getSp_atk()));
				defensa.setText("Defensa: " + String.valueOf(player1.get(select1).getDefense()));
				defensaEspecial.setText("Defensa Especial: " + player1.get(select1).getSp_def());
			}
		});
		btnNewButton.setBounds(124, 517, 46, 23);
		leftPanel.add(btnNewButton);

		JButton nextPlayerOne = new JButton(">");
		nextPlayerOne.setBounds(193, 517, 46, 23);
		leftPanel.add(nextPlayerOne);

		nextPlayerOne.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (select1 == 4)
				{
					select1 = 0;

				} else
				{
					select1 += 1;

				}
				nombrePoke1.setText("Nombre: " + player1.get(select1).getNombre_pokemon());
				vidaPoke1.setText("Vida: " + String.valueOf(player1.get(select1).getTotal()));
				ataquePoke1.setText("Ataque normal: " + String.valueOf(player1.get(select1).getAttack()));
				ataqueEspecialPoke1.setText("Ataque especial: " + String.valueOf(player1.get(select1).getSp_atk()));
				defensa.setText("Defensa: " + String.valueOf(player1.get(select1).getDefense()));
				defensaEspecial.setText("Defensa Especial: " + player1.get(select1).getSp_def());
			}
		});

		gamePanel.add(rightPanel);
		rightPanel.setLayout(null);

		JLabel nombrePoke2 = new JLabel("New label");
		nombrePoke2.setForeground(Color.WHITE);
		nombrePoke2.setBounds(35, 42, 319, 23);
		nombrePoke2.setText("Nombre: " + player2.get(select2).getNombre_pokemon());
		rightPanel.add(nombrePoke2);

		JLabel vidaPoke2 = new JLabel("New label");
		vidaPoke2.setForeground(Color.WHITE);
		vidaPoke2.setBounds(35, 68, 334, 23);
		vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select2).getTotal()));
		rightPanel.add(vidaPoke2);

		JLabel ataquePoke2 = new JLabel("New label");
		ataquePoke2.setForeground(Color.WHITE);
		ataquePoke2.setBounds(35, 91, 319, 23);
		ataquePoke2.setText("Ataque normal: " + String.valueOf(player2.get(select2).getAttack()));
		rightPanel.add(ataquePoke2);

		JLabel ataqueEspecial2 = new JLabel("New label");
		ataqueEspecial2.setForeground(Color.WHITE);
		ataqueEspecial2.setBounds(35, 115, 319, 23);
		ataqueEspecial2.setText("Ataque especial: " + String.valueOf(player2.get(select2).getSp_atk()));
		rightPanel.add(ataqueEspecial2);

		JLabel defensaPoke2 = new JLabel("New label");
		defensaPoke2.setForeground(Color.WHITE);
		defensaPoke2.setBounds(35, 137, 305, 23);
		defensaPoke2.setText("Defensa: " + String.valueOf(player2.get(select2).getDefense()));
		rightPanel.add(defensaPoke2);

		JLabel defensaEspecialPoke2 = new JLabel("New label");
		defensaEspecialPoke2.setForeground(Color.WHITE);
		defensaEspecialPoke2.setBounds(35, 160, 305, 23);
		defensaEspecialPoke2.setText("Defensa Especial: " + player2.get(select2).getSp_def());

		rightPanel.add(defensaEspecialPoke2);

		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.setBounds(228, 517, 46, 23);
		rightPanel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton(" <");
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (select1 == 0)
				{
					select1 = 4;

				} else
				{
					select1 -= 1;

				}
				nombrePoke2.setText("Nombre: " + player2.get(select1).getNombre_pokemon());
				vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select1).getTotal()));
				ataquePoke2.setText("Ataque normal: " + String.valueOf(player2.get(select1).getAttack()));
				ataqueEspecial2.setText("Ataque especial: " + String.valueOf(player2.get(select1).getSp_atk()));
				defensaPoke2.setText("Defensa: " + String.valueOf(player2.get(select1).getDefense()));
				defensaEspecialPoke2.setText("Defensa Especial: " + player2.get(select1).getSp_def());
			}
		});
		btnNewButton_2.setBounds(172, 517, 46, 23);
		rightPanel.add(btnNewButton_2);
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (select1 == 4)
				{
					select1 = 0;

				} else
				{
					select1 += 1;

				}
				nombrePoke2.setText("Nombre: " + player2.get(select1).getNombre_pokemon());
				vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select1).getTotal()));
				ataquePoke2.setText("Ataque normal: " + String.valueOf(player2.get(select1).getAttack()));
				ataqueEspecial2.setText("Ataque especial: " + String.valueOf(player2.get(select1).getSp_atk()));
				defensaPoke2.setText("Defensa: " + String.valueOf(player2.get(select1).getDefense()));
				defensaEspecialPoke2.setText("Defensa Especial: " + player2.get(select1).getSp_def());
			}
		});

		gameFrame.getContentPane().add(gamePanel, BorderLayout.CENTER);
		gameFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		gameFrame.setVisible(true);
	}
}
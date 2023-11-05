package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Carlos.Pokemon;

public class MenuPrincipal extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void inicioJuego(List<Pokemon> player1, List<Pokemon> player2)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					MenuPrincipal frame = new MenuPrincipal(player1,player2);
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal(List<Pokemon> player1, List<Pokemon> player2)
	{
		JFrame mainMenuFrame = new JFrame("Menú Principal");
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.setSize(500, 300);

        JPanel mainMenuPanel = new JPanel();

        JButton newGameButton = new JButton("Partida Nueva");
        newGameButton.setBounds(0, 0, 484, 35);
        JButton exitButton = new JButton("Salir");
        exitButton.setBounds(0, 226, 484, 35);

        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent irVentana2) {
                
                SeleccionPokemons seleccion = new SeleccionPokemons(player1,player2);               
                mainMenuFrame.dispose(); // Cierra el menú principal
                
        }});

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Sale del juego
            }
        });
        mainMenuPanel.setLayout(null);

        mainMenuPanel.add(newGameButton);
        mainMenuPanel.add(exitButton);

        mainMenuFrame.getContentPane().add(mainMenuPanel);
        
        JButton btnCargarPartida = new JButton("Cargar Partida");
        btnCargarPartida.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCargarPartida.setBounds(0, 46, 484, 35);
        mainMenuPanel.add(btnCargarPartida);
        mainMenuFrame.setVisible(true);
    }

}
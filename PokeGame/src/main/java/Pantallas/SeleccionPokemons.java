package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Carlos.Pokemon;

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
		gameFrame.setSize(1200, 800);

		JPanel gamePanel = new JPanel(new GridLayout(1, 2));

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(0, 0, 0)); // Cambia el color del panel izquierdo a negro

		
		leftPanel.setLayout(null);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.BLACK); // Cambia el color del panel derecho a negro

		// Obtén el Pokémon derecho de player2
		
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
		vidaPoke1.setText("Vida: " + player1.get(select1).getHP());
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
		
		JLabel lblNewLabel = new JLabel("New label");
		Graphics graphics = new Graphics()
		{
			
			@Override
			public void translate(int x, int y)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setXORMode(Color c1)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPaintMode()
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFont(Font font)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setColor(Color c)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClip(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClip(Shape clip)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public FontMetrics getFontMetrics(Font f)
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Font getFont()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Color getColor()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Rectangle getClipBounds()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Shape getClip()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillRect(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillOval(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(AttributedCharacterIterator iterator, int x, int y)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawString(String str, int x, int y)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawOval(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drawLine(int x1, int y1, int x2, int y2)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
					Color bgcolor, ImageObserver observer)
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2,
					ImageObserver observer)
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer)
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer)
			{
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean drawImage(Image img, int x, int y, ImageObserver observer)
			{
				
				return false;
			}
			
			@Override
			public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dispose()
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Graphics create()
			{
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void copyArea(int x, int y, int width, int height, int dx, int dy)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clipRect(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearRect(int x, int y, int width, int height)
			{
				// TODO Auto-generated method stub
				
			}
		};
		BufferedImage imagen;
		try
		{
			super.paintComponents(graphics);
			imagen = ImageIO.read(new File(player1.get(select1).getUrlImagen()));
			int ancho = lblNewLabel.getWidth();
			int largo = lblNewLabel.getHeight();
			Image imagenReescalada = imagen.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);			
			graphics.drawImage(imagenReescalada, 10,250,this);
			
			
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
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
				vidaPoke1.setText("Vida: " + String.valueOf(player1.get(select1).getHP()));
				ataquePoke1.setText("Ataque normal: " + String.valueOf(player1.get(select1).getAttack()));
				ataqueEspecialPoke1.setText("Ataque especial: " + String.valueOf(player1.get(select1).getSp_atk()));
				defensa.setText("Defensa: " + String.valueOf(player1.get(select1).getDefense()));
				defensaEspecial.setText("Defensa Especial: " + player1.get(select1).getSp_def());
				lblNewLabel.setIcon(new ImageIcon(player1.get(select1).getUrlImagen()));
			}
		});
		btnNewButton.setBounds(193, 653, 46, 23);
		leftPanel.add(btnNewButton);

		JButton nextPlayerOne = new JButton(">");
		nextPlayerOne.setBounds(332, 653, 46, 23);
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
				vidaPoke1.setText("Vida: " + String.valueOf(player1.get(select1).getHP()));
				ataquePoke1.setText("Ataque normal: " + String.valueOf(player1.get(select1).getAttack()));
				ataqueEspecialPoke1.setText("Ataque especial: " + String.valueOf(player1.get(select1).getSp_atk()));
				defensa.setText("Defensa: " + String.valueOf(player1.get(select1).getDefense()));
				defensaEspecial.setText("Defensa Especial: " + player1.get(select1).getSp_def());
				lblNewLabel.setIcon(new ImageIcon(player1.get(select1).getUrlImagen()));
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
		vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select2).getHP()));
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
		btnNewButton_1.setBounds(346, 657, 46, 23);
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
				vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select1).getHP()));
				ataquePoke2.setText("Ataque normal: " + String.valueOf(player2.get(select1).getAttack()));
				ataqueEspecial2.setText("Ataque especial: " + String.valueOf(player2.get(select1).getSp_atk()));
				defensaPoke2.setText("Defensa: " + String.valueOf(player2.get(select1).getDefense()));
				defensaEspecialPoke2.setText("Defensa Especial: " + player2.get(select1).getSp_def());
			}
		});
		btnNewButton_2.setBounds(191, 657, 46, 23);
		rightPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Combate");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combate combate = new Combate(select1,select2);
				gameFrame.dispose();
			}
		});
		btnNewButton_3.setBounds(0, 690, 111, 61);
		rightPanel.add(btnNewButton_3);
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
				vidaPoke2.setText("Vida: " + String.valueOf(player2.get(select1).getHP()));
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


	/**
	 * @return the select1
	 */
	public int getSelect1()
	{
		return select1;
	}


	/**
	 * @param select1 the select1 to set
	 */
	public void setSelect1(int select1)
	{
		this.select1 = select1;
	}


	/**
	 * @return the select2
	 */
	public int getSelect2()
	{
		return select2;
	}


	/**
	 * @param select2 the select2 to set
	 */
	public void setSelect2(int select2)
	{
		this.select2 = select2;
	}
	
}
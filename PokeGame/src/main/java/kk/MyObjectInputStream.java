package kk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyObjectInputStream
{
	final static Logger log = LogManager.getLogger();
	public static void main(String[]args) throws UnidadUnoException {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try
		{
			fileInputStream = new FileInputStream("datos.obj");
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			Persona persona = (Persona) objectInputStream.readObject();
			
			
			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());

			Persona persona2 = (Persona) objectInputStream.readObject();
			System.out.println(persona2.getNombre());
			System.out.println(persona2.getEdad());
			
		} catch (FileNotFoundException e)
		{
			String error = "No encontrado";
			log.error(error,e);
			throw new UnidadUnoException(error,e);
		} catch (IOException e)
		{
			String error = "error de entrada y salida";
			log.error(error,e);
			throw new UnidadUnoException(error,e);
		} catch (ClassNotFoundException e)
		{
			String error = "No se ha podido escribir el archivo";
			log.error(error,e);
			throw new UnidadUnoException(error,e);
		}
		finally {
			{
				if(objectInputStream != null)
				{
					try
					{
						objectInputStream.close();
					} catch (IOException e)
					{
						String error = "No se ha podido escribir el archivo";
						log.error(error,e);
						throw new UnidadUnoException(error,e);
					}			
				}
				if(fileInputStream != null)
				{
					try
					{
						fileInputStream.close();
					} catch (IOException exception)
					{
						String error = "No se ha podido escribir el archivo";
						log.error(error,exception);
						throw new UnidadUnoException(error,exception);
					}
				}
			}
		}
	}
	

}

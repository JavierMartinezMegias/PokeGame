package kk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyObjectOutputStream
{
	final static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) throws UnidadUnoException {
		File file = new File("datos.obj");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		MyObjectOutputStreamOverride myObjectInputStream = null;
		try
		{

			
			if(file.exists())
			{
				fileOutputStream = new FileOutputStream(file, true);
				myObjectInputStream = new MyObjectOutputStreamOverride(fileOutputStream);
				myObjectInputStream.writeObject(new Persona("Pepe",23));
				myObjectInputStream.flush();

			}
			else
			{
				fileOutputStream = new FileOutputStream(file, true);
				objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(new Persona("Pepe",23));
				objectOutputStream.flush();
			}
				
			
		} catch (FileNotFoundException e)
		{
			String error = "No se ha podido escribir el archivo";
			log.error(error,e);
			throw new UnidadUnoException(error,e);
		} catch (IOException e)
		{
			String error = "No se ha podido escribir el archivo";
			log.error(error,e);
			throw new UnidadUnoException(error,e);
		}
		finally
		{
			if(objectOutputStream != null)
			{
				try
				{
					objectOutputStream.close();
				} catch (IOException e)
				{
					String error = "No se ha podido escribir el archivo";
					log.error(error,e);
					throw new UnidadUnoException(error,e);
				}			
			}
			if(fileOutputStream != null)
			{
				try
				{
					fileOutputStream.close();
				} catch (IOException e)
				{
					String error = "No se ha podido escribir el archivo";
					log.error(error,e);
					throw new UnidadUnoException(error,e);
				}
			}
		}
		
	}
}

package kk;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStreamOverride extends ObjectOutputStream
{

	
	
	public MyObjectOutputStreamOverride(OutputStream out) throws IOException
	{
		super(out);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeStreamHeader(){
		
	}
	

}

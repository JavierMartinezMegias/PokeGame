package Carlos;

public class UnidadUnoExcepcion extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnidadUnoExcepcion()
	{
		super();
		
	}

	public UnidadUnoExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public UnidadUnoExcepcion(String message, Throwable cause)
	{
		super(message, cause);
	
	}

	public UnidadUnoExcepcion(String message)
	{
		super(message);
	
	}

	public UnidadUnoExcepcion(Throwable cause)
	{
		super(cause);
		
	}
	
}

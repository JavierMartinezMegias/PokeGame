package Carlos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjectOutputStream extends ObjectOutputStream
{
    // Para saber si el archivo existe o no.
    private static boolean isExist;

    public MyObjectOutputStream(String path,boolean append) throws IOException
    {
        /* Invocamos al constructor de la clase ObjectOutputStream */
        super(createFile(path,append));
    }

    private static FileOutputStream createFile(String path,boolean append) throws IOException
    {
        /* Si el archivo existe.. */
        if(new File(path).exists())
            isExist = true;
        return new FileOutputStream(path, append);
    }

    @Override
    protected void writeStreamHeader() throws IOException
    {
        /* Si el archivo no existe.. */
        if(!isExist)
            super.writeStreamHeader();
    }
}
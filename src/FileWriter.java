import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileWriter {

    void writeFile(String fileName, String data) throws FileNotFoundException
    {
        //this file is opened in append mode
        FileOutputStream writer=new FileOutputStream(fileName);

        try(writer)
        {
            writer.write(data.getBytes());
        }
        catch (IOException e)
        {
            System.out.println("Exception occured:"+e.getMessage());
            e.printStackTrace();
        }
    }
}

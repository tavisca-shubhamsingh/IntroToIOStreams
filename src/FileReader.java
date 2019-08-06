import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileReader {
    String readFile(String file) throws FileNotFoundException {

        StringBuilder data=new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        try (bufferedInputStream)
        {

            byte[] buffer=new byte[8];
            while (bufferedInputStream.read(buffer)>0)
            {
                data.append(new String(buffer));
                buffer=new byte[8];

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data.toString();


    }


}

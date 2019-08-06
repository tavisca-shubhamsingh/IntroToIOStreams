import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args)
    {
        writeFileContents();
        readFileContents();
    }


    private static void readFileContents() {
        FileReader fileReader=new FileReader();

        String contents;
        try {
            contents = fileReader.readFile("DataFile.txt");
            System.out.println(contents);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

    private static void writeFileContents() {
        FileWriter myFileWriter=new FileWriter();
        String data = "hello! how are you?\n";
        try
        {
            myFileWriter.writeFile("DataFile.txt", data);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file name incorrect");
            e.printStackTrace();
        }
    }
}

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("C:/Users/sarth/Documents/myfile.txt");
		fw = new FileWriter("C:/Users/sarth/Documents/myfile-copy.txt");

		int ch;

		while ((ch = fr.read()) != -1) {

			fw.write(ch);

		}

		fr.close();
		fw.close();

	}

}

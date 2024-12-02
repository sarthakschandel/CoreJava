import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("C:/Users/sarth/Documents/myfile.txt"));//file created
			System.out.println("File Opened");

			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}//to read the file, end of file represented by -1

		} catch (FileNotFoundException e) {
			e.printStackTrace();//this is a checked exception
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nFile Closed");
		}

	}

}

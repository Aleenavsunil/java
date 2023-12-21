import java.io.FileWriter;
import java.io.IOException;
public class FilewriterDemo {

	public static void main(String[] args) {
		String data="my name is Aleena";
		FileWriter output=null;
		try {
			output=new FileWriter("myfile.txt");
			output.write(data);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				output.flush();
				output.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

package file;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	public static void main(String[] args) {
	try {
		File obj = new File("File.txt");
		if(obj.createNewFile()) {
		System.out.println("Your file was created: "+obj.getName());
		}
		else {
		System.out.println("The file already exists: "+obj.getName());}
		//Write to a File
		FileWriter obj2 = new FileWriter("File.txt");
		obj2.write("Created a File using File handeling in java\n");
		//obj2.close();
		System.out.println("You have successfully wrote in your file");
		//Append to a file
		@SuppressWarnings("unused")
		String path = System.getProperty("user.dir")+"\\File.txt";
		String Text = "Append using File Handleing was done.";
		//Files.write(Paths.get(path), Text.getBytes(),StandardOpenOption.APPEND);
		obj2.write(Text);
		obj2.close();
		System.out.println("Your File was was successfully appended.\n");

		//Read a file
		System.out.println("Read file:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(obj);
		while(sc.hasNextLine()) {
		String Read = sc.nextLine();
		System.out.println(Read);
		}
		}
		catch(IOException e) {
		System.out.println("There is an error");
		e.printStackTrace();
		}
		}

}

import java.io.*;
import java.util.Scanner;

public class Words {
	public static boolean doesFileExist(String path) {
		File wordFile = new File(path);
		boolean exists = wordFile.exists();
		
		return exists;
	}
	

	public static void main(String[] args) throws IOException, FileNotFoundException {
		System.out.println("Please provide the class path to check the file existence and to read!: ");
		Scanner filePath = new Scanner(System.in);
		String userFilePath = filePath.nextLine();
		boolean there = false;
		
		//String userFilePath = "src/wordMeanings.txt";
		there = doesFileExist(userFilePath);
		if (there) {
			System.out.println("File exists");
		}
		else {
			System.out.println("No susch file exists at this location");
		}
		BufferedReader br = new BufferedReader(new FileReader(userFilePath));
		String st;
		while ((st = br.readLine()) != null) {
			String[] arrOfStr = st.split("-");
			for (String a : arrOfStr) {
				System.out.println(a);
			}
		}
	}

}

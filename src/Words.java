import java.io.File;

public class Words {
	public void doesFileExist(String path) {
		File wordFile = new File("c:/temp/temp.txt");
		boolean exists = wordFile.exists();
		if (exists) {
			System.out.println("File exists");
		}
		else {
			System.out.println("No susch file exists at this location");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.kaxle.listing.TheFileVisitor;

public class ListFilesInFolderMain {	
	
	public static void main(String[] args) {
		
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		String s="";
		System.out.print("Begin by entering the folder name: ");				
		TheFileVisitor tfs = new TheFileVisitor();		
		try {
			s=b.readLine();
			Path fileDir=Paths.get(".//"+s+"//");
			s=null;
			Files.walkFileTree(fileDir, tfs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End of search");
	}
}

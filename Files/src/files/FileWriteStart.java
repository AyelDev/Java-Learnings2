package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteStart {

	public static void main(String[] args) throws IOException {

		Path pathFileToWrite = Paths.get("./Resources/new-file.txt");
		
		
		List<String> list = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September"
				,"October", "November", "December");
		
		
		Files.write(pathFileToWrite, list);
	
	}

}

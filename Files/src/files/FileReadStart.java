package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadStart {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = Paths.get("./Resources/data.txt");

//		List<String> readAllLines = Files.readAllLines(pathFileToRead);
//		System.out.println(readAllLines);

		Files.lines(pathFileToRead)
		.filter(str->str.contains("a"))
		.map(String::toLowerCase)
		.forEach(System.out::println);
	}

}

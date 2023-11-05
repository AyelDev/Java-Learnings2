package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanStart {

	public static void main(String[] args) throws IOException {
		Path currrentDirectory = Paths.get(".");
		//Files.list(currrentDirectory).forEach(System.out::println);

		
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currrentDirectory, 3)
		.filter(predicate)
		.forEach(System.out::println);
		
		BiPredicate<Path, BasicFileAttributes> matcher
		= (path,attributes)->String.valueOf(path).contains(".class");
		Files.find(currrentDirectory, 3, matcher)
		.forEach(System.out::println);
		
		BiPredicate<Path, BasicFileAttributes> directoryMatcher
		= (path,attributes)-> attributes.isDirectory();
		Files.find(currrentDirectory, 3, directoryMatcher)
		.forEach(System.out::println);
	}

}

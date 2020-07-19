package hu.callbackcats;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
	
	
	public void readFile() {
		Path path = Paths.get("src/main/resources/dss-input-example.csv");
		try {
			List<String> lines = Files.readAllLines(path);
			//lines.subList(1, lines.size()).stream().forEach();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Order createOrder(String line) {
		String[] parameters = line.split(";");
		Order order = new Order();
		return order;
	}
}

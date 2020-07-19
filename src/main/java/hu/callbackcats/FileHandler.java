package hu.callbackcats;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandler {


    public List<Readable> readFile(String filePath, Readable readable) {
        Path path = Paths.get(filePath);
        List<Readable> readables = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            readables = lines.subList(1, lines.size())
                    .stream()
                    .map(this::createOrder)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readables;
    }

    private Readable createOrder(String line) {
        String[] parameters = line.split(";");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return Order.builder()
                .id(parameters[0])
                .type(OrderType.valueOf(parameters[1]))
                .count(Integer.valueOf(parameters[2]))
                .deadline(LocalDateTime.parse(parameters[3], formatter))
                .profit(Integer.valueOf(parameters[4]))
                .fine(Integer.valueOf(parameters[5]))
                .build();
    }

    public void writeFinishedOrderToFile(List<Object> writeables, String fileName) {
        writeables
                .stream()
                .map(Object::toString)
                .forEach(line -> writeOneLine(line, fileName));
    }

    private void writeOneLine(String line, String fileName) {
        Path outPutPath = Paths.get("src/main/resources/" + fileName + ".csv");
        try (BufferedWriter writer = Files.newBufferedWriter(outPutPath)) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

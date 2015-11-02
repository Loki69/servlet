package storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StroregeFoldersDependence implements Storege<String> {
    
    private final String pathStoreg = "c:\\tmp\\ConfigDependence.txt";
    
    @Override
    public void addToStorege(String dependencePathe) {
        try {
            Files.write(Paths.get(pathStoreg), dependencePathe.concat("\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(StroregeFoldersDependence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<String> getDataFromStorege() {
        try {
            return Files.readAllLines(Paths.get(pathStoreg));
        } catch (IOException ex) {
        }
        return Collections.emptyList();
    }
}

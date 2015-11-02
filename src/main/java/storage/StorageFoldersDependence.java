package storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StorageFoldersDependence implements Storage<String> {
    
    private final String pathStoreg = "c:\\tmp\\ConfigDependence.txt";
    
    @Override
    public void addToStorege(String dependencePathe) {
        try {
            Files.write(Paths.get(pathStoreg), dependencePathe.concat("\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(StorageFoldersDependence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<String> getData() {
        try {
            return Files.readAllLines(Paths.get(pathStoreg));
        } catch (IOException ex) {
        }
        return Collections.emptyList();
    }
}

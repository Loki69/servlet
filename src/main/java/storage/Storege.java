package storage;

import java.util.List;

public interface Storege<T> {

    void addToStorege(T data);

    List<T> getDataFromStorege();
}

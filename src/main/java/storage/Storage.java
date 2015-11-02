package storage;

import java.util.List;

public interface Storage<T> {

    void addToStorege(T data);

    List<T> getData();
}

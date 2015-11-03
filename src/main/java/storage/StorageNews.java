package storage;

import structurs.News;
import java.util.ArrayList;
import java.util.List;

public class StorageNews implements Storage<News>{


    public List<News> getData() {
        List<News> list = new ArrayList();
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        return list;
    }

    @Override
    public void addToStorege(News data) {
    }
}

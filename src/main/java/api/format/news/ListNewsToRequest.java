package api.format.news;

import api.format.Request.FormatRequest;
import api.format.Request.JsonPrinter;
import java.util.List;
import storage.StorageNews;
import structurs.News;

public class ListNewsToRequest {

    private List<News> listNews;

    public ListNewsToRequest() {
    }

    public String printJson() {
        List<News> newsList = getNewsToDisplay();
        System.out.println(newsList.size());
        FormatRequest print = new JsonPrinter(newsList);
        return print.toString();
    }

    private List<News> getNewsToDisplay() {
        StorageNews storege = new StorageNews();
        return storege.getNews();
    }
}

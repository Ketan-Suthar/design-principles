package good.movie;

import good.LibraryItem;

import java.util.List;

public interface IMovie extends LibraryItem {
    int getRuntimeInMinutes();

    void setRuntimeInMinutes(int runtimeInMinutes);

    List<String> getActors();

    void setActors(List<String> actors);

    String getAuthor();

    void setAuthor(String author);
}

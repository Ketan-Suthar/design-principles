package good.audio_book;

import good.LibraryItem;

public interface IAudioBook extends LibraryItem {

    int getRuntimeInMinutes();

    void setRuntimeInMinutes(int runtimeInMinutes);

    String getAuthor();

    void setAuthor(String author);
}

package good.book;

import good.LibraryItem;

public interface IBook extends LibraryItem {
    String getAuthor();

    void setAuthor(String author);

    int getPages();

    void setPages(int pages);
}

package good.book;

import good.book.IBook;

public class ReferenceBook implements IBook {

    private String libraryId;

    private String title;

    private String author;

    private int pages;

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }
}

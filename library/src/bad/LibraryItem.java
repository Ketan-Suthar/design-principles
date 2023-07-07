package bad;

import java.time.LocalDateTime;

public abstract class LibraryItem {
    private String libraryId;

    private String author;

    private String title;

    private LocalDateTime borrowDate;

    private String borrower;

    private int pages;

    private int checkoutDurationDays;

    public int getCheckoutDurationDays() {
        return checkoutDurationDays;
    }

    public void setCheckoutDurationDays(final int checkoutDurationDays) {
        this.checkoutDurationDays = checkoutDurationDays;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    abstract void checkIn() throws Exception;

    abstract void checkOut(String borrower) throws Exception;

    abstract LocalDateTime getDueDate() throws Exception;
}

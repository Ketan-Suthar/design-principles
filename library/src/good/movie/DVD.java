package good.movie;

import java.time.LocalDateTime;
import java.util.List;


public class DVD implements IBorrowableMovie {
    private int runTimeInMinutes;

    private List<String> actors;

    private String libraryId;

    private String title;

    private String author;

    private int checkoutDurationInDays;

    private String borrower;

    private LocalDateTime borrowDate;

    private int runtimeInMinutes;

    public List<String> getActors() {
        return actors;
    }

    public void setActors(final List<String> actors) {
        this.actors = actors;
    }


    public void AudioBook() {
        setCheckoutDurationInDays(14);
    }

    @Override
    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    @Override
    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

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
    public int getCheckoutDurationInDays() {
        return checkoutDurationInDays;
    }

    @Override
    public void setCheckoutDurationInDays(int checkoutDurationInDays) {
        this.checkoutDurationInDays = checkoutDurationInDays;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    @Override
    public void checkIn() {
        System.out.println("check in...");
        setBorrower("");
    }

    @Override
    public void checkOut(final String borrower) {
        System.out.println("check out...");
        setBorrower(borrower);
        setBorrowDate(LocalDateTime.now());
    }

    @Override
    public LocalDateTime getDueDate() {
        return LocalDateTime.now().plusDays(getCheckoutDurationInDays());
    }


    public int getRunTimeInMinutes() {
        return runTimeInMinutes;
    }

    public void setRunTimeInMinutes(final int runTimeInMinutes) {
        this.runTimeInMinutes = runTimeInMinutes;
    }
}

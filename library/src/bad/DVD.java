package bad;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DVD extends LibraryItem {
    private int runTimeInMinutes;

    private List<String> actors;

    public List<String> getActors() {
        return actors;
    }

    public void setActors(final List<String> actors) {
        this.actors = actors;
    }

    public int getRunTimeInMinutes() {
        return runTimeInMinutes;
    }

    public void setRunTimeInMinutes(final int runTimeInMinutes) {
        this.runTimeInMinutes = runTimeInMinutes;
    }

    public void AudioBook() {
        setCheckoutDurationDays(14);
        setPages(-1);
        setAuthor("");
        actors = new ArrayList<>();
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
        return LocalDateTime.now().plusDays(getCheckoutDurationDays());
    }

}

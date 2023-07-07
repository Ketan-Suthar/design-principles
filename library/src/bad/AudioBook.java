package bad;

import java.time.LocalDateTime;

public class AudioBook extends LibraryItem {
    private int runTimeInMinutes;

    public int getRunTimeInMinutes() {
        return runTimeInMinutes;
    }

    public void setRunTimeInMinutes(final int runTimeInMinutes) {
        this.runTimeInMinutes = runTimeInMinutes;
    }

    public void AudioBook() {
        setCheckoutDurationDays(14);
        setPages(-1);
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

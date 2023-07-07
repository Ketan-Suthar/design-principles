package bad;

import java.time.LocalDateTime;
import java.util.List;

public class Book extends LibraryItem {

    public void Book() {
        setCheckoutDurationDays(14);
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

package good;

import java.time.LocalDateTime;

public interface IBorrowable {
    LocalDateTime getBorrowDate();

    void setBorrowDate(LocalDateTime borrowDate);

    String getBorrower();

    void setBorrower(String borrower);

    int getCheckoutDurationInDays();

    void setCheckoutDurationInDays(int checkoutDurationInDays);

    void checkIn();

    void checkOut(final String borrower);

    LocalDateTime getDueDate();
}

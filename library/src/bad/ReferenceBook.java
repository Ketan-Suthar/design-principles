package bad;

import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDateTime;

public class ReferenceBook extends LibraryItem {

    public void Book() {
        setCheckoutDurationDays(0);
    }

    @Override
    public void checkIn() throws Exception {
        throw new Exception("no check in for reference book");
    }

    @Override
    public void checkOut(final String borrower) throws Exception {
        throw new Exception("no check out for reference book");
    }

    @Override
    public LocalDateTime getDueDate() throws Exception {
        throw new Exception("no due date for reference book");
    }
}

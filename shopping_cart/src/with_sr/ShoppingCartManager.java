package with_sr;

import without_sr.ShoppingCart;

public class ShoppingCartManager {
    private ShoppingCart shoppingCart;
    private PaymentProcessor paymentProcessor;

    public void processPayment(final double amount) {
        // if return type of processPayment changed it will also break ShoppingCart
        final var paymentSuccess = paymentProcessor.processPayment(amount);
        if (paymentSuccess.equals(PaymentStatus.SUCCESS)) {
            // Complete the order and perform additional tasks
            // ...
        } else {
            // Handle failed payment
            // ...
        }
    }
}
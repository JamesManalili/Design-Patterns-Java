package SOLID_Principle;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderProcess();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        Invoice invoice = new InvoiceProcess();
        Notification notification = new NotificationProcess();

        invoice.generateInvoice("order_123.pdf");
        notification.sendEmailNotification("johndoe@example.com");
    }
}

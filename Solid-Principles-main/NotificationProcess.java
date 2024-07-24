package SOLID_Principle;

public class NotificationProcess implements Notification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}

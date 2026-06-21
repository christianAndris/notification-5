/**
 * Driver class.
 *
 * @author Christian Andris
 */
public class Main {

    public static void main(String[] args) {

        NotificationMedium email = new EmailService();
        NotificationMedium sms = new SMSservice();
        NotificationMedium whatsapp = new WhatsAppService();

        Alertsystem alertSystem = new Alertsystem(email);

        // Email notifications
        alertSystem.notifyUser("System update available.");
        alertSystem.notifyUser("Security alert detected.");

        // Switch to SMS
        alertSystem.setMedium(sms);

        alertSystem.notifyUser("SMS test message.");
        alertSystem.notifyUser("Backup completed successfully.");

        // Switch to WhatsApp
        alertSystem.setMedium(whatsapp);

        alertSystem.notifyUser("WhatsApp test message.");
        alertSystem.notifyUser("Maintenance reminder.");

        // Display message log
        alertSystem.displayLog();
    }
}

public class WhatsAppService implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}

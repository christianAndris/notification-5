Notification 5
Description
This project extends the flexible notification system by supporting multiple notification methods, including Email, SMS, and WhatsApp notifications.
Files

Main.java - Entry point for the application
Alertsystem.java - Handles alert generation and delivery
NotificationMedium.java - Base interface/abstraction for notification methods
EmailService.java - Email notification implementation
SMSService.java - SMS notification implementation
WhatsAppService.java - WhatsApp notification implementation
GenAIDoc.txt - Project documentation

Requirements

Java 17 or later
Any Java IDE (IntelliJ IDEA, Eclipse, or VS Code)

How to Run

Download or clone the repository.
Open the project in your Java IDE.
Compile all Java files.
Run Main.java.
Follow the console output to view notification delivery results.

Design
This project demonstrates object-oriented design principles by allowing different notification services to be added through a common notification interface. New notification methods can be integrated with minimal changes to the existing code.
Author
Christian Andris

package ejercicio5;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class NotificadorEmail implements Notificador {
    private String username;
    private String password;
    private String port;
    private String proveedorDeCorreo;
    private String smpt;
    private String tls;
    private String correoReceptor;

    public NotificadorEmail(String username, String password, String port, String proveedorDeCorreo, String smpt, String tls, String correoReceptor) {
        this.username = username;
        this.password = password;
        this.port = port;
        this.proveedorDeCorreo = proveedorDeCorreo;
        this.smpt = smpt;
        this.tls = tls;
        this.correoReceptor = correoReceptor;
    }

    @Override
    public void notificar(String mensaje) {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", this.proveedorDeCorreo);
        prop.put("mail.smtp.port", this.port);
        prop.put("mail.smtp.auth", this.smpt);
        prop.put("mail.smtp.starttls.enable", this.tls);

        Session session = Session.getInstance(prop, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO, InternetAddress.parse(this.correoReceptor));
            message.setSubject("Nueva inscripción a un concurso");
            message.setText(mensaje);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

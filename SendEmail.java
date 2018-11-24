import org.apache.commons.mail.DefaultAuthenticator;
import java.util.regex.*;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import javax.swing.*;

public class SendEmail {
	public static String emailAddressTo;
	public static String emailAddressFrom = "tahsinsy@gmail.com";
	public static String path;
	
	public static int i = 0;
	
	// ="/Users/macbookpro/Desktop/java_eclipse/EclipseProj/JavaCV/src/Capture/ImageOne.java";
	

	@SuppressWarnings("static-access")

	public static void main(String[] args) throws EmailException {
		
		

		JOptionPane jop = new JOptionPane();
		
		

		

		emailAddressTo = jop.showInputDialog("Enter recipient of the email");

		path = jop.showInputDialog("Enter the file path to att doc");
		
		
		//String name = path.replaceAll("[.][a-z].*",);


		// for(int i=0;i<=3;i++) {

		// Create Attachment
		EmailAttachment emailAttachment = new EmailAttachment();
		MultiPartEmail email = new MultiPartEmail();

		if (!path.isEmpty()) {
			emailAttachment.setPath(path);
			emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
			emailAttachment.setDescription(path);
			
			emailAttachment.setName("New Name");
			
			email.attach(emailAttachment);
		}

		jop.showMessageDialog(null, "===================   TEST STARTED   =====================");
		// Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(emailAddressFrom, ""));
		email.setSSLOnConnect(true);
		email.setFrom("tahsinsy@gmail.com");
		email.setSubject("TestMail" + i);
		email.setMsg("This is a test mail ... :-)" + i);
		email.addTo(emailAddressTo);

		email.send();
		jop.showMessageDialog(null, "Email has been sent to; " + emailAddressTo + "\n Successful");
		System.exit(0);
	}

}

//}

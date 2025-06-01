import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentTime{
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yyyy HH:mm:ss");
		String formattedDateTime = now.format(formatter);

		System.out.println("Current Date and Time is:   "  + formattedDateTime);
	}
}
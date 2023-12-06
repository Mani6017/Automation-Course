package dataAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateTime {

	public static void main(String[] args) {
       LocalDateTime dateTime = LocalDateTime.now();
       System.out.println("before format " +dateTime);
       
       DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("E, MMM-dd-yyyy HH-mm-ss");
       
      String formatted = dateTime.format(formatDateTime);     
      System.out.println("After Formatted " + formatted);
       
	}

}

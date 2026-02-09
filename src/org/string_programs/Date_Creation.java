package org.string_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Creation {
	//Date Creation
	public static void main(String[] args) {

		Date date = new Date();
		//	String string = date.toString();
		//	String replaceAll = string.replaceAll(" ", "").replaceAll(":", "");
		//	System.out.println(replaceAll);

		SimpleDateFormat sm = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss");
		String format = sm.format(date);
		System.out.println(format);
	}
}

/**
	ss - seconds
	mm - minutes
	hh/HH - hours
	dd - day in the month
	DD - day in the year (1-365)
	MM - month
	YYYY/yyyy - year
	YY/yy - last 2 digits of year

 */



/**
	// Define the formatter
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");

	// Format the current date and time
	String formattedDateTime = LocalDateTime.now().format(formatter);
	System.out.println(formattedDateTime);
 */


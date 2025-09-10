package Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import util.NumberToWordsUtil;

public class TimeToWordsConverter {
	  public String convert(String time) {
	        LocalTime localTime;
	        try {
	            localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
	        } catch (DateTimeParseException e) {
	            throw new IllegalArgumentException("Time must be in HH:mm format.");
	        }

	        int hour = localTime.getHour();
	        int minute = localTime.getMinute();

	        // Handle special cases
	        if (hour == 0 && minute == 0) return "midnight";
	        if (hour == 12 && minute == 0) return "noon";
	        if (minute == 0) return NumberToWordsUtil.hourToWord(hour) + " o'clock";

	        if (minute == 15) return "quarter past " + NumberToWordsUtil.hourToWord(hour);
	        if (minute == 30) return "half past " + NumberToWordsUtil.hourToWord(hour);
	        if (minute == 45) return "quarter to " + NumberToWordsUtil.hourToWord((hour + 1) % 24);

	        if (minute < 30) {
	            return NumberToWordsUtil.minuteToWord(minute) + " past " + NumberToWordsUtil.hourToWord(hour);
	        } else {
	            int remaining = 60 - minute;
	            return NumberToWordsUtil.minuteToWord(remaining) + " to " + NumberToWordsUtil.hourToWord((hour + 1) % 24);
	        }
	    }

}

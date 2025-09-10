package util;

public class NumberToWordsUtil {
	private static final String[] HOURS = {
            "midnight", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "noon", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven"
    };

    public static String hourToWord(int hour) {
        return HOURS[hour % 24];
    }

    public static String minuteToWord(int minute) {
        switch (minute) {
            case 5: return "five";
            case 10: return "ten";
            case 20: return "twenty";
            case 25: return "twenty-five";
            default: return String.valueOf(minute);
        }
    }

}

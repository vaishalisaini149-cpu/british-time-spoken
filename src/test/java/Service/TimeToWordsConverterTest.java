package Service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeToWordsConverterTest {
	
	 private final TimeToWordsConverter converter = new TimeToWordsConverter();

	    @Test
	    void testNoonAndMidnight() {
	        assertEquals("noon", converter.convert("12:00"));
	        assertEquals("midnight", converter.convert("00:00"));
	    }

	    @Test
	    void testExactHours() {
	        assertEquals("one o'clock", converter.convert("01:00"));
	        assertEquals("ten o'clock", converter.convert("10:00"));
	    }

	    @Test
	    void testQuarterAndHalf() {
	        assertEquals("quarter past four", converter.convert("04:15"));
	        assertEquals("half past seven", converter.convert("07:30"));
	        assertEquals("quarter to ten", converter.convert("09:45"));
	    }

	    @Test
	    void testPastMinutes() {
	        assertEquals("five past two", converter.convert("02:05"));
	        assertEquals("twenty past five", converter.convert("05:20"));
	    }

	    @Test
	    void testToMinutes() {
	        assertEquals("twenty-five to eight", converter.convert("07:35"));
	        assertEquals("ten to eleven", converter.convert("10:50"));
	        assertEquals("five to twelve", converter.convert("11:55"));
	    }

}

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThatMaxReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));

	}
	@Test
	public void testThatMaxReturnsV() {
		assertEquals("IV", number.toRoman(4));
		assertEquals("V", number.toRoman(5));
		assertEquals("VI", number.toRoman(6));
		assertEquals("VII", number.toRoman(7));
		assertEquals("VIII", number.toRoman(8));
	}
	@Test
	public void returnXtests()
	{
		assertEquals("IX",number.toRoman(9));
		assertEquals("X",number.toRoman(10));
		assertEquals("XI",number.toRoman(11));
		assertEquals("XII",number.toRoman(12));
		assertEquals("XIII",number.toRoman(13));
		assertEquals("XIV",number.toRoman(14));
		assertEquals("XV",number.toRoman(15));
		assertEquals("XVI",number.toRoman(16));
		assertEquals("XVII",number.toRoman(17));
		assertEquals("XVIII",number.toRoman(18));
		assertEquals("XIX",number.toRoman(19));
		assertEquals("XX",number.toRoman(20));
		assertEquals("XXI",number.toRoman(21));
		assertEquals("XXII",number.toRoman(22));
		assertEquals("XXIII",number.toRoman(23));
		assertEquals("XXIV",number.toRoman(24));
		assertEquals("XXV",number.toRoman(25));
		assertEquals("XXVI",number.toRoman(26));
		assertEquals("XXVII",number.toRoman(27));
		assertEquals("XXVIII",number.toRoman(28));
		assertEquals("XXIX",number.toRoman(29));
		assertEquals("XXX",number.toRoman(30));
		assertEquals("XXXI",number.toRoman(31));
		assertEquals("XXXII",number.toRoman(32));
		assertEquals("XXXIII",number.toRoman(33));
		assertEquals("XXXIV",number.toRoman(34));
		assertEquals("XXXV",number.toRoman(35));
		assertEquals("XXXVI",number.toRoman(36));
		assertEquals("XXXVII",number.toRoman(37));
		assertEquals("XXXVIII",number.toRoman(38));
		assertEquals("XXXIX",number.toRoman(39));
	}
	@Test
	public void return40to49Ltests()
	{
		assertEquals("XL",number.toRoman(40));
		assertEquals("XLI",number.toRoman(41));
		assertEquals("XLII",number.toRoman(42));
		assertEquals("XLIII",number.toRoman(43));
		assertEquals("XLIV",number.toRoman(44));
		assertEquals("XLV",number.toRoman(45));
		assertEquals("XLVI",number.toRoman(46));
		assertEquals("XLVII",number.toRoman(47));
		assertEquals("XLVIII",number.toRoman(48));
		assertEquals("XLIX",number.toRoman(49));
	}
	@Test
	public void returnMoreThan50Ltests()
	{
		assertEquals("L",number.toRoman(50));
		assertEquals("LI",number.toRoman(51));
		assertEquals("LII",number.toRoman(52));
		assertEquals("LIII",number.toRoman(53));
		assertEquals("LIV",number.toRoman(54));
		assertEquals("LV",number.toRoman(55));
		assertEquals("LVI",number.toRoman(56));
		assertEquals("LVII",number.toRoman(57));
		assertEquals("LVIII",number.toRoman(58));
		assertEquals("LIX",number.toRoman(59));
	}
	

}

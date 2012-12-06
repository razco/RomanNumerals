import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void return1to3Itests() {
		assertEquals("I", number.toRomanWorking(1));
		assertEquals("II", number.toRomanWorking(2));
		assertEquals("III", number.toRomanWorking(3));

	}
	@Test
	public void return4to8Vtests() {
		assertEquals("IV", number.toRomanWorking(4));
		assertEquals("V", number.toRomanWorking(5));
		assertEquals("VI", number.toRomanWorking(6));
		assertEquals("VII", number.toRomanWorking(7));
		assertEquals("VIII", number.toRomanWorking(8));
	}
	@Test
	public void return9to39Xtests()
	{
		assertEquals("IX",number.toRomanWorking(9));
		assertEquals("X",number.toRomanWorking(10));
		assertEquals("XI",number.toRomanWorking(11));
		assertEquals("XII",number.toRomanWorking(12));
		assertEquals("XIII",number.toRomanWorking(13));
		assertEquals("XIV",number.toRomanWorking(14));
		assertEquals("XV",number.toRomanWorking(15));
		assertEquals("XVI",number.toRomanWorking(16));
		assertEquals("XVII",number.toRomanWorking(17));
		assertEquals("XVIII",number.toRomanWorking(18));
		assertEquals("XIX",number.toRomanWorking(19));
		assertEquals("XX",number.toRomanWorking(20));
		assertEquals("XXI",number.toRomanWorking(21));
		assertEquals("XXII",number.toRomanWorking(22));
		assertEquals("XXIII",number.toRomanWorking(23));
		assertEquals("XXIV",number.toRomanWorking(24));
		assertEquals("XXV",number.toRomanWorking(25));
		assertEquals("XXVI",number.toRomanWorking(26));
		assertEquals("XXVII",number.toRomanWorking(27));
		assertEquals("XXVIII",number.toRomanWorking(28));
		assertEquals("XXIX",number.toRomanWorking(29));
		assertEquals("XXX",number.toRomanWorking(30));
		assertEquals("XXXI",number.toRomanWorking(31));
		assertEquals("XXXII",number.toRomanWorking(32));
		assertEquals("XXXIII",number.toRomanWorking(33));
		assertEquals("XXXIV",number.toRomanWorking(34));
		assertEquals("XXXV",number.toRomanWorking(35));
		assertEquals("XXXVI",number.toRomanWorking(36));
		assertEquals("XXXVII",number.toRomanWorking(37));
		assertEquals("XXXVIII",number.toRomanWorking(38));
		assertEquals("XXXIX",number.toRomanWorking(39));
	}
	@Test
	public void return40to49Ltests()
	{
		assertEquals("XL",number.toRomanWorking(40));
		assertEquals("XLI",number.toRomanWorking(41));
		assertEquals("XLII",number.toRomanWorking(42));
		assertEquals("XLIII",number.toRomanWorking(43));
		assertEquals("XLIV",number.toRomanWorking(44));
		assertEquals("XLV",number.toRomanWorking(45));
		assertEquals("XLVI",number.toRomanWorking(46));
		assertEquals("XLVII",number.toRomanWorking(47));
		assertEquals("XLVIII",number.toRomanWorking(48));
		assertEquals("XLIX",number.toRomanWorking(49));
	}
	@Test
	public void return50to89Ltests()
	{
		assertEquals("L",number.toRomanWorking(50));
		assertEquals("LI",number.toRomanWorking(51));
		assertEquals("LII",number.toRomanWorking(52));
		assertEquals("LIII",number.toRomanWorking(53));
		assertEquals("LIV",number.toRomanWorking(54));
		assertEquals("LV",number.toRomanWorking(55));
		assertEquals("LVI",number.toRomanWorking(56));
		assertEquals("LVII",number.toRomanWorking(57));
		assertEquals("LVIII",number.toRomanWorking(58));
		assertEquals("LIX",number.toRomanWorking(59));
		
		assertEquals("LX",number.toRomanWorking(60));
		assertEquals("LXI",number.toRomanWorking(61));
		assertEquals("LXII",number.toRomanWorking(62));
		assertEquals("LXIII",number.toRomanWorking(63));
		assertEquals("LXIV",number.toRomanWorking(64));
		assertEquals("LXV",number.toRomanWorking(65));
		assertEquals("LXVI",number.toRomanWorking(66));
		assertEquals("LXVII",number.toRomanWorking(67));
		assertEquals("LXVIII",number.toRomanWorking(68));
		assertEquals("LXIX",number.toRomanWorking(69));
		
		assertEquals("LXX",number.toRomanWorking(70));
		assertEquals("LXXI",number.toRomanWorking(71));
		assertEquals("LXXII",number.toRomanWorking(72));
		assertEquals("LXXIII",number.toRomanWorking(73));
		assertEquals("LXXIV",number.toRomanWorking(74));
		assertEquals("LXXV",number.toRomanWorking(75));
		assertEquals("LXXVI",number.toRomanWorking(76));
		assertEquals("LXXVII",number.toRomanWorking(77));
		assertEquals("LXXVIII",number.toRomanWorking(78));
		assertEquals("LXXIX",number.toRomanWorking(79));
		
		assertEquals("LXXX",number.toRomanWorking(80));
		assertEquals("LXXXI",number.toRomanWorking(81));
		assertEquals("LXXXII",number.toRomanWorking(82));
		assertEquals("LXXXIII",number.toRomanWorking(83));
		assertEquals("LXXXIV",number.toRomanWorking(84));
		assertEquals("LXXXV",number.toRomanWorking(85));
		assertEquals("LXXXVI",number.toRomanWorking(86));
		assertEquals("LXXXVII",number.toRomanWorking(87));
		assertEquals("LXXXVIII",number.toRomanWorking(88));
		assertEquals("LXXXIX",number.toRomanWorking(89));

	}
	
	@Test
	public void return90to190Ctests()
	{
		
		assertEquals("XC",number.toRomanWorking(90));
		assertEquals("XCI",number.toRomanWorking(91));
		assertEquals("XCII",number.toRomanWorking(92));
		assertEquals("XCIII",number.toRomanWorking(93));
		assertEquals("XCIV",number.toRomanWorking(94));
		assertEquals("XCV",number.toRomanWorking(95));
		assertEquals("XCVI",number.toRomanWorking(96));
		assertEquals("XCVII",number.toRomanWorking(97));
		assertEquals("XCVIII",number.toRomanWorking(98));
		assertEquals("XCIX",number.toRomanWorking(99));
		assertEquals("C",number.toRomanWorking(100));
		
		assertEquals("CXC",number.toRomanWorking(190));
	}
	@Test
	public void return400to499Dtests()
	{
		assertEquals("CD",number.toRomanWorking(400));
		assertEquals("CDXLII",number.toRomanWorking(442));
		assertEquals("CDXXXVII",number.toRomanWorking(437));
		assertEquals("CDLXXXVIII",number.toRomanWorking(488));
		assertEquals("CDLXXXIX",number.toRomanWorking(489));
		assertEquals("CDXCI",number.toRomanWorking(491));
		assertEquals("CDXCIX",number.toRomanWorking(499));
		assertEquals("CDXCIV",number.toRomanWorking(494));

	}
	@Test
	public void return500to890Dtests()
	{
		assertEquals("D",number.toRomanWorking(500));
		assertEquals("DI",number.toRomanWorking(501));
		assertEquals("DL",number.toRomanWorking(550));
		assertEquals("DXXX",number.toRomanWorking(530));
		assertEquals("DCCVII",number.toRomanWorking(707));
		assertEquals("DCCCXC",number.toRomanWorking(890));
		
	}

	@Test
	public void returnMoreThan900Mtests()
	{
		assertEquals("CM",number.toRomanWorking(900));
		assertEquals("CMXCVIII",number.toRomanWorking(998));
		assertEquals("MDCCXII",number.toRomanWorking(1712));
		assertEquals("MCMXC",number.toRomanWorking(1990));
		assertEquals("MCMXCI",number.toRomanWorking(1991));
		assertEquals("MCMXCII",number.toRomanWorking(1992));
		assertEquals("MCMXCIII",number.toRomanWorking(1993));
		assertEquals("MCMXCIV",number.toRomanWorking(1994));
		assertEquals("MCMXCV",number.toRomanWorking(1995));
		assertEquals("MCMXCVI",number.toRomanWorking(1996));
		assertEquals("MCMXCVII",number.toRomanWorking(1997));
		assertEquals("MCMXCVIII",number.toRomanWorking(1998));
		assertEquals("MCMXCIX",number.toRomanWorking(1999));
		assertEquals("MM",number.toRomanWorking(2000));
		assertEquals("MMI",number.toRomanWorking(2001));
		assertEquals("MMII",number.toRomanWorking(2002));
		assertEquals("MMIII",number.toRomanWorking(2003));
		assertEquals("MMIV",number.toRomanWorking(2004));
		assertEquals("MMV",number.toRomanWorking(2005));
		assertEquals("MMVI",number.toRomanWorking(2006));
		assertEquals("MMVII",number.toRomanWorking(2007));
		assertEquals("MMVIII",number.toRomanWorking(2008));
		assertEquals("MMIX",number.toRomanWorking(2009));
		assertEquals("MMX",number.toRomanWorking(2010));
		assertEquals("MMXI",number.toRomanWorking(2011));
		assertEquals("MMXII",number.toRomanWorking(2012));
		assertEquals("MMXIII",number.toRomanWorking(2013));
		assertEquals("MMXIV",number.toRomanWorking(2014));
		assertEquals("MMXV",number.toRomanWorking(2015));
		assertEquals("MMXVI",number.toRomanWorking(2016));
		assertEquals("MD",number.toRomanWorking(1500));
		assertEquals("MDCCC",number.toRomanWorking(1800));
		assertEquals("MMCMXCIX",number.toRomanWorking(2999));
		assertEquals("MMM",number.toRomanWorking(3000));
		assertEquals("MMCMXLIX",number.toRomanWorking(2949));
		assertEquals("MMDXLIX",number.toRomanWorking(2549));
		assertEquals("MMCDXLIX",number.toRomanWorking(2449));
	}

	//CMXCVIII=998 or MDCCXII=1712
	/*
	 * 1900 	MCM
1990 	MCMXC
1991 	MCMXCI
1992 	MCMXCII
1993 	MCMXCIII
1994 	MCMXCIV
1995 	MCMXCV
1996 	MCMXCVI
1997 	MCMXCVII
1998 	MCMXCVIII
1999 	MCMXCIX
2000 	MM
2001 	MMI
2002 	MMII
2003 	MMIII
2004 	MMIV
2005 	MMV
2006 	MMVI
2007 	MMVII
2008 	MMVIII
2009 	MMIX
2010 	MMX
2011 	MMXI
2012 	MMXII
2013 	MMXIII
2014 	MMXIV
2015 	MMXV
2016 	MMXVI
1500	MD
1800	MDCCC
2999	MMCMXCIX
3000	MMM
2949	MMCMXLIX


	 */

}

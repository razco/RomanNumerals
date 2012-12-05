
public class RomanNumerals {

	public String toRoman(int number) {
		String toRoman="";
		if (number <= 3)
		{
			for(int i=0;i<number;i++)
				toRoman+= "I";
		}
		else if(number== 4)
			toRoman+= "IV";
		else if(number==5)
			toRoman+= "V";
		return toRoman;
	}

}

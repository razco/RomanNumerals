
public class RomanNumerals {

	public String toRoman(int number) {
		String toRoman="";
		if(number==6)
			toRoman+= "VI";
		if(number== 4)
			toRoman+= "IV";
		if(number==5)
			toRoman+= "V";
		if (number <= 3)
		{
			for(int i=0;i<number;i++)
				toRoman+= "I";
		}
		return toRoman;
	}

}

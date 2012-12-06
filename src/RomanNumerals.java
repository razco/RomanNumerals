
public class RomanNumerals {

	/*these arrays save data for fast Arabic to Roman numerals conversion*/
	private int newRomanPreSignLoc[];
	private int newRomanSignLoc[];
	private String newRomanPreSign[];
	private String newRomanSign[];
	
	public RomanNumerals()
	{
		newRomanPreSignLoc=new int[6];
		newRomanPreSignLoc[0]=900;
		newRomanPreSignLoc[1]=400;
		newRomanPreSignLoc[2]=90;
		newRomanPreSignLoc[3]=40;
		newRomanPreSignLoc[4]=9;
		newRomanPreSignLoc[5]=4;
		
		newRomanSignLoc=new int[6];
		newRomanSignLoc[0]=1000;
		newRomanSignLoc[1]=500;
		newRomanSignLoc[2]=100;
		newRomanSignLoc[3]=50;
		newRomanSignLoc[4]=10;
		newRomanSignLoc[5]=5;
		
		newRomanPreSign=new String[6];
		newRomanPreSign[0]="CM";
		newRomanPreSign[1]="CD";
		newRomanPreSign[2]="XC";
		newRomanPreSign[3]="XL";
		newRomanPreSign[4]="IX";
		newRomanPreSign[5]="IV";
		
		newRomanSign=new String[6];
		newRomanSign[0]="M";
		newRomanSign[1]="D";
		newRomanSign[2]="C";
		newRomanSign[3]="L";
		newRomanSign[4]="X";
		newRomanSign[5]="V";
		
	}
	
	public String toRoman(int number)
	{
		String toRoman="";
		int i=0;
		while(i<newRomanSignLoc.length)
		{
			while(number>=newRomanSignLoc[i])
			{
				toRoman+=newRomanSign[i];
				number-=newRomanSignLoc[i];
			}
			if(number>=newRomanPreSignLoc[i])
			{
				toRoman+=newRomanPreSign[i];
				number-=newRomanPreSignLoc[i];
			}
			i++;
		}
		for(i=0;i<number;i++)
			toRoman+= "I";
		return toRoman;
	}
	
	/*
	public String toRomanWorking(int number) {
		String toRoman="";
		if(number>899)
		{
			while(number>=1000)
			{
				toRoman+="M";
				number-=1000;
			}
			if(number>=900)
			{
				toRoman+="CM";
				number-=900;
			}
		}
		if(number>399)
		{
			while(number>=500)
			{
				toRoman+="D";
				number-=500;
			}
			if(number>=400)
			{
				toRoman+="CD";
				number-=400;
			}
		}
		if(number>89)
		{
			while(number>=100)
			{
				toRoman+="C";
				number-=100;
			}
			if(number>=90)
			{
				toRoman+="XC";
				number-=90;
			}
		}
		if(number>39)
		{
			while(number>=50)
			{
				toRoman+="L";
				number-=50;
			}
			if(number>=40)
			{
				toRoman+="XL";
				number-=40;
			}
		}
		if(number>8)
		{
			while(number>=10)
			{
				toRoman+="X";
				number-=10;
			}
			if(number==9)
			{
				toRoman+="IX";
				number-=9;
			}
		}
		if(number>3)
		{
			while(number>=5)
			{
				toRoman+="V";
				number-=5;
			}
			if(number== 4)
			{
				toRoman+= "IV";
				number-=4;
			}

		}
		
		if (number <= 3)
		{
			for(int i=0;i<number;i++)
				toRoman+= "I";
		}
		return toRoman;
	}
	*/

}

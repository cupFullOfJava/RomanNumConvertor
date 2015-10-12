import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Integer to Roman Numeral converter.
 * @author jeremytimothybrown
 */

public class RomanNumerals {
	
	private static int num;

	/**
	 * Gets number between 1 to 3,999 from the user.
	 * Prints out the Roman numeral version of number.
	 * @param args the command line arguments (Ignored).
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		while(num < 1 || num > 3999){
			
			System.out.print("Enter a positive integer up to 3,999: ");
			num = in.nextInt();
			
			if (num < 1 || num > 3999){ System.out.println("Can not compute...try again. \n");}
		}
		System.out.print("The decimal "+num+" is ");
		
		String romanNumeral = convertNum();
		
		System.out.print(romanNumeral+" in Roman Numerals.");
		
	}
	
	/**
	 * Converts the decimal number to the correct Roman numeral.
	 * @return romNum the final converted Roman numeral.
	 */
	public static String convertNum(){
		
		String romNum = "";
		int length = (int)(Math.log10(num)+1);
		List<Integer> digits = new LinkedList<Integer>();
		
		while (num>0) {
		    digits.add(0, num%10);
		    num=num/10;
		}
		
			
		if (length==4){
			romNum = thousands(digits.get(0));
			
			if(digits.get(1)!=0){
				String romNumHundreds = hundreds(digits.get(1));
				romNum = romNum+romNumHundreds;
			}
			else if(digits.get(2)!=0){
				String romNumTens = tens(digits.get(2));
				romNum = romNum+romNumTens;
			}
			else if(digits.get(3)!=0){
				String romNumOnes = ones(digits.get(3));
				romNum = romNum+romNumOnes;
			}
		
		}
		
		else if (length==3){
			romNum = hundreds(digits.get(0));

			if(digits.get(1)!=0){
				String romNumTens = tens(digits.get(2));
				romNum = romNum+romNumTens;
			}
			else if(digits.get(2)!=0){
				String romNumOnes = ones(digits.get(2));
				romNum = romNum+romNumOnes;
			}
		}
		
		else if (length==2){
			romNum = tens(digits.get(0));
			if(digits.get(1)!=0){
				String romNumOnes = ones(digits.get(1));
				romNum = romNum+romNumOnes;
			}
		}
		
		else if (length==1){
			romNum = ones(digits.get(0));
		}

		return romNum;
		
	}
	
	/**
	 * Converts the thousands to Roman numeral.
	 * @param n the thousands decimal number.
	 * @return retRoman the tens in Roman numeral form.
	 */
	public static String thousands(int n){
		if (n==1){
			return "M";
		}		
		else if (n==2){
			return "MM";
		}
		else {
			return "MMM";
		}
	}
	
	/**
	 * Converts the hundreds to Roman numeral.
	 * @param n the hundreds decimal number.
	 * @return retRoman the hundreds in Roman numeral form.
	 */
	public static String hundreds(int n){
		
		String retRoman = "";
		
		if (n==1){
			retRoman = "C";
		}
		else if (n==2){
			retRoman = "CC";
		}
		else if (n==3){
			retRoman = "CCC";
		}
		else if(n == 4){
			retRoman = "CD";
		}
		else if(n == 5){
			retRoman = "D";
		}
		else if (n==6){
			retRoman = "DC";
		}
		else if (n==7){
			retRoman = "DCC";
		}
		else if (n==8){
			retRoman = "DCCC";
		}
		else if(n == 9){
			retRoman = "CM";
		}
		
		return retRoman;
		
	}
	
	/** Converts the tens to Roman numeral.
	 * @param n the tens decimal number.
	 * @return retRoman the tens in Roman numeral form.
	 */
	public static String tens(int n){
		
		String retRoman = "";
		
		if (n==1){
			retRoman = "X";
		}
		else if (n==2){
			retRoman = "XX";
		}
		else if (n==3){
			retRoman = "XXX";
		}
		else if(n == 4){
			retRoman = "XL";
		}
		else if(n == 5){
			retRoman = "L";
		}
		if (n==6){
			retRoman = "LX";
		}
		else if (n==7){
			retRoman = "LXX";
		}
		else if (n==8){
			retRoman = "LXXX";
		}
		else if(n == 9){
			retRoman = "XC";
		}
		
		return retRoman;
		
	}
	
	/**
	 * Converts the ones to Roman numeral.
	 * @param n the ones decimal number.
	 * @return retRoman the ones in Roman numeral form.
	 */
	public static String ones(int n){
		String retRoman = "";
		
		if (n==1){
			retRoman = "I";
		}
		else if (n==2){
			retRoman = "II";
		}
		else if (n==3){
			retRoman = "III";
		}
		else if(n == 4){
			retRoman = "IV";
		}
		else if(n == 5){
			retRoman = "V";
		}
		else if (n==6){
			retRoman = "VI";
		}
		else if (n==7){
			retRoman = "VII";
		}
		else if (n==8){
			retRoman = "VIII";
		}
		else if(n == 9){
			retRoman = "IX";
		}
		

		return retRoman;
		
	}

}

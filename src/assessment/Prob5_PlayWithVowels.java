package assessment;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;


/*	A subsequence is a sequence of letters in a string, in order, but with any
	number of characters removed. Vowels in order are the letters in the
	string aeiou. Given a string, determine the length of the longest
	subsequence that contains all of the vowels, in order, and no vowels
	out of order.
	Examples
	s = 'aeeiiouu'
	All 5 vowels are present in the correct order, so the length of the
	entire string, 8, is returned*/

public class Prob5_PlayWithVowels {
	
	//@Test
	public void eg1() {
		String input="aeeiiouu";
		System.out.println("One: "+playwithvowels(input));
	}
	
	
	//@Test
	public void eg2() {
		String input="aeeiiaouu";
		System.out.println("Two: "+playwithvowels(input));
	}
	
	//@Test
	public void eg3() {
		String input="aeiaaioooaauuaeiu";
		System.out.println("Three: "+playwithvowels(input));
	}
	
	//@Test
	public void eg4() {
		String input="uaeiouiiou";
		System.out.println("Four: "+playwithvowels(input));
	}
	
	@Test
	public void eg5() {
		String input="uaeiouiiou";
		System.out.println("Five: "+vowels(input));
	}
	
	private int playwithvowels(String s) {
		String output="";
		
		for (int i = 0; i < s.length(); i++) {
			if((int)s.charAt(i)==97 && output.length()==0) {
				output+=s.charAt(i);
			}
			else if(output.length()>0) {
				if((int)s.charAt(i)>=(int)s.charAt(i-1)
						&&(int)s.charAt(i)>=(int)output.charAt(output.length()-1)){
					output+=s.charAt(i);
				}
				
			}
		}
		
		Set<Character> outputset= new HashSet<Character>();
		for (char value : output.toCharArray()) {
			outputset.add(value);
		}
		
		if(outputset.size()==5) {
			return output.length();
		}
		
		return 0;
	}

	
	
	
	private int vowels(String s) {
		char[] array=s.toCharArray();
	    int counta=0;
	    int counte=0;
	    int counti=0;
	    int counto=0;
	    int countu=0;
	    int i=0;
	    for(;i<array.length;i++)
	    {
	        if(array[i]=='a')
	        {
	            break;
	        }
	    }
	    for(;i<array.length;i++)
	    {
	        switch(array[i])
	        {
	            case 'a': counta++;
	            break;
	            case 'e': counte=Math.max(counta,counte)+1;
	                      
	            break;
	            case 'i': counti=Math.max(counti,counte)+1;
	                      
	            break;
	            
	            case 'o': counto=Math.max(counti,counto)+1;
	                      
	            break;
	            case 'u': countu=Math.max(counto,countu)+1;
	                     
	            break;
	            
	        }
	    }
	    
	     return countu;
	    }
	
	
	
}

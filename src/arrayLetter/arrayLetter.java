package arrayLetter;

public class arrayLetter {

	   	public static boolean AllLettersInArray(char array[]) {
	         	
	         	char allLetters[]=new char[26];
	    
	         	for(int i=0;i<array.length;i++)
	                	if(array[i]>='A' && array[i]<='Z')
	                       	allLetters[array[i]-'A']++;
	         	
	         	for(int i=0;i<allLetters.length;i++)
	                	if(allLetters[i]==0)
	                       	return false;
	         	
	         	return true;
	         	
	         	int allDigits[]=new int[26];
	    	    
	         	for(int i=0;i<array.length;i++)
	                	if(array[i]>=1 && array[i]<=26)
	                       	allDigits[array[i]-1]++;
	         	
	         	for(int i=0;i<allDigits.length;i++)
	                	if(allDigits[i]==0)
	                       	return false;
	         	
	         	return true;
	         	
	         	
	   	}
	   	
	   	public static void main(String[] args) {
	         	
	         	char myArray[]="abcgytfjfskjlkkuhkgcxssshddh".toCharArray();
	         

	}

}

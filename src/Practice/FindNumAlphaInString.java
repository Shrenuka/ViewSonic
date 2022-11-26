package Practice;

public class FindNumAlphaInString {

	public static void main(String args[]) {
		
		//Program to check 8 characters, among them 5 alphabets and 3 digits 
		
		String s = "ad2fh67s8g2";
		int  alpha_count=0, num_count=0;
		
		char ch[] = s.toCharArray();
		
		if(ch.length==8) {	
			for(int i=0; i<ch.length; i++) {			
				
				if(Character.isAlphabetic(ch[i])) {
					alpha_count++;
				}		
				
				if(Character.isDigit(ch[i])) {
					num_count++;
				}
			}
			if(alpha_count==5 && num_count==3) {
				System.out.println("String is valid");
			}
			else {
				System.out.println("String is invalid");
			}
		}
		else {
			System.out.println("String is invalid");
		}
	}
}

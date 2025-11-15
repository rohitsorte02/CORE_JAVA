package stringBasedProgramming;

public class CaseConversion {
	public static String caseConversion(String s){
		char c[] = s.toCharArray();	
		for(int i=0;i<s.length();i++) {
			if(c[i]>='A' && c[i]<='Z') {
				c[i]=(char) (c[i]+32);
			} else if(c[i]>='a' && c[i]<='z') {
				c[i]=(char) (c[i]-32);
			}
			}
		String c1 = new String(c);
		return c1;
			
		}
		
 public static void main(String[] args) {
	String s = "rohit a sorte";
	System.out.println("String "+s+" after case conversion is: "+ caseConversion(s));
	}

}

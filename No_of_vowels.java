package strings;
import java.util.*;
public class No_of_vowels {
    public static int vowels(String s) {
    	int count=0;
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    		{
    			//to print no.of consonants put ! to above condition like ch!='a' for all vowels
    			//and put and operator because consonant(example p)should not be equal to none of them.
    			//so ch!='a'&&ch!=e ...etc
    			count++;
    		}
    	}
    	return count;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter string");
     String s=scan.next();
     int res=vowels(s);
     System.out.println(res);
	}

}

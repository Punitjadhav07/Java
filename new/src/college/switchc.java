import java.util.*;

public class switchc {
    
	public static void main(String[] args)
	{	char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Alphabet");
		ch = sc.next().charAt(0);
		switch(ch)
		{
            case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :System.out.println("It is a Vowel");
		break;
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :System.out.println("It is Vowel");
		break;
		default : System.out.println("It is consonant");	
		}
	}
}
    


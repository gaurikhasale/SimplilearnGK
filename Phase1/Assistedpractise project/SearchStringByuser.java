package practiseAssisted1;
import java.util.Scanner;
public class SearchStringByuser {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
		System.out.println("Enter no of words");
		n=sc.nextInt();
		sc.skip(System.lineSeparator());
		String[] word=new String[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("words "+(i+1));
			word[i]=sc.nextLine();
		}
		sc.close();
		System.out.println("words are");
		for (int i=0;i<n;i++)
		{
			System.out.println(word[i]);
			
		}

	}

}

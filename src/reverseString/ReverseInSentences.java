package reverseString;
import java.util.Scanner;
public class ReverseInSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ex = new Scanner(System.in);
		System.out.println("enter the sentence ");
		     String given = ex.nextLine();
		     ex.close();
		     
		     
		
		
		String reverse = "";
		
		String[] sentence = given.split(" "); // split the word along with removing space
		/*System.out.println(sentence.length);
		
		System.out.println(sentence[0]);
		System.out.println(sentence[1]);
		System.out.println(sentence[2]);
		System.out.println(sentence[3]);*/
		
		for(int i = sentence.length-1; i >= 0; i--) {
			reverse += sentence[i]+ " ";
					

		}
				System.out.println(reverse);		
				



		

	}

}

import java.util.Scanner;
public class Zero {

	public static void main(String[] args) {
		int score;
		
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.print("성적을 입력하시오: ");
		score = input.nextInt();
		
		
		if(score >= 95)
			System.out.println("학점 A+");
		else if(score >= 90)
			System.out.println("학점 A0");
		else if(score >= 85)
			System.out.println("학점 B+");
		else if(score >= 80)
			System.out.println("학점 B0");
		else if(score >= 75)
			System.out.println("학점 C0+");
		else if(score >= 70)
			System.out.println("학점 C0");
		else if(score >= 65)
			System.out.println("학점 D+");
		else if(score >= 60)
			System.out.println("학점 D0");
		else
			System.out.println("학점 F");
		}while(score !=0);
		
		System.out.println("학점 입력을 종료합니다.");
	}

}

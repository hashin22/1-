
public class DiceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIZE = 6;
		
		int[] freq = new int[SIZE];
		
		for (int i = 0; i < freq.length; i++) 
			++freq[(int)Math.random() * SIZE];	
		
		
		System.out.println("===================================");
		System.out.println("         �ֻ��� ��           ���� ���� �հ�            ");
		System.out.println("===================================");

		
		for (int j = 0; j< SIZE; j++) 
			System.out.println("           " + j + "       " + freq[j]+ "     ");
	}
}

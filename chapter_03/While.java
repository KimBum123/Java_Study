package chapter_03;

public class While {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i<= 10)
		{		
			sum += i;
			i += 1;
		}
		
		System.out.println("1부터 10까지의 합: "+sum);

	}

}

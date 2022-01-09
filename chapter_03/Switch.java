package chapter_03;


public class Switch {

	public static void main(String[] args) {
		
		/*
		 * A+ 100
		 * A 90-99
		 * B 80-89
		 * C 70-79
		 */
		
		
		int score = 87;
		String grade = "";
		
		switch (score/10) {
		case 10:
			grade = "A+";
			break;
			
		case 9:
			grade = "A";
			break;
			
		case 8:
			grade = "B";
			break;
			
		case 7:
			grade = "C";
			break;
			
		}
		
		System.out.println("점수: "+score);
		System.out.print("성적: ");
		System.out.println(grade);
		
		
		
		

	}

}

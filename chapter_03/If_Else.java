package chapter_03;

public class If_Else {

	public static void main(String[] args) {
		
		
		int x = 10;
		System.out.println("X: "+x);
		
		if(x%2 ==0) {
			System.out.println("X는 짝수입니다.");
		}
		else if(x%2 != 0 ) {
			System.out.println("X는 홀수입니다.");
		}
		
		int y = 17;
		int counter = 0;
		System.out.println("y: "+y);
		for(int i = 1; i <= y; i++)
		{
			if(y%i==0){
				counter++;
			}
		}
		
		if(counter == 2)
		{
			System.out.println("y는 소수입니다.");
		}
		
		
		int z = 98;
		if(z>90 &&z<100) {
			System.out.println("z: "+z+"\n100 > Z > 90");
		}
		
		
		}

}

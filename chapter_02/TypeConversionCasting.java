package chapter_02;

public class TypeConversionCasting {

	public static void main(String[] args) {
	
		/*숫자형 랭킹 
		 * 넓은 범위의 값을 가질수록 랭크가 높다 
		 * byte < short < i.nt < long < float < double
		 * 높은랭크 -> 낮은랭크 로만 타입 변환 가
		 */
		
		
		double x = 3.14;
		int y = (int)x; //(i.nt)처럼 형변환을 하지 않으면 double->i.nt 불가 
		System.out.println("X: double -> int  :"+y);
		
		int var1 = 9;
		int var2 = 5;
		
		System.out.println("9/5 = "+ (double)var1/var2);
		
		char ch = 'a';
		System.out.println("문자: "+ch);
		int in = (int)ch;
		System.out.println("문자 -> 숫자(유니코드값): "+in);
		
		
		

		

	}

}

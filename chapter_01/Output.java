package chapter_01;


public class Output {

	public static void main(String[] args) throws Exception {
		
		/*출력 메소드: System.out println, print, printf -> C와 동일
		 * 
		 * printf 메소드 
		 * %d 정수 
		 * %l 실수a
		 * %s 문자열 
		 * 
		 * 변환문자가 2개 이상일 경우에는순번을 알려주어야한다
		 * 1$,2$,3$,,,
		 *  
		 * read()
		 * 입력된 키의 키코드를 읽음 
		 */
		
		System.out.printf("이름: %1$s   나이: %2$d\n", "김상범 ", 21);
		
		int KeyCode;
		KeyCode = System.in.read();
		System.out.println("keycode: "+ KeyCode);
		

	}

}

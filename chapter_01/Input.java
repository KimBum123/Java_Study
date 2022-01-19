package chapter_01;

import java.util.Scanner;

/*
 * 클래스_이름 객체_이름 = new 클레스_이름
 * Scanner sc = new Scanner(System.in);
 * 
 * 
 * (type)형 입력: sc.next(type);
 * String 입력: sc.nextLine();
 * Int형 입력: sc.nextInt();
 * Double형 입력: sc.nextDouble();
 * 
 * 
 */


public class Input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		int num;
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		name = scanner.nextLine();
		
		System.out.print("2. 나이: ");
		age = scanner.nextInt();
		
		System.out.print("3. 번호: ");
		num = scanner.nextInt();
		
		
		System.out.println("\n[입력한 내용]");
		System.out.printf("이름: %s\n나이: %d\n번호: %s",name,age,num);
		
		scanner.close(); // close 필요!!
		

	}

}

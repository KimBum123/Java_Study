package chapter_04;

public class Array {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		
	
		//배열명.length -> 배열의 길이 
		
		for(int i = 0; i < intArray.length; i ++)
		{
			System.out.println(intArray[i]);
		}
		
		//for-each(향상된 for 문): 값을 불러오기만 가능, 수정불
		for(int i: intArray)
		{
			System.out.println(i);
		}
		
		
		System.out.println("얕은복사 ");
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		System.out.println(arr2[0]);
		arr1[0] = 100;
		System.out.println(arr2[0]); // 얕은복사: 객체의 주소값 복
	
		System.out.println("깊은복사 ");
		int[] arr3 = {6,7,8,9,10};
		int[] arr4 = arr3.clone();
		System.out.println(arr4[0]);
		arr3[0] = 600;
		System.out.println(arr4[0]);
		
	}

}

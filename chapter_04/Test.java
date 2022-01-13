package chapter_04;

public class Test {

	public static void main(String[] args) {
		int counter = 0;
		
		int[] arr = {1,1,1,0,0,1,1,1,0};
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == 1)
			{
				counter++;
			}
		}
		
		
		System.out.println(counter);
	}

}

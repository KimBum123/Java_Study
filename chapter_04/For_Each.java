package chapter_04;

public class For_Each {

	public static void main(String[] args) {
		
		int[] intArray = new int[30];
        for(int i = 0; i < intArray.length; i++)
        {
            intArray[i] = 1001+i;
        }
        
        String[] remainder = {"Zero","One","Two","Three"};
        
        
        /*
        int[] index = new int[30];
        for(int i = 0; i < index.length; i++)
        {
            index[i] = (intArray[i]%4);
        }
        
        for(int x: index)
        {
            System.out.println(remainders[x]);
        }
        
        */
        
        for(int i: intArray)
        {
        	System.out.println(remainder[i%4]);
        }
        
	}

}

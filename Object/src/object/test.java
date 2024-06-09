package object;

public class test {

	
	public static int[] reverseArray(int[] array) {
		 
        int[] result = new int[array.length]; 
        for (int i=0, j=result.length-1; i<array.length; i++, j--) {
            result[j] = array[i];
        }
 
        return result;
    }
    
    public static void main(String[] args) {
 
        int[] numbers = { 1000, 2000, 3000, 4000, 5000 };
        
        int[] reversedNumbers;
 
        reversedNumbers = reverseArray(numbers);
 
        for (int i=0; i<reversedNumbers.length; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }
 
    }

	
	
}

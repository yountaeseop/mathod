package Java2021_10_22_mathod;

public class Java_mathod {

	public static void main(String[] args) {
		
		printEven(10); // 출력: 2 4 6 8 10
	    printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
	    printEven(5); // 출력: 2 4 
		
	}
	
	public static boolean isEven(int num) {
		
		if(num % 2 == 0) {
			return true;
		}
		else /*(num % 2 != 0)*/ { // 이렇게 하는게 왜 아닐까?
							//(num % 2 != 0) 이부분을 없애면 잘됨
			return false; 
		}
		
		
	  }

	  public static void printEven(int n) {
	     // isEven 메서드를 이용. 
		  
		  for(int i = 1; i <= n; i++) {
			  if(isEven(i)) {
				  System.out.print(i+" ");
			  }
			  System.out.println();
		  }

	  }

}

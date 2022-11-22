package generic;

public class FindMaximum {
	
	// Method with parameters as Integer
	public static Integer findMax(Integer a,Integer b,Integer c) {
		
		int max = a;//assume initially a is maximum
		// comparing numbers using compareTo method.
		if (b.compareTo(max) > 0 ) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		
		return max ;
	}

	public static void main(String[] args) {
		
		//FindMaximum maximum = new FindMaximum();
		//here need not create object becase method in static.
		System.out.println("Maximum of among 3 integers is "+findMax(5, 8, 2));

	}

}

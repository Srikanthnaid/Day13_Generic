package generic;

public class FindMaximum {
	
	// Method with parameters as Integer
	public static Integer findMax(Integer a,Integer b,Integer c) {
		
		int max = 0;
		// comparing numbers using compareTo method.
		if(a.compareTo(b)>0 && a.compareTo(c)>0) {
			max = a;
		}else if(b.compareTo(a)>0 && b.compareTo(c)>0) {
			max = b;
		}else if(c.compareTo(a)>0 && c.compareTo(b)>0) {
			max = c;
		}
		return max ;
	}

	public static void main(String[] args) {
		
		FindMaximum maximum = new FindMaximum();
		System.out.println("Maximum of among 3 integers is "+findMax(5, 8, 2));

	}

}

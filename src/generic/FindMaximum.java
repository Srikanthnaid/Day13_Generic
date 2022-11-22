package generic;

public class FindMaximum {
	
	// Method with parameters as Integer
	public static Integer findMax(Integer a,Integer b,Integer c) {
		
		// comparing numbers using compareTo method.
		if(a.compareTo(b)>0 && a.compareTo(c)>0) {
			System.out.println("Maximum of "+a);
		}else if(b.compareTo(a)>0 && b.compareTo(c)>0) {
			System.out.println("Maximum of "+b);
		}else if(c.compareTo(a)>0 && c.compareTo(b)>0) {
			System.out.println("Maximum of "+c);
		}
		return c ;
	}

	public static void main(String[] args) {
		
		FindMaximum maximum = new FindMaximum();
		maximum.findMax(5, 8, 2);

	}

}

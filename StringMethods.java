public class StringMethods {

	public static void main(String[] args) {
		
		String s1="Hello"; //String Literal -->String Constant Pool Memory s1 var
		
		String s2= new String("World"); // new Operator -- in both Heap and SCP
		
		s1=s1.concat("World");
		
		System.out.println(s1);
		
		int i=10;
		String str14=""+i;
		str14=str14.valueOf(i);
		
		String str15= "Java is a programming Language.";
	
		System.out.println(str15);
		

		
	}

}

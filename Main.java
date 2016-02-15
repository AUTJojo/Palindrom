
public class Palindrom {
	public static void main(String[] args) {
		System.out.println(rekursion("anna")); //True
		System.out.println(rekursion("sos")); //True
		System.out.println(rekursion("test")); //False
		System.out.println(rekursion("bibi")); //False
	}
	
	private static boolean rekursion(String s)
	{
		if ( s.length()==0 || s.length()==1 ) {
			return true;
	    }
	         
	    if (s.charAt(0) == s.charAt(s.length()-1)){
	        return rekursion(s.substring(1, s.length()-1));
	    }
	      
	    return false;
	}
}

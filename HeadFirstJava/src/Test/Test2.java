package Test;

class StringZ{
	public String check(String s) {
		if(s.length() == 0 || s == null) {
			return "EMPTY";
		}
		return "Not";
	}
}

public class Test2 {
	public static void main(String[] args) {
		StringZ va = new StringZ();
		va.check(null);
	}
}

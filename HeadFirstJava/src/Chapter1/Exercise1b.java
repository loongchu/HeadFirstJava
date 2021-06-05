package Chapter1;

public class Exercise1b {
   public static void main(String[] args) {
	   int x = 0;
	   
	   while(x < 1) {
		   System.out.print("a");
		   if(x < 1) {
			   System.out.print(" ");
		   }
		   System.out.println("noise");
		   if(x < 4) {
			   System.out.print("an");
			   x = x + 1;
		   }
		   if(x == 1) {
			   System.out.println("noys");
		   }
		   if(x > 0) {
			   System.out.print("an");
		   }
		   System.out.println(" oysters");
	   }
   }
}
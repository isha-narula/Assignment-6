package Inherit;
class Test {
    static int i;
    int j;
     
    // start of static block 
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block 
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Test.i); 
	}

}

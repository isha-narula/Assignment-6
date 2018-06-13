package Inherit;

public class fun_overload {
int pr(int n1)
    {
    return n1;
    }
double pr(double n2)
    {
    return n2;
    }
public static void main(String args[])
{
	fun_overload fov = new fun_overload();
	System.out.print(fov.pr(3));
	System.out.print(fov.pr(4.5));
}
}

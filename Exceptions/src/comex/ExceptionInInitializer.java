package comex;

public class ExceptionInInitializer {
//static int i=10/0;
static{
	String s=null;
	System.out.println(s.length());
}
public static void main(String[] args) {
	//System.out.println(i);
}

}

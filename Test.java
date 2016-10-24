public class Test
{
//static{
//print(10);No need of this statment
//} 
static void print (int x) 
{
System.out.println (x);
System.exit(0);
}
}
class Example
{
	public static void main(String[] arg)
	{
		Test t=new Test();
		t.print(10);
	}
}


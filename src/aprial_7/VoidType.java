package aprial_7;

public class VoidType {
public void message()
{
	System.out.println("message");
}
public int add(int x,int y)
{
	int z=x+y;
	return z;
}
public String verifyString(String str1,String str2)
{
String res=null;
if(str1.equals(str2))
{
	res="string are matching";
}
else
{
	res="String are not matching";
}
return res;
}
public boolean compare(int a,int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo x=new demo();
		x.message();
		int res=x.add(234,567);
		System.out.println(res);
		String result=x.verifyString("hello","Hello");
		System.out.println(result);
		boolean res1=x.compare(100,10);
		System.out.println(res1);
		
		
		

	}

}

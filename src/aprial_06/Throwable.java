package aprial_06;

public class Throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=100,y=300;
if(x==y)
{
	System.out.println("x and y values are not equal");
}
else
{
	try{
		throw new Error("x and y values are not equal");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	
	}
}
	}

}

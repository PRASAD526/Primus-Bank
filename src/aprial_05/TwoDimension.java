package aprial_05;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String login[][]=new String[4][2];
login[0][0]="Admin1";
login[0][1]="teat1";
login[1][0]="Admin2";
login[1][1]="test2";
login[2][0]="Admin3";
login[2][1]="test3";
login[2][2]="Admin4";
login[3][1]="test4";
System.out.print("row length is::"+login.length);
System.out.println("length of cell in first row::"+login[0].length);
for(int i=0;i<login.length;i++)
{
	for(int j=0;j<login[0].length;j++)
	{
		System.out.println(login[i][j]+"\t");
	}
	}
}

	}



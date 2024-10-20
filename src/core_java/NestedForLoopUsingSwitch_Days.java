package core_java;

public class NestedForLoopUsingSwitch_Days
{

	public static void main(String[] args) 
	{
		for(int i =1;i<=52;i++)
		{
			System.out.println("Week : "+i);
			for(int j=1;j<=7;j++)
			{
				switch (j) {
				case 1:
					System.out.println("monday");
					break;
				case 2:
					System.out.println("tuesday");
					break;
				case 3:
					System.out.println("wednesday");
					break;
				case 4:
					System.out.println("thusday");
					break;
				case 5:
					System.out.println("friday");
					break;
				case 6:
					System.out.println("saturday");
					break;
				case 7:
					System.out.println("sunday");
					break;	
				default:
					break;
				}
			}
		}
	}

}

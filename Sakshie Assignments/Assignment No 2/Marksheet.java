import java.util.Scanner;
public class Marksheet{


	
		public static void main(String[] args) {
			//int marks[]=new dt[size];
			int marks[]=new int[6];
			int i;//loop counter
			int tot=0,fs=0;
			float per;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 6 sub marks (count of 100):");
			for(i=0;i<6;i++)
			{
				marks[i]=sc.nextInt();
				
				tot= tot+marks[i];
			}  
			per=(float)(tot/600)*100;
			for(i=0;i<6;i++)
			{
				if(marks[i]<40)
				{
					fs=fs+1;
				}
			}
			if(fs>3)
			{
				System.out.println("Result:Failed");
			}
			else if (fs>0 &&fs<=3)
			{
				System.out.println("Result:KT");
			}
			else
			{
				System.out.println("Result:Passed");
			}
		}
		


}
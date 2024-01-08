import java.util.Scanner;

public class evenPairs {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2==0 && a[j]%2==0)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}

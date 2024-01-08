import java.util.Scanner;

public class pairsWithSumGreaterthanK {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int k=scan.nextInt();
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum>k)
				{
					System.out.println(a[i] +" "+a[j]);
				}
			}
		}

	}

}

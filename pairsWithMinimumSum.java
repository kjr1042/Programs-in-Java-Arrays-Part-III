import java.util.Scanner;

public class pairsWithMinimumSum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int firstsmallest =Integer.MAX_VALUE;
		int secondsmallest =Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstsmallest)
			{
				firstsmallest =a[i];
			}
		}
		//System.out.println(firstsmallest);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<secondsmallest && a[i]>firstsmallest)
			{
				secondsmallest =a[i];
			}
		}
		//System.out.println(secondsmallest);
		System.out.println(firstsmallest+secondsmallest);
		System.out.println(firstsmallest+" "+secondsmallest);
		
	}

}

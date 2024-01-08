import java.util.Scanner;

public class pairsProduct {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int k=scan.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[j]==k)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}

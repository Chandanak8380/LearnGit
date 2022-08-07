import java.util.*;
class maxinsub
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int i=0;
		int j=0;
		int max = 0;
		int len = n-(k-1);
		int maxarr[] = new int[len];
		int z=0;
		while(j<arr.length)
		{
			max = Math.max(max,arr[j]);
			if(j-i+1<k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				maxarr[z] = max;
				i++;
				j++;
				z++;
			}
		}
		for(int x=0;x<len;x++)
		{
			System.out.print(maxarr[x]);
		}
	}
}
import java.util.*;
class maxsubarray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();            //Git
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int i=0;
		int j=0;
		int sum = 0;
		int max = 0;
		while(j<arr.length)
		{
			sum = sum+arr[j];
			if(j-i+1<k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				if(sum>max)
				{
					max = sum;
				}
				sum = sum-arr[i];
				i++;
				j++;
			}
		}
		System.out.print("Max"+max);
	}
}

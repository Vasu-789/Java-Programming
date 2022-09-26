import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Size Of Array");
		int n = input.nextInt();
		System.out.println("Enter The Elements In Arrays");
		int a[] = new int[n];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a[i] = input.nextInt();
			if(!list.contains(a[i]))
			{
				list.add(a[i]);
			}
		}
		System.out.println("After Removing Duplicates");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
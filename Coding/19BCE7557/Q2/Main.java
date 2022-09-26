import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Size Of List");
		int n = input.nextInt();
		System.out.println("Enter The Elements In List");
		String a[] = new String[n];
		HashMap<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{   
			a[i] = input.next();
			if(map.containsKey(a[i]))
			{
			    int c = map.get(a[i])+1;
			    String temp = a[i] + c;
				map.put(a[i],map.get(a[i])+1);
				list.add(temp);
			}
			else
			{
			    map.put(a[i],0);
			    list.add(a[i]);
			}
		}
		System.out.println("After Processing");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
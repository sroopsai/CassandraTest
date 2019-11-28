package cassandratest;
import java.util.Scanner;

public class Tester{

	public static void main(String[] args)
	{
		HashMapSeparateChaining<String, Double> ht = new HashMapSeparateChaining<String, Double>();
		Scanner kb = new Scanner(System.in);
		String operation;
		String key;
		Double value;
		System.out.println("Testing application to test HashMap implementation" + "\n");
		System.out.println("To quit the application enter quit or q");
		System.out.print("Enter put to insert <key-value> pairs and get to retrieve the value: ");
	
		while(true)
		{
			operation = kb.next();
			if (operation.equals("get"))
			{
				System.out.print("Enter key: ");
				key = kb.next();
				if (ht.get(key)==null)
				{
					System.out.println("No such key "+ key + " Found");
				}
				else
				{
					System.out.println(key + " : " + ht.get(key).toString());
				}
			}
			else if (operation.equals("put"))
			{
				System.out.print("Enter key: ");
				key = kb.next();
				System.out.print("Enter value: ");
				value = kb.nextDouble();
				ht.put(key, value);
				System.out.println(key + " : " + value + " inserted");
			}
			else if (operation.equals("quit") || operation.equals("q"))
			{
				System.out.println("quitting the application");
				break;
			}
		}
	}
}
		

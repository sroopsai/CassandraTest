public class HashMapSeparateChaining<Key, Value>
{
	private static final int INIT_CAPACITY = 888;
	private int n;
	private int m;
	private Node[] ht;
	
	// helper linked list data type
	private static class Node
	{
		private Object key;
		private Object val;
		private Node next;
		
		public Node(Object key, Object val, Node next)
		{
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	
	// initiaiate separate chaining hash map
	public HashMapSeparateChaining()
	{
		this(INIT_CAPACITY);
	}

	public HashMapSeparateChaining(int m)
	{
		this.m = m;
		ht = new Node[m];
	}

	// generate hash value
	private int hash(Key key)
	{
		int hash = 0;
		for (int i = 0; i < key.toString().length(); i++)
		{
			hash = hash + (int) key.toString().charAt(i);
		}

		System.out.println("hash(" + key + ")=" + hash);
		return hash;
	}

	public Value get(Key key)
	{
		int i = hash(key);
		for (Node x = ht[i]; x != null; x = x.next)
		{
			if (key.equals(x.key)) 
			{
				return (Value) x.val;
			}
		}
		return null;
	}

	public void put(Key key, Value val)
	{
		int i = hash(key);
		for (Node x = ht[i]; x != null; x = x.next)
		{
			if (key.equals(x.key))
			{
				x.val = val;
				return;
			}
		}
		n++;
		ht[i] = new Node(key, val, ht[i]);
	}
	public static void main(String[] args)
	{
		HashMapSeparateChaining<String, Double> ht = new HashMapSeparateChaining<String, Double>();
		ht.put("roopsai", 5.6);
		ht.put("sai", 6.7);
		String getValue = ht.get("sai").toString();
		System.out.println(getValue);
}

		
}
		

package packages.java.util.objects.com;

import java.util.Objects;

class Pair2<K, V> 
{
    public K key;
    public V value;
  
    public Pair2(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }
  
    @Override
    public int hashCode()
    {
        return (Objects.hash(key,value));
    }
}
public class Example5 {

	public static void main(String[] args) {
		 Pair2<String, String> p1 = 
	                new Pair2<String, String>("GFG", "geeksforgeeks.org");
	        Pair2<String, String> p2 = 
	                new Pair2<String, String>("Code", null);
	        Pair2<String, String> p3 = new Pair2<String, String>(null, null);
	          
	        System.out.println(p1.hashCode());
	        System.out.println(p2.hashCode());
	        System.out.println(p3.hashCode());
	}
}

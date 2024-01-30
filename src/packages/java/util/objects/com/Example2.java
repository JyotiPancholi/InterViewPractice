//boolean equals(Object a,Object b)

package packages.java.util.objects.com;

import java.util.Objects;

class Pairs<K, V> 
{
    public K key;
    public V value;
  
    public Pairs(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }
  
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pairs<?, ?> p = (Pairs<?, ?>) o;
        return Objects.equals(p.key, key) && Objects.equals(p.value, value);
          
    }
}
public class Example2 {

	public static void main(String[] args) {
		 Pair<String, String> p1 = 
	                new Pair<String, String>("GFG", "geeksforgeeks.org");
	          
	        Pair<String, String> p2 = 
	                new Pair<String, String>("GFG", "geeksforgeeks.org");
	          
	        Pair<String, String> p3 = 
	                new Pair<String, String>("GFG", "www.geeksforgeeks.org");
	          
	        System.out.println(p1.equals(p2));
	        System.out.println(p2.equals(p3));
	}
}

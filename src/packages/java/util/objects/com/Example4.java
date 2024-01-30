/*int hashCode(Object o) : This method returns the hash code of a non-null argument
and 0 for a null argument*/

package packages.java.util.objects.com;

import java.util.Objects;

class Pair1<K, V> 
{
    public K key;
    public V value;
  
    public Pair1(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }
  
    @Override
    public int hashCode()
    {
        return (Objects.hashCode(key) ^ Objects.hashCode(value));
          
        /* without Objects.hashCode(Object o) method
        return (key == null ? 0 : key.hashCode()) ^ 
        (value == null ? 0 : value.hashCode()); */
    }
}
public class Example4 {

	public static void main(String[] args) {
		Pair1<String, String> p1 = 
                new Pair1<String, String>("GFG", "geeksforgeeks.org");
        Pair1<String, String> p2 = 
                new Pair1<String, String>("Code", null);
        Pair1<String, String> p3 = new Pair1<String, String>(null, null);
          
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
	}
}

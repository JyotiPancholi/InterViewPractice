// Java program to demonstrate Objects.requireNonNull(Object o) 
// and Objects.requireNonNull(Object o, String message) methods
//T requireNonNull(T obj,String message)

package packages.java.util.objects.com;

import java.util.Objects;

class Pairss<K, V> 
{
    public K key;
    public V value;
  
    public Pairss(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }
  
    public void setKey(K key) {
        this.key = Objects.requireNonNull(key);
    }
      
    public void setValue(V value) {
        this.value = Objects.requireNonNull(value, "no value");
    }
}
public class Example3 {

	public static void main(String[] args) {
		Pairss<String, String> p1 = 
                new Pairss<String, String>("GFG", "geeksforgeeks.org");
      
    p1.setKey("Geeks");
      
    // below statement will throw NPE with customized message
    p1.setValue(null);
	}

}

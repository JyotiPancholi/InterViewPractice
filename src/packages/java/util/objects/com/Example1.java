//String toString(Object o, String nullDefault)
//https://www.geeksforgeeks.org/java-util-objects-class-java/
package packages.java.util.objects.com;

import java.util.Objects;

class Pair<K, V> 
{
    public K key;
    public V value;
  
    public Pair(K key, V value) 
    {
        this.key = key;
        this.value = value;
    }
      
    @Override
    public String toString() {
        return "Pair {key = " + Objects.toString(key) + ", value = " + 
                    Objects.toString(value, "no value") + "}";
          
        /* without Objects.toString(Object o) and 
         Objects.toString(Object o, String nullDefault) method
         return "Pair {key = " + (key == null ? "null" : key.toString()) + 
     ", value = " + (value == null ? "no value" : value.toString()) + "}"; */
    }
}
public class Example1 {

	public static void main(String[] args) {
		 Pair<String,String> p1 = new Pair<String, String>("GFG", "geeksforgeeks.org");
 
		 Pair<String, String> p2 = new Pair<String, String>("Code", null);
   
		 	System.out.println(p1);
		 	System.out.println(p2);
	}
}
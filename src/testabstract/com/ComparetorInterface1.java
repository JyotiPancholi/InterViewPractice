package testabstract.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//Helper class representing a Student
public class ComparetorInterface1 {

 // Attributes of student
 String Name;
 int Age;

 // Parameterized constructor
 public ComparetorInterface1(String Name, Integer Age)
 {

     // This keyword refers to current instance itself
     this.Name = Name;
     this.Age = Age;
 }

 // Getter setter methods
 public String getName() { return Name; }

 public void setName(String Name) { this.Name = Name; }

 public Integer getAge() { return Age; }

 public void setAge(Integer Age) { this.Age = Age; }

 // Method
 // Overriding toString() method
 @Override public String toString()
 {
     return "Customer{"
         + "Name=" + Name + ", Age=" + Age + '}';
 }

 // Class 2
 // Helper class implementing Comparator interface
 static class CustomerSortingComparator
     implements Comparator<ComparetorInterface1> {

     // Method 1
     // To compare customers
     @Override
     public int compare(ComparetorInterface1 customer1,
                        ComparetorInterface1 customer2)
     {

         // Comparing customers
         int NameCompare = customer1.getName().compareTo(
             customer2.getName());

         int AgeCompare = customer1.getAge().compareTo(
             customer2.getAge());

         // 2nd level comparison
         return (NameCompare == 0) ? AgeCompare
                                   : NameCompare;
     }
 }

 // Method 2
 // Main driver method
 public static void main(String[] args)
 {

     // Create an empty ArrayList
     // to store Student
     List<ComparetorInterface1> al = new ArrayList<>();

     // Create customer objects
     // using constructor initialization
     ComparetorInterface1 obj1 = new ComparetorInterface1("Ajay", 27);
     ComparetorInterface1 obj2 = new ComparetorInterface1("Sneha", 23);
     ComparetorInterface1 obj3 = new ComparetorInterface1("Simran", 37);
     ComparetorInterface1 obj4 = new ComparetorInterface1("Ajay", 22);
     ComparetorInterface1 obj5 = new ComparetorInterface1("Ajay", 29);
     ComparetorInterface1 obj6 = new ComparetorInterface1("Sneha", 22);

     // Adding customer objects to ArrayList
     // using add() method
     al.add(obj1);
     al.add(obj2);
     al.add(obj3);
     al.add(obj4);
     al.add(obj5);
     al.add(obj6);

     // Iterating using Iterator
     // before Sorting ArrayList
     Iterator<ComparetorInterface1> custIterator = al.iterator();

     // Display message
     System.out.println("Before Sorting:\n");

     // Holds true till there is single element
     // remaining in List
     while (custIterator.hasNext()) {

         // Iterating using next() method
         System.out.println(custIterator.next());
     }

     // Sorting using sort method of Collections class
     Collections.sort(al,
                      new CustomerSortingComparator());

     // Display message only
     System.out.println("\n\nAfter Sorting:\n");

     // Iterating using enhanced for-loop
     // after Sorting ArrayList
     for (ComparetorInterface1 customer : al) {
         System.out.println(customer);
     }
   }
}

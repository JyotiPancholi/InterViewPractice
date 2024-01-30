package autometic_typecasting_in_methodoverloading.com;

class Animal 
{ 

} 
class Lion extends Animal 
{ 
   
} 
public class Example10 {
	 public void food(Animal a) 
	   { 
	      System.out.println("Animals eat vegetarian and non-vegetarian food"); 
	   } 
	  public void food(Lion l) 
	  { 
	     System.out.println("Lions eat non-vegetarian food"); 
	   } 
	  public static void main(String[] args) 
	  { 
		  Example10 ft = new Example10(); 
	     Animal a = new Animal(); // a is reference variable of Animal class and it is pointing the objects of Animal. 
	     ft.food(a); // Exact matched. 

	     Lion l = new Lion(); // l is reference variable of Lion class and it is pointing to the objects of Lion. 
	     ft.food(l); // Exact matched. 
	     Animal a1= new Animal(); 
	      ft.food(a1); // Exact matched. 
	      ft.food(null); // Exact matched. 


	}
}

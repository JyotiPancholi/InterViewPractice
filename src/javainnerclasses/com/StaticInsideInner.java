package javainnerclasses.com;

//Note:  We can not have a static method in a nested inner class because
//an inner class is implicitly associated with an object of its outer class
//so it cannot define any static method for itself. For example, the following
//program doesn’t compile. 

//Java Program to Demonstrate Nested class 
//Where Error is thrown

//class Outer1 {
// void outerMethod()
// {
//     System.out.println("inside outerMethod");
// }
//public class StaticInsideInner {
//
//	public static void main(String[] args) {
//		 // Display message for better readability
//        System.out.println("inside inner class Method");
//	}
//  }
//}

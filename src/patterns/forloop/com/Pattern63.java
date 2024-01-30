package patterns.forloop.com;

import java.util.Scanner;

public class Pattern63 {
	
public static void main(String[] args) {
    int a = 0;
    for(int i=1; i <= 6; i++) {
       for(int j = i; j <= 5; j++) {
          System.out.print(" ");
       }
       for(int k = 1; k <= 2*i-1; k++) {
          if(k < i)
          System.out.print(a++);
          else if(k == i)
          System.out.print(a);
          else
          System.out.print(--a);
       }
       System.out.println();
    }
  }
}

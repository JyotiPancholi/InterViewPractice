//package testabstract.com;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//
////import java.io.*;
//
//eg. for serializable ...incomplete program
//class A implements Serializable
//{
//    int i;
//    String s;
//  
//    // A class constructor
//    public A(int i,String s)
//    {
//        this.i = i;
//        this.s = s;
//    }
//}
//  
//public class MarkerInterface1
//{
//    public static void main(String[] args)
//      throws IOException, ClassNotFoundException
//    {
//        A a = new A(20,"GeeksForGeeks");
//  
//        // Serializing 'a'
//        FileOutputStream fos = new FileOutputStream("xyz.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(a);
//  
//        // De-serializing 'a'
//        FileInputStream fis = new FileInputStream("xyz.txt");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        A b = (A)ois.readObject();//down-casting object
//  
//        System.out.println(b.i+" "+b.s);
//  
//        // closing streams
//        oos.close();
//        ois.close();
//    }
//}

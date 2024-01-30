package java_array.com;
//Java Program to subtract the two matrices
public class ArrayExercise26 {

	public static void main(String[] args) {
		int raws,cols;
		
		int a[][] =  {{1,3,2},{4,5,6},{7,8,9}};
		int b[][] =	 {{2,0,3},{2,3,1},{1,1,1}};
		
//		Calculates number of rows and columns present in given matrix  
		raws = a.length;
		cols = a[0].length;
		
//		Array diff will hold the result  
        int diff[][] = new int[raws][cols]; 
        
        //Performs subtraction of matrices a and b. Store the result in matrix diff  
        for(int i = 0; i < raws; i++){  
            for(int j = 0; j < cols; j++){  
                diff[i][j] = a[i][j] - b[i][j];  
            }  
        } 
        
        System.out.println("Subtraction of two matrices: ");  
        for(int i = 0; i < raws; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
	}
}

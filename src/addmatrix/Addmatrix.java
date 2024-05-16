/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addmatrix;

/**
 *
 * @author dell1
 */
public class Addmatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        
        int C[][]=new int[3][3];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
               C[i][j]=A[i][j]+B[i][j];
               
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    
}

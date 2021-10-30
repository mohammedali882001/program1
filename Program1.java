/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author messi
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        subject s =new subject(295," math " , 3);
        address a = new address(23,"malawy","egypt");
        student s1=new student(" mohamed ali " , 3 , s , a);
        s1.setStudentID(555);
        s1.display();
        
    }
    
}

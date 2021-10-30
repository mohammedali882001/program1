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
public class student
{
     String name;
    private int studentID;
    int studentGPA;
    subject subject;
    address address;

    public student(String name, int studentGPA, subject subject, address address) {
        this.name = name;
        
        this.studentGPA = studentGPA;
        this.subject = subject;
        this.address = address;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }
    public void display()
    {
        System.out.println(" student name " + name + " student ID " + getStudentID() + " student GPA " + studentGPA );
        System.out.println(" subject ID " + subject.subjectID + " subject name " + subject.subjectname + subject.subjecthours);
        System.out.println(" student address is " + address.city + " " + address.country + " " + address.streetNO);
    }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


/**
 *
 * @author mbrester1
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse class1 = new IntroToProgrammingCourse("Intro","111");
        ProgrammingCourse class2 = new IntroJavaCourse("Java","222");
        ProgrammingCourse class3 = new AdvancedJavaCourse("AdvancedJava","333");
        
        
        class1.setCredits(3);
        class2.setCredits(3);
        class3.setCredits(4);
        
        
        System.out.println(class1.getCourseName() + " has " +class1.getCredits() + " credits.");
        System.out.println(class2.getCourseName() + " has " +class2.getCredits() + " credits.");
        System.out.println(class3.getCourseName() + " has " +class3.getCredits() + " credits.");
    }   
            
}

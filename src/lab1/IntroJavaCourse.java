package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
       this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

 
    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0){
            throw new IllegalArgumentException("Prerequisites must not be null or a empty string");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

  
}

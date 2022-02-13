/**
  * Registrar.java
  * @author Sakeena Younus
  * @description A class for a hypothetical Registrar
  * @version 1.0 2022-01-28
*/

public class Registrar {

  //-----attributes-----
  private String firstName, lastName, classStanding;
  private int enrollmentYear, currentNumOfClasses, credits;
  private final int ID_NUMBER;
  private double gpa;
  private static int numOfEnrolledStudents = 0;

  //-----methods------
  /** */
  public Registrar(String firstName, String lastName) {
    // write code for setting firstName, lastName, and ID_NUMBER
    this.firstName = firstName;
    this.lastName =  lastName;
    this.ID_NUMBER = 50000 + numOfEnrolledStudents;
    numOfEnrolledStudents++;
    //enrollmentYear ??
  }

  //getter for firstName, lastName, classStanding, enrollmentYear, ID_NUMBER, currentNumOfClasses, credits, GPA, numOfEnrolledStudents

  //setter for firstName, lastName, classStanding, currentNumOfClasses, credits, credits, gpa

  //main methods

  //toString method

} //end of class

package com.jpa.text;


public class Student {
  
  private String studentName;
  private String studentCourse;

  public String getStudentName() 
  { 
    return studentName;
  }

  public void setStudentName(String studentName)
  {
      this.studentName = studentName;
  }

  public String getStudentCourse()
  {
      return studentCourse;
  }

  public void setStudentCourse(String studentCourse)
  {
      this.studentCourse = studentCourse;
  }

  
  public String toString()
  {
      return "Student{"
          + "studentName=" + studentName + 
           ", studentCourse=" + studentCourse + '}';
  }
}
package com.jpa.model;

import javax.persistence.*;



import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "student")
public class Student{ //implements Serializable {
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	@Column(name = "dob")
	private Date dateOfBirth;
	@Column(name = "father_Name")
	private String fatherName;
	@Column(name = "mother_name")
	private String motherName;
	@Column(name = "class_name")
	private String className;
	@Column(name = "roll_no")
	private String rollNo;
	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "admission_date")
	private Date admissionDate;
	// @Column(name = "gender")
	// private Gender gender;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	/*
	 * public Gender getGender() { return gender; }
	 * 
	 * public void setGender(Gender gender) { this.gender = gender; }
	 */

//public Student() {
//}
//
//public Student(Long userId, String firstName, String lastName, Date dateOfBirth, String fatherName, String motherName, String className, String rollNo, String mobileNo, Date admissionDate, String gender) {
//    this.userId = userId;
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.dateOfBirth = dateOfBirth;
//    this.fatherName = fatherName;
//    this.motherName = motherName;
//    this.className = className;
//    this.rollNo = rollNo;
//    this.mobileNo = mobileNo;
//    this.admissionDate = admissionDate;
//    this.gender = gender;
//}

	@Override
	public String toString() {
		return "Student{" + "userId=" + userId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", dateOfBirth=" + dateOfBirth + ", fatherName='" + fatherName + '\'' + ", motherName='" + motherName
				+ '\'' + ", className='" + className + '\'' + ", rollNo='" + rollNo + '\'' + ", mobileNo='" + mobileNo
				+ '\'' + ", admissionDate=" + admissionDate +

				'}';
	}

//public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Student student = (Student) o;
//    return Objects.equals(userId, student.userId) &&
//            Objects.equals(firstName, student.firstName) &&
//            Objects.equals(lastName, student.lastName) &&
//            Objects.equals(dateOfBirth, student.dateOfBirth) &&
//            Objects.equals(fatherName, student.fatherName) &&
//            Objects.equals(motherName, student.motherName) &&
//            Objects.equals(className, student.className) &&
//            Objects.equals(rollNo, student.rollNo) &&
//            Objects.equals(mobileNo, student.mobileNo) &&
//            Objects.equals(admissionDate, student.admissionDate) &&
//            Objects.equals(gender, student.gender);
//}

//public int hashCode() {
//    return Objects.hash(userId, firstName, lastName, dateOfBirth, fatherName, motherName, className, rollNo, mobileNo, admissionDate, gender);
//}

	/*
	 * Student ram = new Student(); ram.setFirstName("Ram");
	 * ram.setLastName("Sharma"); ram.setDateOfBirth(new Date(92, 5, 15));
	 * ram.setFatherName("Mr. Sharma"); ram.setMotherName("Mrs. Sharma");
	 * ram.setClassName("12th"); ram.setRollNo("12A");
	 * ram.setMobileNo("1234567890"); ram.setAdmissionDate(new Date());
	 * ram.setGender("Male");
	 * 
	 * Student sita = new Student(); sita.setFirstName("Sita");
	 * sita.setLastName("Gupta"); sita.setDateOfBirth(new Date(93, 2, 5));
	 * sita.setFatherName("Mr. Gupta"); sita.setMotherName("Mrs. Gupta");
	 * sita.setClassName("11th"); sita.setRollNo("11B");
	 * sita.setMobileNo("0987654321"); sita.setAdmissionDate(new Date());
	 * sita.setGender("Female");
	 * 
	 * Student gita = new Student(); gita.setFirstName("Gita");
	 * gita.setLastName("Kapoor"); gita.setDateOfBirth(new Date(94, 0, 1));
	 * gita.setFatherName("Mr. Kapoor"); gita.setMotherName("Mrs. Kapoor");
	 * gita.setClassName("10th"); gita.setRollNo("10C");
	 * gita.setMobileNo("5555555555"); gita.setAdmissionDate(new Date());
	 * gita.setGender("Female");
	 * 
	 * 
	 * System.out.println(ram.toString()); System.out.println(sita.toString());
	 * System.out.println(gita.toString());
	 */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author justinpotts
 */
public class HumanResource extends Employee{
    private boolean meetWithHr = false;
    private boolean meetDeptStaff = false;
    private boolean reviewedDeptPolicies = false;
    private boolean movedIn = false;
    private String cubeId;

public HumanResource(String firstName, String lastName, String ssn, String birthDate) {
    super(firstName, lastName, ssn, birthDate);
    }

 public void orientation (String cubeId) {
    this.meetWithHrForBenefitAndSalryInfo();
    this.meetDepartmentStaff();
    this.reviewDeptPolicies();
    this.moveIntoCubicle(cubeId);
    }

public String getCubeId() {
    return cubeId;
    }

public void setCubeId(String cubeId) {
    this.cubeId = cubeId;
    }

public void setMeetWithHr(boolean metWithHr) {
    this.meetWithHr = metWithHr;
    }

public boolean isMeetWithHr() {
    return meetWithHr;
    }

public void setMeetDeptStaff(boolean meetDeptStaff) {
    this.meetDeptStaff = meetDeptStaff;
    }

public void setMovedIn(boolean movedIn) {
    this.movedIn = movedIn;
    }

public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
    this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

//public method that checks/puts the employee through orientation
public void goThroughOrientation(){
    meetDepartmentStaff();
    reviewDeptPolicies();
    moveIntoCubicle(cubeId);
    System.out.println(getStatus());
    }

// Assume this is must be performed second
private void meetDepartmentStaff() {
    if(meetWithHr == false) {
    System.out.println("Sorry, you cannot meet with "
    + "department staff until you have met with HR.");
    }
    }
// Assume this must be performed third
private void reviewDeptPolicies() {
    if(meetWithHr && meetDeptStaff) {
    reviewedDeptPolicies = true;
    } else {
    System.out.println("Sorry, you cannot review "
    + " department policies until you have first met with HR "
    + "and then with department staff.");
    }
    }
// Assume this must be performed 4th
private void moveIntoCubicle(String cubeId) {
    if(meetWithHr && meetDeptStaff && reviewedDeptPolicies) {
    this.cubeId = cubeId;
    this.movedIn = true;
    } else {
    System.out.println("Sorry, you cannot move in to a "
    + "cubicle until you have first met with HR "
    + "and then with department staff, and then reviewed"
    + "department policies.");
    }
    }
private String getStatus() {
    if(meetWithHr && meetDeptStaff
    && reviewedDeptPolicies && movedIn) {
    return "Orientation is complete";
    } else {
    return "Orientation in progress...";
    }
    }



    private void meetWithHrForBenefitAndSalryInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

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
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private String birthDate;
    private String cubeId;
    
public Employee(String firstName, String lastName, String ssn, String birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
    this.birthDate = birthDate;
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


public String getCubeId() {
return cubeId;
}
public void setCubeId(String cubeId) {
this.cubeId = cubeId;
}


public String getSsn() {
    return ssn;
    }

public void setSsn(String ssn) {
    this.ssn = ssn;
    }

public String getBirthDate() {
    return birthDate;
    }

public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
    }

}

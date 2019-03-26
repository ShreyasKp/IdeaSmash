package model;

import java.util.Date;

public class customer {

    private String customerId;
    private String gender;
    private String firstName ;
    private String lastName;
    private Date lastLogIn;
    private Date dateOfBirth;

    public customer(String customerId, String gender, String firstName, String lastName, Date lastLogIn, Date dateOfBirth) {
        this.customerId = customerId;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastLogIn = lastLogIn;
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getLastLogIn() {
        return lastLogIn;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}

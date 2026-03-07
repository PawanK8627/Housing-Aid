package Entity;

import java.util.Date;

@Entity
public class Citizen {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long citizenId;

    private String name;
    private Date dob;
    private String gender;
    private String address;
    private String email;
    private String phone;

    // Getter and Setter for citizenId
    public Long getCitizenId() {
        return citizenId;
    }
    public void setCitizenId(Long citizenId) {
        this.citizenId = citizenId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for dob
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for phone
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}

package tech.uzb.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity //this helps this class to be mapped in any database
public class Employee implements Serializable { //this enables transform this class into different types of stream
    @Id
    @GeneratedValue (strategy= GenerationType.AUTO) // how to generate the information
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl; //to point the location of the picture
    @Column(nullable = false, updatable = false) //demak ustida tursa, pastidagiga tegishli buyruq: kod o'zgarmaydi
    private String employeeCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",email='" + email + '\'' +
                ",jobTitle='" + jobTitle + '\'' +
                ",phone='" + phone + '\'' +
                ",imageUrl='" + imageUrl + '\'' +
                '}';
    }
}

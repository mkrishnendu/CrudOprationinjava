package com.example.beststore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String email;
    private String phno;
    private int salary;
//    private String imageFile;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phno='" + phno + '\'' +
                ", salary=" + salary +
//                ", imageFile='" + imageFile + '\'' +
                '}';
    }

//    public String getImageFile() {
//        return imageFile;
//    }
//
//    public void setImageFile(String imageFile) {
//        this.imageFile = imageFile;
//    }
}

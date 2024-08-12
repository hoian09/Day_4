package com.ivt.spring.jpa.demo1.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Customer")
public class CustomerEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private int id;
@Column(name = "name")
    private String name;
@Column(name = "birthdate")
@DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate birthdate;
@Column(name = "sex")
    private String sex;
@Column(name = "email")
    private String email;
@Column(name = "phone")
    private String phone;
@Column(name = "address")
    private String address;
public CustomerEntity () {

}

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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}

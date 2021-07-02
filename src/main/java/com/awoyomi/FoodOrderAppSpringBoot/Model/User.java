package com.awoyomi.FoodOrderAppSpringBoot.Model;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Entity
@Component
@Table(name="user_table")
public class User {
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String postalCode;

    public User(Long id, String name, String email, String street, String city, String postalCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

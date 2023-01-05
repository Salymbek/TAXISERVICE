package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Client {
    private Long id;
    private String fullName;
    private LocalDate DateOfBirth;
    private String phoneNumber;
    private BigDecimal money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", money=" + money +
                '}';
    }

    public Client(Long id, String fullName, LocalDate dateOfBirth, String phoneNumber, BigDecimal money) {
        this.id = id;
        this.fullName = fullName;
        DateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }


}

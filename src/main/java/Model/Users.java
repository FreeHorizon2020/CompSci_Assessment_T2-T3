/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author Benji
 */
public class Users implements java.io.Serializable {
    
    private String Name;
    private Date DOB;
    private String Email;
    private String Phone;
    private int YsOOL;
    private String NmLicense;
    private int LicenseNo;
    private Date ExpiryDate;
    private String Password;
    private String Username;
    private String AccessLevel;
    
    public Users(String Name, Date DOB, String Email, String Phone, int YsOOL, String NmLicense, int LicenseNo, Date ExpiryDate, String Password, String Username, String AccessLevel) {
        this.Name = Name;
        this.DOB = DOB;
        this.Email = Email;
        this.Phone = Phone;
        this.YsOOL = YsOOL;
        this.NmLicense = NmLicense;
        this.LicenseNo = LicenseNo;
        this.ExpiryDate = ExpiryDate;
        this.Password = Password;
        this.Username = Username;
        this.AccessLevel = AccessLevel;
    }
        public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getYsOOL() {
        return YsOOL;
    }

    public void setYsOOL(int YsOOL) {
        this.YsOOL = YsOOL;
    }

    public String getNmLicense() {
        return NmLicense;
    }

    public void setNmLicense(String NmLicense) {
        this.NmLicense = NmLicense;
    }

    public int getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(int LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Date ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(String AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

}


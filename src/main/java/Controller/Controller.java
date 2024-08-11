/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.io.*;
import com.toedter.calendar.*;
import View.*;
import Model.*;
import java.util.*; 

/**
 *
 * @author Benji
 */
public class Controller {
    LoginGUI loginGUI = new LoginGUI();
    RegisterGUI registerGUI = new RegisterGUI();
    PasswordResetGUI PassGUI = new PasswordResetGUI();
    Owner_Main_GUI OwnerMainGUI = new Owner_Main_GUI();
    BookingManagmentGUI bookingGUI = new BookingManagmentGUI();
    PopUp popup = new PopUp();
    Add_Booking BookingA = new Add_Booking();
    ArrayList users = new ArrayList<Users>();
    
    
    public void open(){
        Udeserialise();
        loginGUI.setVisible(true);
        registerGUI.setVisible(false);
        PassGUI.setVisible(false);
        
        System.out.println(users.size());
        printUser();
        
    }
    public ArrayList<Users> getUsers(){
        return users;
    }
    public void Login(){
        loginGUI.setVisible(true);
        registerGUI.setVisible(false);
        PassGUI.setVisible(false);
        OwnerMainGUI.setVisible(false);
        loginGUI.LoginFailTrip();
        bookingGUI.setVisible(false);
        BookingA.setVisible(false);
        
    }
    
    public void openRegistration(){
        loginGUI.setVisible(false);
        registerGUI.setVisible(true);
        PassGUI.setVisible(false);
        OwnerMainGUI.setVisible(false);
        bookingGUI.setVisible(false);
        BookingA.setVisible(false);
    }
    public void openPassRes(){
        loginGUI.setVisible(false);
        registerGUI.setVisible(false);
        PassGUI.setVisible(true);
        OwnerMainGUI.setVisible(false);
        bookingGUI.setVisible(false);
        BookingA.setVisible(false);
    }
    public void openOwnerMain(){
        loginGUI.setVisible(false);
        registerGUI.setVisible(false);
        PassGUI.setVisible(false);
        OwnerMainGUI.setVisible(true);
        bookingGUI.setVisible(false);
        BookingA.setVisible(false);
    }
    public void openBooking(){
        loginGUI.setVisible(false);
        registerGUI.setVisible(false);
        PassGUI.setVisible(false);
        OwnerMainGUI.setVisible(false);
        bookingGUI.setVisible(true);
        BookingA.setVisible(false);
    }
    public void openAddBooking(){
        loginGUI.setVisible(false);
        registerGUI.setVisible(false);
        PassGUI.setVisible(false);
        OwnerMainGUI.setVisible(false);
        bookingGUI.setVisible(false);
        BookingA.setVisible(true);
    }
    public void popupOn(){
        popup.setVisible(true);
    }
    public void popupOff(){
        popup.setVisible(false);
    }
    public void adduser(String Name, Date DOB, String Email, String Phone, int YsOOL, String NmLicense, int LicenseNo, Date ExpiryDate, String Password, String Username, String AccessLevel){
        Model.Users user = new Model.Users(Name, DOB, Email, Phone, YsOOL, NmLicense, LicenseNo, ExpiryDate, Password, Username, AccessLevel);

        users.add(user);
        Login();
        Userialise();
    }
    public void ViewUser(Users Users){
        System.out.println(Users.getUsername());
        System.out.println(Users.getPassword());
        System.out.println(Users.getName());
        System.out.println(Users.getDOB());
        System.out.println(Users.getEmail());
        System.out.println(Users.getAccessLevel());
        System.out.println(Users.getLicenseNo());
        System.out.println(Users.getYsOOL());
        System.out.println(Users.getPhone());
        System.out.println(Users.getExpiryDate());
        System.out.println(Users.getNmLicense());
    }
    public void printUser(){
        for (int i=0; i < users.size(); i++){
            ViewUser((Users) users.get(i));
        }
        System.out.println("There are "+ users.size() + " users stored currently.");
    }
        public void Userialise(){
              try {
         FileOutputStream fileOut = new FileOutputStream("users.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(users);
         out.close();
         fileOut.close();
         System.out.println("User Serialized data saved");
      } catch (IOException i) {
         i.printStackTrace();
      }
    }
        public void Udeserialise(){
        try {
         FileInputStream fileIn = new FileInputStream("users.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         users = (ArrayList<Users>) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      } catch (Exception e) {
            System.out.println("yea error but you dont konw what it is hehe");
      }
    }    
}

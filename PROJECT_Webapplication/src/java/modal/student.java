/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Honey
 */
public class student {
   
    String User;
    String id;
    String Name;
    String Email;
    String Password;
    String Confirm_password;
    String Mobile_no;

     public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConfirm_Password() {
        return Confirm_password;
    }

    public void setConfirm_Password(String Confirm_Password) {
        this.Confirm_password = Confirm_Password;
    }

    public String getMobile_no() {
        return Mobile_no;
    }

    public void setMobile_no(String Mobile_no) {
        this.Mobile_no = Mobile_no;
    }

}

package ClassPackages;

import java.io.BufferedReader;
import java.io.IOException;

public class User {

    FileSystem fileclass = new FileSystem("UserInfo.txt");
    
    private String UserId; //U001
    private String Password; //111
    private String UserType;

    
   public User() {
       
       }
   
   public User(String UserId, String Password) 
    {
        this.UserId = UserId;
        this.Password = Password;
    }
   
   public User(String UserId, String Password,String UserType) 
    {
        this.UserId = UserId;
        this.Password = Password;
        this.UserType = UserType;
    }


    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    
    public boolean addNewUser() {
        if(!fileclass.createANewFile()){
            String record = UserId + " " + Password+ " " + UserType ;
            
            return fileclass.writeDataToFile(record);
        }

        return false;
    }
    
    
    
    public boolean validateAdminLogin() {
        try {
            String[] words = null;
            
            BufferedReader users = fileclass.readAFile();
            String user;

            while ((user = users.readLine()) != null) 
            {              
                words = user.split(" "); 

                if (words[0].equals(UserId)&& words[1].equals(Password)&& words[2].equals(UserType)) {
                    this.setUserId(words[0]);
                    this.setPassword(words[1]);
                    this.setUserType(words[2]);
                    return true;
                }
            }
        } catch (IOException e)
        {
            System.err.println("Error validating Login");
        }
        
        return false;
    }
    public boolean validateUserLogin() {
        try {
            String[] words = null;
            
            BufferedReader users = fileclass.readAFile();
            String user;

            while ((user = users.readLine()) != null) 
            {              
                words = user.split(" "); 

                if (words[0].equals(UserId)&& words[1].equals(Password)&& words[2].equals(UserType)) {
                    this.setUserId(words[0]);
                    this.setPassword(words[1]);
                    this.setUserType(words[2]);
                    return true;
                }
            }
        } catch (IOException e)
        {
            System.err.println("Error validating Login");
        }
        
        return false;
    }
    
    
    
    
}

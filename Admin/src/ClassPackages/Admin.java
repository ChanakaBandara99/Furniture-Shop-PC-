package ClassPackages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Admin {
    
    private String HRManagerID;
    private String HRAssistantID;
    private String ManagerName;
    private String AssistantName;
    private String AssistantDesignation;
    private String Email;
    private String Age;
    private String ContactNumber;
    private int HRManagerCount;
    private int HRAssistantCount;

FileSystem fileclass = new FileSystem("HRInfo.txt");

public  Admin()
 {}

public Admin(String HRManagerID,String ManagerName,String Email){

this.HRManagerID=HRManagerID;
this.ManagerName=ManagerName;
this.Email=Email;
}


public Admin(String HRAssistantID, String AssistantName ,String ContactNumber ,String AssistantDesignation){

this.HRAssistantID=HRAssistantID;
this.AssistantName=AssistantName;
this.ContactNumber=ContactNumber;
this.AssistantDesignation=AssistantDesignation;
}

    public String getAssistantDesignation() {
        return AssistantDesignation;
    }

    public void setAssistantDesignation(String AssistantDesignation) {
        this.AssistantDesignation = AssistantDesignation;
    }

    public int getHRManagerCount() {
        return HRManagerCount;
    }

    public void setHRManagerCount(int HRManagerCount) {
        this.HRManagerCount = HRManagerCount;
    }

    public int getHRAssistantCount() {
        return HRAssistantCount;
    }

    public void setHRAssistantCount(int HRAssistantCount) {
        this.HRAssistantCount = HRAssistantCount;
    }


    public String getHRManagerID() {
        return HRManagerID;
    }

    public void setHRManagerID(String HRManagerID) {
        this.HRManagerID = HRManagerID;
    }

    public String getHRAssistantID() {
        return HRAssistantID;
    }

    public void setHRAssistantID(String HRAssistantID) {
        this.HRAssistantID = HRAssistantID;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    public String getAssistantName() {
        return AssistantName;
    }

    public void setAssistantName(String AssistantName) {
        this.AssistantName = AssistantName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    

    public boolean createHRManager() {
        FileSystem manager = new FileSystem("HRManagersInfo.txt");
        
        if(!fileclass.createANewFile())
        {
            String record = HRManagerID + " " + ManagerName + " " + Email;
           
            return manager.writeDataToFile(record);
        }

        return false;
    }
    
     public boolean createHRAssistant() {
         
         FileSystem assistant = new FileSystem("HRAssistantsInfo.txt");
        
        if(!fileclass.createANewFile())
        {
            String record = HRAssistantID+ " " +AssistantName+ " " + AssistantDesignation + " " +ContactNumber;
           
            return assistant.writeDataToFile(record);
        }

        return false;
    }
     
   public String viewAllHRManagers() {
    String HRMANAGER, allhrmanagers = " ";
    String[] words;
    int count = 0;

    FileSystem managerFile = new FileSystem("HRManagersInfo.txt");

    try (BufferedReader bufferedReader = managerFile.readAFile()) {
        while ((HRMANAGER = bufferedReader.readLine()) != null) {
            words = HRMANAGER.split(" ");
            if (words.length >= 3) {  
                allhrmanagers = allhrmanagers + words[0] + "\t" + words[1] + "\t" + words[2] + "\n";
                count++;
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading HR Managers file: " + e);
    }

    setHRManagerCount(count);
    return allhrmanagers;
}
   public String viewAllHRAssistants() {
    String HRASSISTANT, allHRAssistants = " ";
    String[] words;
    int count = 0;

    FileSystem assistantFile = new FileSystem("HRAssistantsInfo.txt");

    try (BufferedReader bufferedReader = assistantFile.readAFile()) {
        while ((HRASSISTANT = bufferedReader.readLine()) != null) {
            words = HRASSISTANT.split(" ");
            if (words.length >= 4) {  
                allHRAssistants = allHRAssistants + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] + "\n";
                count++;
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading HR Assistants file: " + e);
    }

    setHRAssistantCount(count);
    return allHRAssistants;
}
   
}

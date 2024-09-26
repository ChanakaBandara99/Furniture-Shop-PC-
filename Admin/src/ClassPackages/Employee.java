package ClassPackages;

import java.io.BufferedReader;
import java.io.IOException;

public class Employee {
    
    private String  EmployeeID;
    private String  EmployeeName;
    private String EPFNumber;
    private String Designation;
    private String  Address;
    private String Department;
    private int EmployeeCount;
    
   FileSystem fileclass = new FileSystem("EmployeesInfo.txt");
   
   
   public  Employee()
   {}
   
public Employee(String EmployeeID,String EmployeeName,String EPFNumber,String Designation,String Address,String Department){
        this.EmployeeID= EmployeeID;
        this.EmployeeName = EmployeeName;
        this.EPFNumber= EPFNumber;
        this.Designation = Designation;
        this.Address = Address;
        this.Department=Department;
       
    }
public Employee(String Department){
    
    this.Department=Department;
    
}
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getEPFNumber() {
        return EPFNumber;
    }

    public void setEPFNumber(String EPFNumber) {
        this.EPFNumber = EPFNumber;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

   

    public int getEmployeeCount() {
        return EmployeeCount;
    }

    public void setEmployeeCount(int EmployeeCount) {
        this.EmployeeCount = EmployeeCount;
    }
    public boolean addEmployee() {
        
        if(!fileclass.createANewFile())
        {
            String record = EmployeeID + " " + EPFNumber + " " + EmployeeName + " " + Designation + " " + Address+ " " + Department;
           
            return fileclass.writeDataToFile(record);
        }

        return false;
    }
    public boolean searchEmployee (String EmployeeId) 
      {
        boolean isFound = false;
         
        try {
            String[] words = null;
            
            BufferedReader bufferedReader = fileclass.readAFile();
            String employee;
            
            outerloop:
            while ((employee = bufferedReader.readLine()) != null) {            
                words = employee.split(" "); 
                
                for (String word : words) {
                    if (word.equals(EmployeeId)) 
                    {
                        isFound = true;
                        
                        this.setEmployeeID(words[0]);
                        this.setEPFNumber(words[1]);
                        this.setEmployeeName(words[2]);
                        this.setDesignation(words[3]);
                        this.setAddress(words[4]);
                        this.setDepartment(words[5]);
                        
                        break outerloop;
                    }
                }
            }
        } catch (IOException ex)
        {
            System.out.println("Error searchEmployee "+ex);
        }
        
        return isFound;
    }
     public String viewAllEmployees() 
      {
        String Employee, allEmployee = " ";
        String[] words = null;
        int count = 0;
        BufferedReader bufferedReader = fileclass.readAFile();
        try {
            while ((Employee = bufferedReader.readLine()) != null)
            {     
                words = Employee.split(" ");
      allEmployee = allEmployee + words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] +
              "\t"+words[4]+ "\t"+words[5]+"\n";             
                count++;               
            }
        } catch (IOException e)
        {
            System.err.println("Error Searching Employees"+e); 
        }

        setEmployeeCount(count);
        return allEmployee;
    }
   public boolean addNewDepartment(String Department) {
   
    FileSystem departmentFile = new FileSystem("DepartmentsInfo.txt");

    
    try {
        BufferedReader bufferedReader = departmentFile.readAFile();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.trim().equalsIgnoreCase(Department.trim())) {
                System.out.println("Department already exists.");
                return false; 
            }
        }
    } catch (IOException ex) {
        System.out.println("Error reading department file: " + ex);
        return false;
    }

    
    return departmentFile.writeDataToFile(Department + "\n"); 
}
   public boolean addNewDesignation(String Designation) {
   
    FileSystem designationFile = new FileSystem("Designation.txt");

    
    try {
        BufferedReader bufferedReader = designationFile.readAFile();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.trim().equalsIgnoreCase(Designation.trim())) {
                System.out.println("Designation already exists.");
                return false; 
            }
        }
    } catch (IOException ex) {
        System.out.println("Error reading Designation file: " + ex);
        return false;
    }

    
    return designationFile.writeDataToFile(Designation + "\n"); 
}
   
   
   
}

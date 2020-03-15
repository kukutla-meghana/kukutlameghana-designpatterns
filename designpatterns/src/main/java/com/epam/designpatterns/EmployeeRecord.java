package com.epam.designpatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class EmployeeRecord implements Prototype{  
      
   private int id;  
   private String name, designation;  
   private double salary;  
   private String address;  
   private static final Logger LOGGER=LogManager.getLogger(EmployeeRecord.class);
      
   public EmployeeRecord(){  
            LOGGER.debug("   Employee Records of Oracle Corporation ");  
            LOGGER.debug("---------------------------------------------");  
            LOGGER.debug("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
      
}  
  
 public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
          
        this();  
        this.id = id;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  
    }  
      
  public void showRecord(){     
        LOGGER.debug(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
   }  
    @Override  
    public Prototype getClone() {      
        return new EmployeeRecord(id,name,designation,salary,address);  
    }
}


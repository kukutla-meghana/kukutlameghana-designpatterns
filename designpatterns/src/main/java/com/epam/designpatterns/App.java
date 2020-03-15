package com.epam.designpatterns;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args ) throws IOException 
    {
    	LOGGER.debug("Prototype Design Pattern");
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        LOGGER.debug("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
          
        LOGGER.debug("Enter Employee Name: ");  
        String ename=br.readLine();  
          
        LOGGER.debug("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
          
        LOGGER.debug("Enter Employee Address: ");  
        String eaddress=br.readLine();  
          
        LOGGER.debug("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
           
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
        
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
       
        LOGGER.debug("Factory Design Pattern");
        AnimalFactory animalFactory = new AnimalFactory();
        
        Animal animal = animalFactory.getAnimal("dOg");
        animal.eat();
      
        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();
      
        Animal animal3 = animalFactory.getAnimal("raBbIt");
        animal3.eat();
        LOGGER.debug("");
        LOGGER.debug("Proxy Design Pattern");
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
        LOGGER.debug("");
        LOGGER.debug("Adapter Design Pattern");
        LOGGER.debug("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        LOGGER.debug("Drawing...");
        drawing.draw();
        LOGGER.debug("Resizing...");
        drawing.resize();
        LOGGER.debug("");
        LOGGER.debug("Iterator Design Pattern");
        EmployeeRepository employeeRepository = new EmployeeRepository();

        for(Iterator iterator = employeeRepository.getIterator(); iterator.hasNext();) {
            String employee = (String)iterator.next();
            LOGGER.debug("Employee: " + employee);
        }
        LOGGER.debug("");
        LOGGER.debug("Stragey design pattern");
        Build build = new Build(new Skyscraper());
        LOGGER.debug("Requesting a skyscraper: " + build.executeStrategy("Downtown"));
        
        build = new Build(new House());
        LOGGER.debug("Requesting a house: " + build.executeStrategy("Outskirts"));
        
        build = new Build(new Mall());
        LOGGER.debug("Requesting a mall: " + build.executeStrategy("City Centre"));
    }
}
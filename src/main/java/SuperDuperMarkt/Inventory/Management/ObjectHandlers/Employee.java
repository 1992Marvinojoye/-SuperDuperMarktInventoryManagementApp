package SuperDuperMarkt.Inventory.Management.ObjectHandlers;

import com.opencsv.bean.CsvBindByPosition;

public class Employee {
  
	@CsvBindByPosition(position = 0)
    public String Name;
    
    @CsvBindByPosition(position = 1)
    public String Age;
    
    @CsvBindByPosition(position = 2)
    public String Company;
	
	@CsvBindByPosition(position = 3)
    public String Salary;
  
    public Employee(String name, String age, String company, String salary)
    {
        super();
        Name = name;
        Age = age;
        Company = company;
        Salary = salary;
    }
  
    @Override
    public String toString()
    {
       return "Employee [Name=" + Name + ", Age=" + Age + ", Company=" + Company + ", Salary=" + Salary + "]";
    }
}
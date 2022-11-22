import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionsExample
{

    public static void main(String[] args)
    {

        List<Employee> employeeList = new ArrayList<Employee>();

        Employee john = new Employee(300, "John");
        Employee david = new Employee(103, "David");
        Employee peter = new Employee(208, "Peter");
        Employee juli = new Employee(202, "Juli");
        Employee ram = new Employee(102, "Ram");

        employeeList.add(john);
        employeeList.add(david);
        employeeList.add(peter);
        employeeList.add(juli);
        employeeList.add(ram);

        System.out.println("employeeList before sort: \n" + employeeList + "\n");

        EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();

        Collections.sort(employeeList, employeeIdComparator);

        System.out.println("employeeList after sort : \n" + employeeList + "\n");

     
        Employee searchKey = new Employee(202, null); 
        
        int index = Collections.binarySearch(employeeList,searchKey, employeeIdComparator);

        System.out.println("index : " + index);
        
        Employee employee = employeeList.get(index);        
        System.out.println("employee name in  '"+index+"' index Position : "
                + employee.getName());

    }
}
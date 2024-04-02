import java.util.Arrays;

class Employee implements Comparable<Employee>{
    private String name;
    private int empid;
    private float salary;

    public Employee(String name,int empid ,float salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public int compareTo(Employee other){
        return this.empid-other.empid;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
    }
    
}
public class Program2{
    private static Employee[] getArray(){
        Employee[] arr = new Employee[5];
        arr[0]=new Employee("Sachin",13,55000.50f);
        arr[1]=new Employee("PMC",11,5500.50f);
        arr[2]=new Employee("Raj",3,5000.50f);
        arr[3]=new Employee("Sham",8,55000.50f);
        arr[4]=new Employee("Tony",19,55000.50f);
        return arr;
}

private static void printRecord(Employee[]arr){
    if(arr!=null){
        for (Employee emp :arr){
            System.out.println(emp.toString());
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Employee[] arr = Program2.getArray();
    Program2.printRecord(arr);

    Arrays.sort(arr);
    Program2.printRecord(arr);
}
}
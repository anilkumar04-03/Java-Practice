
class Employee {

    private int id;
    private String name;

    public Employee() {
        id = 45;
        name = "Your name here";
    }

    public Employee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class Constructors {

    public static void main(String[] args) {

        Employee employee = new Employee("Anil", 34);

        System.out.println(employee.getId());
        System.out.println(employee.getName());

    }
}

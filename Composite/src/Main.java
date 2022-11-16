import model.Employee;

public class Main {
    public static void main(String[] args) {

        // creating employees
        Employee ceo = new Employee("John", "Management", "CEO");
        Employee scrumMaster = new Employee("Michel", "Technology", "Scrum Master");

        Employee javaTechLead = new Employee("Robert", "Technology", "Java technical lead");
        Employee developer = new Employee("Laura", "Technology", "Java software developer");
        Employee developer2 = new Employee("Bob","Technology", "Java software developer");


        // add employees to their managers
        ceo.addEmployee(javaTechLead);
        ceo.addEmployee(scrumMaster);

        javaTechLead.addEmployee(developer);
        javaTechLead.addEmployee(developer2);

        // print all employees
        System.out.println(String.format("-CEO\n%s", ceo));

        System.out.println("-CEO Team");
        ceo.getTeam().forEach(System.out::println);

        System.out.println("-Java Team");
        javaTechLead.getTeam().forEach(System.out::println);


    }
}
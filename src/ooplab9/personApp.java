package ooplab9;

public class personApp {
    public static void main(String[] args) {
        Person person = new Person("10133", "nok",
                new Address("179 m8", "Pakphanang", "80140"),
                new Job("Programer",45000));

        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(50000);
        System.out.println("Name: "+person.getname()+
                "Salary: "+person.getJob().getSalary());
    }
}//class
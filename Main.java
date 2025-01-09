import java.util.*;
public class Main{
  public static void main(String[] args){
    List<Person> persons = new LinkedList<>();

    persons.add(new Person("Bob", "bob@email.com"));
    persons.add(new Person("Ben", "ben@email.com"));
    persons.add(new Person("Pam", "pam@email.com"));
    persons.add(new Person("Eve", "eve@email.com"));
    persons.add(new Person("Guy", "guy@email.com"));
    persons.add(new Person("Lis", "lis@email.com"));
    persons.add(new Person("Ann", "ann@email.com"));
    System.out.println(persons);
    Storage.save(persons);
    Storage.fetchPersons(persons);
    System.out.println(persons);

    //Assignment 2

    Role role = new Role("Engineer");
    Role role2 = new Role("Manager");
    Employee employee = new Employee("Bob Booba","Engineering Department", role);
    employee.addRole(role2);
    System.out.println(employee);
    employee.removeRole(role);
    System.out.println(employee);

  }
}

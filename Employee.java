import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String department;
    private List<Role> roles;
    public Employee(String name, String department, Role initialRole){
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);
    }
    public void addRole(Role role){
        roles.add(role);
    }
    public void removeRole(Role role){
        roles.remove(role);
    }
    public String name(){ return name; }
    public String department(){ return department; }
    @Override
    public String toString(){
        return String.format("%s at %s - Role: %s", name, department, roles);
    }
}


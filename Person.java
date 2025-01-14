import java.io.Serializable;
public class Person implements Serializable{
  private static final long serialVersionUID = 3487495895819393L;
  private String name;
  private String email;

  public Person(String name) {
    if(name==null){
      throw new NullPointerException("Name cannot be null!");
    }
    this.name = name;
  }

  public Person(String name, String email){
    this(name);
    this.email= email;
  }
  @Override
  public String toString(){
    return String.format("%s - %s", name, (email==null?"":email));
  }
}

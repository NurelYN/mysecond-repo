import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


class Student extends Person {
  private int fn;

    public Student(String name, int age,int fn) {
        super(name, age);
       this.fn = fn;
    }
}

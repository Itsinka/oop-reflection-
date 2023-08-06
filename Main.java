import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws Exception {
     Class studentClass=Student.class;

     Method setNameMethod=studentClass.getMethod("setName",String.class);
     Method getNameMethod=studentClass.getMethod("getName");

     Student student=new Student();

     setNameMethod.invoke(student,"John Doe");
     String name=(String) getNameMethod.invoke(student);

        System.out.println("Name"+name);
    }
}
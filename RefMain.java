import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class RefMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        ReflectionExample obj = new ReflectionExample(10,"Hello");
        Class cls= obj.getClass();
        System.out.println("Class Name:" + cls.getName());

        Field[] fields= cls.getDeclaredFields();
        System.out.println("Fields:");
        for(Field field:fields){
            System.out.println("\t" + field.getName());
        }
        Method[] methods= cls.getDeclaredMethods();
        System.out.println("Methods:");
        for(Method method:methods){
            System.out.println("\t"+ method.getName());
        }
        Field field= cls.getDeclaredField("x");
        field.setAccessible(true);
        System.out.println("x=" + field.get(obj));

        Method method=cls.getDeclaredMethod("printValues");
        method.setAccessible(true);
        method.invoke(obj);

        ReflectionExample obj2=(ReflectionExample) cls.newInstance();
        obj2.printValues();

        Constructor constructor =cls.getConstructor(int.class,String.class);
        ReflectionExample obj3=(ReflectionExample) constructor.newInstance(20,"Bye");
        obj3.printValues();
    }
}

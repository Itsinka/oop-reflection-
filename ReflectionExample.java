public class ReflectionExample {
    private int x;
    private String y;

    public  ReflectionExample(){}

    public  ReflectionExample(int x,String y){
        this.x=x;
        this.y=y;
    }
    public void printValues(){
        System.out.println("x:"+ x+",y:" + y);
    }
}


interface Addition{
    public void add(int a,int b);


    default void m1(){
        System.out.println("Default Method");
    }
    static  void m2(){
        System.out.println("Static Method");
    }
}

class Add implements Addition{
    @Override
    public void add(int a, int b) {
        System.out.println("The sum is "+ (a+b));
    }
}
public class AdditionFunctionalInterface {
    public static void main(String[] args) {
        Addition A = new Add();
        A.add(10,20);

        Addition A1 = (a,b)-> System.out.println("The Sum of a and b is "+ (a+b));
        A1.add(10,10);
        A1.add(100,200);
        A1.m1();
        Addition.m2();
    }
}

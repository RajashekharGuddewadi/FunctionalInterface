@FunctionalInterface
public interface InterF {
    public abstract String m(String s);

    default void m2(){
        System.out.println("Guddewadi");
    }

     static void m3(){
        System.out.println("Rajkumar");
    }
}

@FunctionalInterface
interface b extends InterF{
    public abstract String m(String s);
}
class test{
    public static void main(String[] args) {
        String a ="Raj";
        b f = (String s) -> s+" Guddewadi";
        String ans = f.m(a);
        System.out.println(ans);

        f.m2();
        InterF.m3();
    }
}

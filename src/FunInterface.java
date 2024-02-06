interface FuInter{
    public void m1();

}

// without lambda expression implementation
//class Demo implements FuInter{
//    @Override
//    public void m1() {
//        System.out.println("m1 Implementation");
//    }
//}
public class FunInterface {
    public static void main(String[] args) {
//        Demo D = new Demo(); //
//        D.m1();
        FuInter i = ()-> System.out.println("m1 implementation"); // lambada implementation
        i.m1();

    }

}

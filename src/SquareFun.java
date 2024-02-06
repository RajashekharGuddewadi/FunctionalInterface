interface SquareInterface{
    public int Square(int n);
}

class SquareClass implements SquareInterface{
    @Override
    public int Square(int n) {
        return n*n;
    }
}

public class SquareFun {
    public static void main(String[] args) {
        SquareInterface i=(n)-> {
            return n*n;
        };
        int n = 10;
        System.out.println("Square of "+ n +" using lambda expression is "+i.Square(n));

        SquareInterface S = new SquareClass();
        System.out.println("Square of " +n+" is "+S.Square(n));
    }
}

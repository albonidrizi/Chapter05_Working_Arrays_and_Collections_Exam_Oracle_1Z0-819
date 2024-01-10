package Stream;


@FunctionalInterface
interface Testimi{
    int absctractMethod(int a,int b);
    default void defMetoda(){
        System.out.println("default metoda");
    }
    static void staticMetoda(){
        System.out.println("Static metoda");
    }
}

class Objecti implements Testimi{
    @Override
    public int absctractMethod(int a,int b) {
        System.out.println("Absctract methoda nga Stream.Objecti: "+a+b);
        return a+b;
    }
}
public class Main{
    public static void main(String[] args){
        Testimi obj = new Objecti();
        obj.absctractMethod(22,2);

        Testimi lambda = (a,b)-> {System.out.println("Absctract methoda nga lambda: "+a+b); return a+b*b;};
        lambda.absctractMethod(22,2);

        int objValueReturn = obj.absctractMethod(2,2);
        int lambdaValueReturn = lambda.absctractMethod(2,2);
        System.out.println(objValueReturn);
        System.out.println(lambdaValueReturn);
        System.out.println(lambda.absctractMethod(2,222));
    }


}

package Stream;

import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {

        int incrementNgaFunctioni = incrementMethod(33);
        System.out.println(incrementNgaFunctioni);

        int incrementNgaMethodat = incrementMethod(33);
        System.out.println(incrementNgaMethodat);


    }


    static Function<Integer,Integer> incrementFunction = (n)->n++;

    static int incrementMethod(int n){
        return n++;
    }

}

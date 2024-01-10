package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllInOneLambdaExample {
    public static void main(String[] args){

        // Pre-defined function interface -  është një interface e cila është e përcaktuar paraprakisht nga Java dhe përdoret për të specifikuar një lloj të caktuar të funksionit.
        // Një pre-defined function interface mund të jetë p.sh. Predicate, Function, Consumer, Supplier, etj.

        // Predicate - method TEST, 1 parameter dhe return type boolean
        // Predicate: Përdoret për të testuar një kusht për një të dhënë dhe kthen një vlerë boolean.
        System.out.println("**********************   1");
        Predicate<Integer> predicate = a-> a == 0;
        System.out.println(predicate.test(22));
        System.out.println(predicate.test(0));

        System.out.println("**********************   2");
        Predicate<String> predicate1 = a-> a.length() > 4;
        System.out.println(predicate1.test("Helloo"));

        System.out.println("**********************   3");
        String [] names= {"Albon","Skot","Smith","Parisaaa"};
        Predicate<String> predicate2 = a-> a.length() > 4 && a.length() < 7;
        for (String name:names) {
            if (predicate2.test(name)) //name.length() > 4 && name.length() < 7
            System.out.println("name: "+name);
        }

        System.out.println("**********************   5");
        Predicate<Integer> p1 = i-> i%2==0;
        Predicate<Integer> p2 = i -> i>50;
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // AND, OR - bashkimi i 2 Predicateve ne nje reshte
        for (int n:a) {
            if (p1.or(p2).test(n)) //if (p1.and(p2).test(n))
                System.out.print(n+"  ");
        }System.out.println();

        System.out.println("**********************   6");
        // NEGATE - (!) na jep nr e kundert nga kushti
        for (int n:a) {
            if (p1.negate().test(n))
                System.out.print(n+" ");
        }System.out.println();

        System.out.println("**********************   6");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Albon",22222,7));
        employees.add(new Employee("Anda",21332,3));
        employees.add(new Employee("Besa",22,8));
        employees.add(new Employee("Selma",10000,2));

        Predicate<Employee> employeePredicate = (em)-> em.getSalery() > 20000 && em.getExperience()<10;

        for (Employee e: employees) {
            if (employeePredicate.test(e))
            System.out.println(e.getEname()+ " "+ e.getSalery());
        }

    }
}

class Employee {
    private String ename;
    private int salery;
    private int experience;
    public Employee(String ename, int salery, int experience) {
        this.ename = ename;
        this.salery = salery;
        this.experience = experience;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getSalery() {
        return salery;
    }
    public void setSalery(int salery) {
        this.salery = salery;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Stream.Employee{" +
                "name='" + ename + '\'' +
                ", salery=" + salery +
                ", experience=" + experience +
                '}';
    }
}

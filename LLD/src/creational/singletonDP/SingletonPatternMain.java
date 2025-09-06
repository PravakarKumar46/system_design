package creational.singletonDP;

public class SingletonPatternMain {
    public static void main(String[] args) {

        MySingleTon mySingleTon = MySingleTon.getInstance();
        MySingleTon mySingleTon1 = MySingleTon.getInstance();
        MySingleTon mySingleTon2 = MySingleTon.getInstance();
        MySingleTon mySingleTon3 = MySingleTon.getInstance();
        MySingleTon mySingleTon4 = MySingleTon.getInstance();
        System.out.println(mySingleTon);
        System.out.println(mySingleTon1);
        System.out.println(mySingleTon2);
        System.out.println(mySingleTon3);
        System.out.println(mySingleTon4);

    }
}

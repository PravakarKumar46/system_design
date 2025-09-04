package prototypeDP;

public class PrototypeMain {
    public static void main(String[] args) {

        Student mainObj = new Student(25, 88, "Albert");

        //clone
        Student cloneObj = (Student) mainObj.clone();
        System.out.println("age:" + cloneObj.age + ", name: "+ cloneObj.name +", rollno: "+cloneObj.rollNumber);
    }
}

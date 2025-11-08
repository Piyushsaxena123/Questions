class obj {

    int rollno;
    String studentname;
}
public class Person {
    int age = 20;
    public static void main(String[] args) {
        Person Rohan = new Person();
        System.out.println(Rohan.age);
        obj object1 = new obj();
        object1.rollno = 1;
        object1.studentname = "Rahul";
        System.out.println(object1.rollno);
        System.out.println(object1.studentname);

        obj object2 = new obj();
        object2.rollno = 2;
        object2.studentname = "Ramesh";
        System.out.println(object2.rollno);
        System.out.println(object2.studentname);
    }
}

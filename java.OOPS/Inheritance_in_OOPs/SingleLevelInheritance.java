public class SingleLevelInheritance {
    // Best Example of Single Level Inheritance ==>>
    public static void main(String[] args) {
        kitkat k = new kitkat();
        k.sweetner();
        System.out.println("and \nmore");
        k.darkcolor();
    }
}
class Chocalate{
    void sweetner(){
        System.out.println("More Sweet");
    }
}
class kitkat extends Chocalate{
    void darkcolor(){
        System.out.println("Dark Color");
    }
}

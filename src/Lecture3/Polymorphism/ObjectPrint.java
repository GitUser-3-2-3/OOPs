package Lecture3.Polymorphism;

/**
 * ObjectPrint
 */
public class ObjectPrint {
    int num;
    
    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }

    public static void main(String[] args) {
        System.out.println();

        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);

        System.out.println();
    }
}
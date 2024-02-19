package Lecture4;

/**
 * ObjectDemo
 */
public class ObjectDemo {
    int num;
    float gpa;

    ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println();

        ObjectDemo obj1 = new ObjectDemo(43, 9.1f);
        ObjectDemo obj2 = new ObjectDemo(43, 8.2f);
        ObjectDemo obj3 = new ObjectDemo(29, 6.3f);

        if (obj1 == obj2) {
            System.out.println("ob1 is equals to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("ob1 is equals to obj2");
        }

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj2.getClass().getSuperclass());

        System.out.println();
    }
}
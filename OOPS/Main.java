public class Main {
    public static void main(String[] args) {
        // store 5 roll no
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {rool no , name , marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Classes when we create our datatype
        Student[] students = new Student[5];

        Student dev = new Student(15, "dev", 85.4f);
        Student kunal = new Student();

        // dev.rno = 13;
        // dev.name = "Dev";
        // dev.marks = 88.5f;
        System.out.println(dev.rno);
        System.out.println(dev.name);
        System.out.println(dev.marks);

        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        // kunal.changeName("kunal");
        // kunal.greeting();


        Student random = new Student(dev);
        System.out.println(random.name);
    }

    // create a clss
    // for every single studen
}

class Student {
    int rno;
    String name;
    float marks = 90;

    // constructor

    // we need a way to add values of above properties object by object
    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    
    
    Student() {
        this.rno = 13;
        this.name = "Dev";
        this.marks = 88.5f;
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
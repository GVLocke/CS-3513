package arrays;
class Student {
        public int roll_no;
        public String name;
        Student(int roll_no, String name)
        {
            this.roll_no = roll_no;
            this.name = name;
        }
    }

public class ObjArray {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(101, "Mark");
        arr[1] = new Student(102, "Steve");
        arr[2] = new Student(103, "Lucy");
        arr[3] = new Student(104, "John");
        arr[4] = new Student(105, "Bob");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no + " " + arr[i].name);
    }
}

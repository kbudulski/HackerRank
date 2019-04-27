import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<>();

        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        //custom sorting using comparator
        Collections.sort(studentList, studentComparator);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

    public static Comparator<Student> studentComparator = new Comparator<Student>() {

        @Override
        public int compare(Student a, Student b) {
            if (a.getCgpa() == b.getCgpa()) return a.getFname().compareTo(b.getFname());
            return b.getCgpa() > a.getCgpa() ? 1 : -1;
        }
    };
}
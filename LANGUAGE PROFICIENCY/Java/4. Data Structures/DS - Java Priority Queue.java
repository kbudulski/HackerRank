import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student {

    private String name;
    private double cgpa;
    private int id;

    Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {

    List<Student> getStudents(List<String> events) {
        //creating queue with custom sorting using Comparator
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
        for (String s : events) {
            //checking events, adding or deleting students from the queue
            String[] arr = s.split("\\s");
            if (arr.length > 1) pq.add(new Student(arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3])));
            else pq.poll();
        }
        //additional list created to save the proper order
        List<Student> students = new ArrayList<>();
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }
        return students;
    }
}


class StudentComparator implements Comparator<Student> {

    //Comparator with custom sorting conditions
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() == s2.getCgpa()) {
            if (s1.getName().equals(s2.getName())) {
                return s1.getId() - s2.getId();
            }
            return s1.getName().compareTo(s2.getName());
        }
        if (s1.getCgpa() > s2.getCgpa()) return -1;
        else return 1;
    }
}


public class Solution {
    
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
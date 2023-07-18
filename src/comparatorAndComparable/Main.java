package comparatorAndComparable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"NIT","Rahul","First"));
        studentList.add(new Student(2,"IIT","Pooja","Second"));
        studentList.add(new Student(3,"GTU","Akash","Third"));
        studentList.add(new Student(4,"VNSGU","Rahul","First"));
        studentList.add(new Student(5,"NIT","Priyanka","Second"));
        studentList.add(new Student(6,"NIT","Sachin","Third"));
        studentList.add(new Student(7,"IIT","Anurag","Second"));
        studentList.add(new Student(8,"GTU","Jay","Third"));
        studentList.add(new Student(9,"GTU","Divya","Second"));
        studentList.add(new Student(10,"VNSGU","Karan","Second"));
        studentList.add(new Student(11,"IIT","Jay","First"));
        studentList.add(new Student(12,"GTU","Parth","First"));


        MethodClass methodClass = new MethodClass();

        Set<String> uniqueStudentName = methodClass.uniqueNameOfStudents(studentList);
        System.out.println(uniqueStudentName);

        HashMap<String, Integer> collegeWiseStudent =  methodClass.collegeWiseCount(studentList);
        System.out.println(collegeWiseStudent);

        HashMap<String, List<String>> collegeWiseStudentList = methodClass.collegeWiseStudentList(studentList);
        System.out.println(collegeWiseStudentList);

        HashMap<String, HashMap<String, Integer>> collegeWiseGradeCount = methodClass.collegeWiseGradeStudentCount(studentList);
        System.out.println(collegeWiseGradeCount);

        List<Student> sortedByNameList = methodClass.NameComparator(studentList);
        sortedByNameList.stream().forEach(student -> System.out.println(student.getName()));
        System.out.println();

        List<Student> sortedCollegeAndNameList = methodClass.CollegeAndNameComparator(studentList);
        sortedCollegeAndNameList.stream().forEach(student -> System.out.println(student.getName() + " " + student.getCollege()));



    }

}

package comparatorAndComparable;

import java.util.*;

public class MethodClass {

    public HashMap<String, Integer> collegeWiseCount(List<Student> studentList){

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(Student student : studentList){
            hashMap.put(student.getCollege(), hashMap.getOrDefault(student.getCollege(),0)+1);
        }

        return hashMap;

    }

    public Set<String> uniqueNameOfStudents(List<Student> studentList){

        Set<String> set = new HashSet<>();

        for(Student student : studentList){
            set.add(student.getName());
        }

        return set;

    }

    public HashMap<String, List<String>> collegeWiseStudentList(List<Student> studentList){

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(Student student : studentList){
//            hashMap.put(student.getCollege(), hashMap.getOrDefault(student.getCollege(), new ArrayList<>()));
            if(hashMap.containsKey(student.getCollege())){
                hashMap.get(student.getCollege()).add(student.getName());
            }
            else{
                List<String> al = new ArrayList<>();
                al.add(student.getName());
                hashMap.put(student.getCollege(), al);
            }
        }
        return hashMap;
    }

    public HashMap<String, HashMap<String, Integer>> collegeWiseGradeStudentCount(List<Student> studentList){

//        HashMap<String, Integer> gradeCount = new HashMap<>();

//        for(Student student : studentList){
//            gradeCount.put(student.getGrade(),gradeCount.getOrDefault(student.getGrade(),0)+1);
//        }

        HashMap<String, HashMap<String, Integer>> hashMap = new HashMap<>();

        for(Student student : studentList){

//            if(hashMap.containsKey(student.getCollege())){
////                hashMap.get(student.getCollege()).put(student.getGrade(),gradeCount.getOrDefault(student.getGrade(),0)+1);
//
//            }
//            else{
                HashMap<String, Integer> gradeCount = new HashMap<>();
                for(Student student1 : studentList){
                    if(student1.getCollege() == student.getCollege()){
                        gradeCount.put(student1.getGrade(),gradeCount.getOrDefault(student1.getGrade(),0)+1);
                    }
                }
//            System.out.println(gradeCount);
                if(!hashMap.containsKey(student.getCollege())){
                    hashMap.put(student.getCollege(), gradeCount);
                }

//            }

        }
        return hashMap;

    }


    public List<Student> NameComparator(List<Student> studentList){

        Collections.sort(studentList, (s1,s2)->s1.getName().compareTo(s2.getName()));
        return studentList;

    }

    public List<Student> CollegeAndNameComparator(List<Student> studentList){

        Collections.sort(studentList,(s1,s2)->{
            if(s1.getName().equals(s2.getName())){
                return s1.getCollege().compareTo(s2.getCollege());
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        });
        return studentList;
    }


}

package __collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {
    public static void main(String[] args) {
        Map<Student,Map<String,Integer>> studentsDetails=new LinkedHashMap();

        Student student1=new Student(52,"navin");
        Map<String,Integer> student1marks=new LinkedHashMap();
        student1marks.put("Sanskrit",86);
        student1marks.put("Marathi",78);
        student1marks.put("English",82);
        studentsDetails.put(student1,student1marks);

        Student student2=new Student(75,"anil");
        Map<String,Integer> student2marks=new LinkedHashMap();
        student2marks.put("Sanskrit",98);
        student2marks.put("Marathi",87);
        student2marks.put("English",91);
        studentsDetails.put(student2,student2marks);

        Student student3=new Student(2,"vinit");
        Map<String,Integer> student3marks=new LinkedHashMap();
        student3marks.put("Sanskrit",61);
        student3marks.put("Marathi",78);
        student3marks.put("English",45);
        studentsDetails.put(student3,student3marks);

        Student student4=new Student(153,"bharati");
        Map<String,Integer> student4marks=new LinkedHashMap();
        student4marks.put("Sanskrit",88);
        student4marks.put("Marathi",67);
        student4marks.put("English",96);
        studentsDetails.put(student4,student4marks);

        studentsDetails.entrySet().forEach(System.out::println);
        System.out.println(student1marks.get("sanskrit"));



    }
}

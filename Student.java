import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private int sNum;
    Student(String name,int studentNum) {
        this.name=name;
        this.studentNum=sNum;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        ArrayList<String> studentNameList=new ArrayList<String>();
        Student s1=new Student("KBM",201611060);
        Student s2=new Student("ASD",201618475);         
        studentNameList.add(s1.getName());
        studentNameList.add(s2.getName());
        Collections.sort(studentNameList);
        System.out.println(studentNameList);
    }
}
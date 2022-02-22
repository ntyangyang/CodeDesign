package groupId.y;

import groupId.n.Student;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String clazz;
    /**
     * 学生人数
     */
    private static List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("皮皮", 10, 589));
        studentList.add(new Student("蛋蛋", 54, 356));
        studentList.add(new Student("瘦瘦", 23, 439));
        studentList.add(new Student("肉肉", 2, 665));
        studentList.add(new Student("粥粥", 19, 502));
    }

    public double clazzAverageScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore / studentList.size();
    }

    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    public int clazzStudentCount() {
        return studentList.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        groupId.y.Teacher.studentList = studentList;
    }
}

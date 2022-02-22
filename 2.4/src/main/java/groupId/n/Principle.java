package groupId.n;

import java.util.HashMap;
import java.util.Map;

public class Principle {
    private Teacher teacher = new Teacher("Emily", "终极一班");

    public Map<String, Object> queryClazzInfo(String clazzId) {
        int studentCount = clazzStudentCount();
        double totalScore = clazzTotalScore();
        double averageScore = clazzAverageScore();
        Map<String, Object> map = new HashMap<>(16);
        map.put("班级", teacher.getClazz());
        map.put("老师", teacher.getName());
        map.put("学生人数", studentCount);
        map.put("总分", totalScore);
        map.put("平均分", averageScore);
        return map;
    }

    private double clazzAverageScore() {
        double totalScore = 0;
        for (Student student : teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore / teacher.getStudentList().size();
    }

    private double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : teacher.getStudentList()) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    private int clazzStudentCount() {
        return teacher.getStudentList().size();
    }

    public static void main(String[] args) {
        System.out.println(new Principle().queryClazzInfo(""));
    }
}

package groupId.y;

import java.util.HashMap;
import java.util.Map;

public class Principle {
    private Teacher teacher = new Teacher("Emily", "终极一班");

    public Map<String, Object> queryClazzInfo(String clazzId) {
        int studentCount = teacher.clazzStudentCount();
        double totalScore = teacher.clazzTotalScore();
        double averageScore = teacher.clazzAverageScore();
        Map<String, Object> map = new HashMap<>(16);
        map.put("班级", teacher.getClazz());
        map.put("老师", teacher.getName());
        map.put("学生人数", studentCount);
        map.put("总分", totalScore);
        map.put("平均分", averageScore);
        return map;
    }

    public static void main(String[] args) {
        System.out.println(new Principle().queryClazzInfo(""));
    }
}

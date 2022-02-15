package groupId;

public class CalculationAreaExt extends CalculationArea{
    // 扩展后把精度增长，同时原有的长方形、三角形面积可以继续使用
    private final static double PAI = 3.141592653D;

    @Override
    public double circular(double r) {
        return PAI * r * r;
    }
}

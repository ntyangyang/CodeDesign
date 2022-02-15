package groupId;

public class CalculationArea implements ICalculationArea {
    // 如果不考虑开闭原则，直接修改π的精度就可以了，但是会破坏原有精度下的稳定性
    private final static double PAI = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return PAI * r * r;
    }
}

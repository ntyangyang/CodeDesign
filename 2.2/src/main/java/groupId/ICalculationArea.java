package groupId;

public interface ICalculationArea {
    /**
     * 计算面积，长方形
     *
     * @param x 长
     * @param y 宽
     * @return 面积
     */
    double rectangle(double x, double y);

    /**
     * 计算面积，三角形
     * 海伦公式：S=√p(p-a)(p-b)(p-c)，p=(a+b+c)/2
     *
     * @param x 边长x
     * @param y 边长y
     * @param z 边长z
     * @return 面积
     */
    double triangle(double x, double y, double z);

    /**
     * 计算面积，圆形
     *
     * @param r 半径
     * @return 面积
     */
    double circular(double r);
}

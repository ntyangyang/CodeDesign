package groupId.n;

public class HeroHouYi implements ISkill{
    @Override
    public void doArchery() {
        System.out.println("后羿的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后羿的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后羿的沉默技能");
    }

    @Override
    public void doVertigo() {
        // 无实现
    }
}

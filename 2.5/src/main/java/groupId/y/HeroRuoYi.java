package groupId.y;

public class HeroRuoYi implements ISkillArchery, ISkillInvisible, ISkillSilent {
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
}

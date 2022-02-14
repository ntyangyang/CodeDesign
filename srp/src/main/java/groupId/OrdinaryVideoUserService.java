package groupId;

public class OrdinaryVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("普通会员，720p");
    }

    @Override
    public void advertisement() {
        System.out.println("普通会员，有广告");
    }
}

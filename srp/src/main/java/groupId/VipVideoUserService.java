package groupId;

public class VipVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("VIP，1080p");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP，无广告");
    }
}

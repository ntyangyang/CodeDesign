package groupId;

public class GuestVideoUserService implements IVideoUserService{
    @Override
    public void definition() {
        System.out.println("访客，480p");
    }

    @Override
    public void advertisement() {
        System.out.println("访客，有广告");
    }
}

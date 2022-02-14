package groupId;

import org.junit.Test;

public class VideoUserService {
    public void serveGrade(String userType) {
        if ("VIP".equals(userType)) {
            System.out.println("VIP，1080p");
        } else if ("普通会员".equals(userType)) {
            System.out.println("普通会员，720p");
        } else if ("访客".equals(userType)) {
            System.out.println("访客，480p");
        }
    }

    @Test
    public void test_serveGrade() {
        VideoUserService service = new VideoUserService();
        service.serveGrade("VIP");
        service.serveGrade("普通会员");
        service.serveGrade("访客");
    }

    @Test
    public void test_videoUserService() {
        // 访客
        GuestVideoUserService guest = new GuestVideoUserService();
        guest.definition();
        guest.advertisement();
        // 普通用户
        OrdinaryVideoUserService ordinary = new OrdinaryVideoUserService();
        ordinary.definition();
        ordinary.advertisement();
        // VIP
        VipVideoUserService vip = new VipVideoUserService();
        vip.definition();
        vip.advertisement();
    }
}

package groupId.n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ApiTest {
    private static Logger logger = LoggerFactory.getLogger(ApiTest.class);

    public static void main(String[] args) {
        ArrayList<BetUser> list = new ArrayList<>();
        list.add(new BetUser("皮皮", 65));
        list.add(new BetUser("蛋蛋", 43));
        list.add(new BetUser("瘦瘦", 72));
        list.add(new BetUser("肉肉", 89));
        list.add(new BetUser("粥粥", 10));
        DrawControl drawControl = new DrawControl();
        List<BetUser> list1 = drawControl.doDrawRandom(list, 3);
        logger.info("随机抽奖：{}", list1);
        List<BetUser> list2 = drawControl.doDrawWeight(list, 3);
        logger.info("权重抽奖：{}", list2);
    }
}

package groupId.y;

import groupId.n.BetUser;

import java.util.ArrayList;
import java.util.List;

public class DrawWeight implements IDraw{
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        list.sort((o1, o2) -> {
            int e = o2.getUserWeight() - o1.getUserWeight();
            if (0 == e) {
                return 0;
            }
            return e > 0 ? 1 : -1;
        });
        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}

package groupId.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawControl {
    // 随机抽取指定数量的用户，作为中奖用户
    public List<BetUser> doDrawRandom(List<BetUser> list, int count) {
        // 集合数量很小，直接返回
        if (list.size() <= count) {
            return list;
        }
        // 乱序集合
        Collections.shuffle(list);
        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }

    // 按照权重排序获取指定数量的用户，作为中奖用户
    public List<BetUser> doDrawWeight(List<BetUser> list, int count) {
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

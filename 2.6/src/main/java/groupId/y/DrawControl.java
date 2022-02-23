package groupId.y;

import groupId.n.BetUser;

import java.util.List;

public class DrawControl {
    private IDraw draw;
    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }
}

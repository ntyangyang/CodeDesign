package groupId.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象银行卡类
 *
 * @author eason
 */
public abstract class BankCard {
    private Logger logger = LoggerFactory.getLogger(BankCard.class);
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 开卡时间
     */
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    /**
     * 正向入账
     *
     * @param orderId 订单id
     * @param amount 金额
     * @return
     */
    public String positive(String orderId, BigDecimal amount) {
        logger.info("卡号{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 逆向入账
     *
     * @param orderId 订单id
     * @param amount 金额
     * @return
     */
    public String negative(String orderId, BigDecimal amount) {
        logger.info("卡号{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("10001,100.00");
        tradeList.add("10001,90.00");
        tradeList.add("10001,80.50");
        tradeList.add("10001,120.00");
        return tradeList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }
}

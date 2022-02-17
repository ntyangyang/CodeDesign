package groupId.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class CashCard extends BankCard{
    private Logger logger = LoggerFactory.getLogger(groupId.n.CashCard.class);
    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 规则过滤 储蓄卡直接默认通过
     */
    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount 金额
     * @return 状态码 0000成功 0001失败 0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        logger.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 储蓄
     *
     * @param orderId 订单id
     * @param amount 金额
     * @return
     */
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }

    /**
     * 风控校验
     *
     * @param cardNo 卡号
     * @param orderId 单号
     * @param amount 金额
     * @return
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        logger.info("风控校验，卡号{} 单号：{} 金额：{}", cardNo, orderId, amount);
        return true;
    }
}

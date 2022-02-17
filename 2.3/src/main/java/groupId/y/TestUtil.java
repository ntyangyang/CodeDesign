package groupId.y;

import java.math.BigDecimal;

/**
 * @author eason
 */
public class TestUtil {
    public static void main(String[] args) {
        CashCard bankCard = new CashCard("23457899872345", "2022-02-17");
        // 提现
        bankCard.withdrawal("10001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("10001", new BigDecimal(100));

        CreditCard creditCard = new CreditCard("90324578923459", "2022-02-17");
        // 支付 贷款
        creditCard.loan("10002", new BigDecimal(1000000));
        // 还款
        creditCard.repayment("10002", new BigDecimal(1000000));
        // 提现
        creditCard.withdrawal("10003", new BigDecimal(100));
        // 储蓄
        creditCard.recharge("10003", new BigDecimal(100));
    }
}

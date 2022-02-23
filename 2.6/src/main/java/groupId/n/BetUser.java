package groupId.n;

public class BetUser {
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 用户权重
     */
    private int userWeight;

    public BetUser(String username, int userWeight) {
        this.username = username;
        this.userWeight = userWeight;
    }

    public BetUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    @Override
    public String toString() {
        return "BetUser{" +
                "username='" + username + '\'' +
                ", userWeight=" + userWeight +
                '}';
    }
}

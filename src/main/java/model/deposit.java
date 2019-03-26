package model;

public class deposit {

    private int accountId;
    private String type;
    private String displayName;
    private String accountNumber;


    public deposit(int accountId, String type, String displayName, String accountNumber) {
        this.accountId = accountId;
        this.type = type;
        this.displayName = displayName;
        this.accountNumber = accountNumber;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}

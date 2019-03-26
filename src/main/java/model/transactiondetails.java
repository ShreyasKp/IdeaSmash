package model;

import java.util.Date;

public class transactiondetails {

    private String transactionId;
    private int accountId;
    private String type;
    private String amount;
    private Date date;
    private String Tag;
    private String referenceNumber;

    public transactiondetails(String transactionId, int accountId, String type, String amount, Date date, String tag, String referenceNumber) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        Tag = tag;
        this.referenceNumber = referenceNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public String getTag() {
        return Tag;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }
}


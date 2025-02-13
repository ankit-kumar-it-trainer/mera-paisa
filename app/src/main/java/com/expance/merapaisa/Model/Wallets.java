package com.expance.merapaisa.Model;

/* loaded from: classes3.dex */
public class Wallets {
    private long amount;
    private String color;
    private long creditLimit;
    private String currency;
    private int dueDate;
    private int exclude;
    private int icon;
    private int id;
    private long initialAmount;
    private String name;
    private float rate;
    private int statementDate;
    private int type;

    public Wallets(String name, String color, float rate, String currency, long amount, long initialAmount, int id, int exclude, int icon, int type, int dueDate, int statementDate, long creditLimit) {
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.initialAmount = initialAmount;
        this.id = id;
        this.exclude = exclude;
        this.currency = currency;
        this.icon = icon;
        this.rate = rate;
        this.type = type;
        this.dueDate = dueDate;
        this.statementDate = statementDate;
        this.creditLimit = creditLimit;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getStatementDate() {
        return this.statementDate;
    }

    public void setStatementDate(int statementDate) {
        this.statementDate = statementDate;
    }

    public long getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public float getRate() {
        return this.rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getIcon() {
        return this.icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getInitialAmount() {
        return this.initialAmount;
    }

    public void setInitialAmount(long initialAmount) {
        this.initialAmount = initialAmount;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExclude() {
        return this.exclude;
    }

    public void setExclude(int exclude) {
        this.exclude = exclude;
    }
}

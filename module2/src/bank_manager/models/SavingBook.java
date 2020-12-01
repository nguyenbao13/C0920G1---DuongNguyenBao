package bank_manager.models;

public abstract class SavingBook {
    protected String idBook;
    protected String idCustomer;
    protected String openDate;
    protected String startDate;
    protected String money;
    protected String interest;

    public SavingBook() {
    }

    public SavingBook(String idBook, String idCustomer, String openDate, String startDate, String money, String interest) {
        this.idBook = idBook;
        this.idCustomer = idCustomer;
        this.openDate = openDate;
        this.startDate = startDate;
        this.money = money;
        this.interest = interest;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return idBook + ", " + idCustomer + ", " + openDate + ", " + startDate + ", " + money + ", " + interest;
    }
}

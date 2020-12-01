package bank_manager.models;

public class LongTermBook extends SavingBook {
    private String term;
    private String bonus;

    public LongTermBook() {
    }

    public LongTermBook(String term, String bonus) {
        this.term = term;
        this.bonus = bonus;
    }

    public LongTermBook(String idBook, String idCustomer, String openDate, String startDate, String money, String interest, String term, String bonus) {
        super(idBook, idCustomer, openDate, startDate, money, interest);
        this.term = term;
        this.bonus = bonus;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + term + ", " + bonus;
    }
}

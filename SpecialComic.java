public class SpecialComic extends Comic {
    private int maxDays;
    private boolean valuable;

    public SpecialComic() {
        super();
        this.maxDays = 0;
        this.valuable = false;
    }

    public SpecialComic(String id, String name, boolean available, int days, double price,
                        int maxDays, boolean valuable) {
        super(id, name, available, days, price);
        this.maxDays = maxDays;
        this.valuable = valuable;
    }

    public int getMaxDays() {
        return this.maxDays;
    }

    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }

    public boolean getValuable() {
        return this.valuable;
    }

    public void setValuable(boolean valuable) {
        this.valuable = valuable;
    }

    @Override
    public double getPayment() {
        double payment = getDays() * getPrice();
        if(valuable){
            payment += (0.4 * getDays() * getPrice());
        }
        if(getDays() > maxDays){
            payment += (0.3 * (getDays()-maxDays) * getPrice());
        }
        return payment;
    }

    @Override
    public String toString() {
        return "SpecialComic [id=" + getId()
                + ", name=" + getName()
                + ", available=" + getAvailable()
                + ", days=" + getDays()
                + ", price=" + getPrice()
                + ", maxDays=" + getMaxDays()
                + ", valuable=" + getValuable() + "]";
    }
}

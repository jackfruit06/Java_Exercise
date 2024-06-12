public class LuxuryRoom extends Room {
    private int nBeds;
    private boolean view;

    public LuxuryRoom() {
        super();
        this.nBeds = 0;
        this.view = false;
    }

    public LuxuryRoom(String id, String name, boolean available, int days, double price,
                      int nBeds, boolean view) {
        super(id, name, available, days, price);
        this.view = view;
        this.nBeds = nBeds;

    }

    public int getNBeds() {
        return this.nBeds;
    }

    public void setNBeds(int nBeds) {
        this.nBeds = nBeds;
    }

    public boolean getView() {
        return this.view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    @Override
    public double getPayment() {
       double payment = getDays() * (getPrice() + 0.2 * nBeds * getPrice());
       if(view){
           payment += (0.05 * getDays() * getPrice());
       }
       return payment;
    }

    @Override
    public String toString() {
        return "LuxuryRoom [id=" + getId()
                + ", name=" + getName()
                + ", available=" + getAvailable()
                + ", days=" + getDays()
                + ", price=" + getPrice()
                + ", nBeds=" + getNBeds()
                + ", view=" + getView() + "]";
    }
}
public class PrimeRoom extends Room {
    private int services;
    private boolean catering;

    public PrimeRoom() {
        super();
        this.services = 0;
        this.catering = false;
    }

    public PrimeRoom(String id, String name, boolean available, int days, double price,
                     int services, boolean catering) {
        super(id, name, available, days, price);
        this.services = services;
        this.catering = catering;

    }

    public int getServices() {
        return this.services;
    }

    public void setServices(int services) {
        this.services = services;
    }

    public boolean getCatering() {
        return this.catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    @Override
    public double getPayment() {
        double payment = getDays() * (getPrice() + 0.3 * services * getPrice());
        if (catering) {
            payment += (0.2 * getDays() * getPrice());
        }
        return payment;
    }

    @Override
    public String toString() {
        return "PrimeRoom [id=" + getId()
                + ", name=" + getName()
                + ", available=" + getAvailable()
                + ", days=" + getDays()
                + ", price=" + getPrice()
                + ", services=" + getServices()
                + ", catering=" + getCatering() + "]";
    }
}
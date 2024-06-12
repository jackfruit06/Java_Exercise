public class Room {
    private String id;
    private String name;
    private boolean available;
    private int days;
    private double price;

    public Room() {
        this.id = "";
        this.name = "";
        this.available = false;
        this.days = 0;
        this.price = 0;
    }

    public Room(String id, String name, boolean available, int days, double price) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.days = days;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPayment() {
        return days * price;

    }

    @Override
    public String toString() {
        return "Room [id=" + getId()
                + ", name=" + getName()
                + ", available=" + getAvailable()
                + ", days=" + getDays()
                + ", price=" + getPrice() + "]";
    }
}
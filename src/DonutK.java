public class DonutK {
    private String kind;
    private double price;
    private int number;

    public DonutK(String kind, int number) {
        this.kind = kind;
        this.number = number;
        setKind(kind);  // Set the kind and update the price accordingly
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
        // Set the price based on the kind of donut
        if (kind.equals("chocolat") || kind.equals("rassberry")) {
            this.price = 2.99;
        } else {
            this.price = 1.99;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {  // Fixed the typo here
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double totalPrice() {
        return number * price;
    }
}
 
  

	

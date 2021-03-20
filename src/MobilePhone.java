public class MobilePhone {
    String weight;
    int price;

    public MobilePhone(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void displayValues() {
        System.out.println(this.weight + " " + this.price);
    }

    public String getParameters() {
        return this.weight + " " + this.price;
    }

    public void checkPrice() {
        if (this.price > 500) {
            System.out.printf("this phone is too expensive");
        }
    }
}


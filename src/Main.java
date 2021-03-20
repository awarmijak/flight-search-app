public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200", 700);
        MobilePhone oldPhone = new MobilePhone("4000g", 100);
        MobilePhone mediumPhone = new MobilePhone("600", 340);

        System.out.println(phone.weight + " " + phone.price);
        phone.displayValues();
        String parameters = phone.getParameters();
        System.out.println(parameters);

        phone.checkPrice();
        oldPhone.checkPrice();
        mediumPhone.checkPrice();


    }
}


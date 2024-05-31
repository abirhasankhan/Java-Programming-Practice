public class B5main {
    public static void main(String[] args) {
        B5 card = new B5(30);

        System.out.println(card);

        card.payBill(-5);
        System.out.println(card);// pay bill 5

        card.payBill(-15);
        System.out.println(card);//pay bill 15
    }
}


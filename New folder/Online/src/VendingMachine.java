
public class VendingMachine {

    private static double totalSales = 0;
    private int totalItems = 10;
    private VendingItem[] shelf = new VendingItem[10];
    private double TotalValue = 219.58;

    public VendingMachine(){
        this.restock();
    }

    public VendingItem vend(int code){
        VendingItem data;
        data = shelf[code];
        if (code < shelf.length) {
            for (int i = 0; i < shelf.length; i++) {
                if (data == shelf[i]) {
                    for (int j = i; j < shelf.length - 1; j++) {
                        shelf[j] = shelf[j + 1];
                    }
                    break;
                }
            }
        }
        else{
            System.out.println("null");
            }

        return data;
    }

    public void restock(){
        shelf[0] = new VendingItem("Lays", 1.50);
        shelf[1] = new VendingItem("Doritos", 1.50);
        shelf[2] = new VendingItem("Coke", 2.50);
        shelf[3] = new VendingItem("Rubik s Cube", 30);
        shelf[4] = new VendingItem("Pie", 3.14);
        shelf[5] = new VendingItem("Clicker", 55.55);
        shelf[6] = new VendingItem("Cheetos", 1.25);
        shelf[7] = new VendingItem("Cold Pizza", 0.99);
        shelf[8] = new VendingItem("Graphing Calculator", 120);
        shelf[9] = new VendingItem("Ramen", 3.15);
    }
    public static double getTotalSales(){
        return totalSales++;
    }

    public int getTotalItems(){
        return totalItems--;
    }
/**
    public double getTotalValue(){

        return TotalValue = TotalValue - ;
    }
**/
    public String toString(){

        return shelf+", "+this.totalItems+"\n"+this.TotalValue;

    }

}

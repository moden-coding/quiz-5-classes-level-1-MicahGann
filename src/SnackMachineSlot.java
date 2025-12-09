public class SnackMachineSlot {
    private String itemName;   // e.g. "Chips"
    private double price;      // e.g. 1.50
    private int quantity;      // how many items are in this slot
    private int itemsSold;     // used at higher levels
    public SnackMachineSlot(String givenItemName, double initialPrice, int initialQuantity){
        this.itemName = givenItemName;
        if (initialPrice < 0) {
            this.price = 0;
        } else {
            this.price = initialPrice;
        }
        if (initialQuantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = initialQuantity;
        }
        this.itemsSold = 0;
        
    }
    public void purchaseOne(){
        if (this.quantity > 0) {
            this.quantity--;
            this.itemsSold++;
        } 
        if (this.quantity == 0) {
            this.quantity = 0;
            this.itemsSold = 0;
        }
    }
    public double getRevenue(){
        return itemsSold * this.price;
    }
    @Override
    public String toString(){
        return "Item: " + this.itemName + ", Price: " + this.price + ", In Stock: " + this.quantity;
    }
}

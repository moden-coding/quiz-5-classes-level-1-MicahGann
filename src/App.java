public class App {
    public static void main(String[] args)  {
        System.out.println("=== SnackMachineSlot Quiz Tester ===\n");

        // -----------------------------
        // B / B+ LEVEL: constructor, toString, purchaseOne()
        // -----------------------------
        System.out.println("--- B / B+ LEVEL TESTS ---");
        SnackMachineSlot slotA = new SnackMachineSlot("Chips", 1.50, 3);

        System.out.println("Initial slotA (should show Chips, 1.5, 3 in stock):");
        System.out.println(slotA);

        System.out.println("\nBuying 1 snack from slotA...");
        slotA.purchaseOne(); 
        System.out.println("After 1st purchase (quantity should be 2):");
        System.out.println(slotA);

        System.out.println("\nBuying 2 more snacks from slotA...");
        slotA.purchaseOne();
        slotA.purchaseOne();
        System.out.println("After 3rd purchase (quantity should be 0):");
        System.out.println(slotA);

        System.out.println("\nTrying to buy from empty slotA (quantity should stay 0):");
        slotA.purchaseOne();
        System.out.println("After attempting purchase on empty slotA:");
        System.out.println(slotA);
        System.out.println();

        // -----------------------------
        // A- LEVEL: constructor validation
        // -----------------------------
        System.out.println("--- A- LEVEL TESTS (constructor validation) ---");
        SnackMachineSlot slotB = new SnackMachineSlot("Candy Bar", -2.00, -5);

        System.out.println("Created slotB with negative price and quantity:");
        System.out.println(slotB);
        System.out.println("Expected: price should be set to 0.0, quantity should be set to 0.\n");

        // -----------------------------
        // A LEVEL: itemsSold + purchaseOne() change
        // -----------------------------
        System.out.println("--- A LEVEL TESTS (itemsSold tracking) ---");
        SnackMachineSlot slotC = new SnackMachineSlot("Soda", 2.00, 4);

        System.out.println("Initial slotC (before any purchases):");
        System.out.println(slotC);

        System.out.println("\nBuying 2 sodas from slotC...");
        slotC.purchaseOne();
        slotC.purchaseOne();
        System.out.println("After 2 purchases, slotC:");
        System.out.println(slotC);

        System.out.println("\nBuying until slotC is empty...");
        slotC.purchaseOne();
        slotC.purchaseOne();
        System.out.println("After buying out slotC (quantity should be 0):");
        System.out.println(slotC);

        System.out.println("\nAttempting to buy from empty slotC (quantity should stay 0):");
        slotC.purchaseOne();
        System.out.println("Final state of slotC:");
        System.out.println(slotC);
        System.out.println("If you chose to show itemsSold in toString(), it should have increased when purchases succeeded.\n");

        // -----------------------------
        // A+ LEVEL: getRevenue()
        // -----------------------------
        System.out.println("--- A+ LEVEL TESTS (getRevenue) ---");
        SnackMachineSlot slotD = new SnackMachineSlot("Gum", 0.75, 5);

        System.out.println("Initial slotD:");
        System.out.println(slotD);

        System.out.println("\nBuying 3 packs of gum from slotD...");
        slotD.purchaseOne();
        slotD.purchaseOne();
        slotD.purchaseOne();
        System.out.println("After 3 purchases, slotD:");
        System.out.println(slotD);

        double revenueD = slotD.getRevenue();
        System.out.println("\nslotD.getRevenue() returned: " + revenueD);
        System.out.println("Expected revenue: 3 * 0.75 = 2.25 (if itemsSold and price are correct).");
    }
}

    



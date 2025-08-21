// Description
// In the stock market, investors focus only on buying and selling shares.
// They don’t see the complex backend where trades are matched and recorded.
// For them, the platform simply shows actions like Buy, Sell, and Check Portfolio.
// This is abstraction — hiding how the system works, showing only what is needed.
// Different exchanges like NSE or BSE implement these actions in their own way.
// One may charge extra brokerage, while another may offer discounts.
// Yet, for the investor, the interface remains the same: buy, sell, and check.
// Thus, abstraction makes the stock market simple and user-friendly despite its complexity.

// Input Format
// First line → Action (buy or sell)
// Second line → Company name (e.g., TCS)
// Third line → Quantity of shares

// Output Format
// Show the result of the action (Bought/Sold shares).
// Show the updated total portfolio shares.

// Test Case 1
// Input:
// buy
// INFOSYS
// 40

// Output:
// Bought 40 shares of INFOSYS via NSE.
// Total Shares in Portfolio: 40

// Test Case 2
// Input:
// sell
// INFOSYS
// 20

// Output:
// Sold 20 shares of INFOSYS via NSE.
// Total Shares in Portfolio: 20

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

abstract class Market {
    abstract void buy(int stocks, String company);

    abstract void sell(int stocks, String company);

    abstract int checkBalance();

    HashMap<String, Integer> stocks = new HashMap<>();
}

class NSE extends Market {
    HashMap<String, Integer> nsestocks = stocks;

    void buy(int stocks, String company) {
        if (stocks >= 0) {
            if (nsestocks.get(company) != null) {
                nsestocks.put(company, nsestocks.get(company) + stocks);
            } else {
                nsestocks.putIfAbsent(company, stocks);
            }
            System.out.println("Bought " + stocks + " shares of " + company + " via NSE.");
        } else {
            System.out.println("Error in buying");
        }
    }

    void sell(int stocks, String company) {
        if (nsestocks.containsKey(company) && nsestocks.get(company) >= stocks) {
            int newstocks = nsestocks.get(company) - stocks;
            nsestocks.replace(company, newstocks);
            System.out.println("Sold " + newstocks + " shares of " + company + " via NSE.");
        } else {
            System.out.println("You have no stocks from the company or enter the valid stocks.");
        }
    }

    int checkBalance() {
        int total = 0;
        for (HashMap.Entry<String, Integer> entry : nsestocks.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }

}

class BSE extends Market {
    HashMap<String, Integer> bsestocks = stocks;

    void buy(int stocks, String company) {
        if (stocks >= 0) {
            if (bsestocks.get(company) != null) {
                bsestocks.put(company, bsestocks.get(company) + stocks);
            } else {
                bsestocks.putIfAbsent(company, stocks);
            }
            System.out.println("Bought " + stocks + " shares of " + company + " via BSE.");
        } else {
            System.out.println("Error in buying");
        }
    }

    void sell(int stocks, String company) {
        if (bsestocks.containsKey(company) && bsestocks.get(company) >= stocks) {
            int newstocks = bsestocks.get(company) - stocks;
            bsestocks.replace(company, newstocks);
            System.out.println("Sold " + newstocks + " shares of " + company + " via BSE.");
        } else {
            System.out.println("You have no stocks from the company or enter the valid stocks.");
        }
    }

    int checkBalance() {
        int total = 0;
        for (HashMap.Entry<String, Integer> entry : bsestocks.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }

}

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Market(NSE or BSE): ");
        String market = sc.nextLine().toLowerCase();
        Market marketObj;
        switch (market) {
            case "nse":
                marketObj = new NSE();
                break;
            case "bse":
                marketObj = new BSE();
                break;
            default:
                marketObj = null;
                System.out.println("Market doesnt exists.");
                sc.close();
                return;
        }
        boolean choice = true;
        while (choice) {
            System.out.print("Enter the action(buy or sell): ");
            String ops = sc.nextLine().toLowerCase();
            System.out.print("Enter the stock name: ");
            String company = sc.nextLine();
            System.out.print("Enter the stocks: ");
            int stocks = sc.nextInt();
            while (stocks < 0) {
                System.out.println("Stocks cannot be negative. Enter the stocks: ");
                stocks = sc.nextInt();
            }
            sc.nextLine();
            switch (ops) {
                case "buy":
                    marketObj.buy(stocks, company);
                    break;
                case "sell":
                    marketObj.sell(stocks, company);
                    break;
                default:
                    break;
            }
            System.out.println("Total Shares in Portfolio: " + marketObj.checkBalance());
            System.out.print("Continue or exit:");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("exit"))
                choice = false;

        }
        sc.close();
    }
}
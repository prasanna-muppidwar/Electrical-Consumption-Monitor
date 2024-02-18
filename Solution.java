import java.util.*;

class ElectricalEquipment {
    String name;
    int powerConsumption; 
    int burn; 

    public ElectricalEquipment(String name, int powerConsumption, int burn) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.burn = burn;
    }
}

class Solution {
    public static void main(String[] args) {
        
        ElectricalEquipment[] appliances = {
            new ElectricalEquipment("Fridge", 200, 5),
            new ElectricalEquipment("TV", 100, 3),
            new ElectricalEquipment("Laptop", 50, 2),
            new ElectricalEquipment("Microwave", 800, 8),
            new ElectricalEquipment("Lamp", 25, 1)
        };

        int maxBurn = 50; 

       
        ArrayList<ElectricalEquipment> selectedAppliances = knapsack(appliances, maxBurn);

       
        System.out.println("Selected Appliances:");
        for (ElectricalEquipment appliance : selectedAppliances) {
            System.out.println(appliance.name + " - Power Consumption: " + appliance.powerConsumption + "W, Burn: " + appliance.burn + " units/day");
        }
    }

    static ArrayList<ElectricalEquipment> knapsack(ElectricalEquipment[] appliances, int maxBurn) {
        int n = appliances.length;
        int[][] dp = new int[n + 1][maxBurn + 1];

       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxBurn; j++) {
                if (appliances[i - 1].burn <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - appliances[i - 1].burn] + appliances[i - 1].powerConsumption);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

      
        ArrayList<ElectricalEquipment> selectedAppliances = new ArrayList<>();
        int i = n, j = maxBurn;
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                selectedAppliances.add(appliances[i - 1]);
                j -= appliances[i - 1].burn;
            }
            i--;
        }

        return selectedAppliances;
    }
}

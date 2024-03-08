# Energy Audit Tool using Knapsack Algorithm

This project provides a solution for optimizing energy consumption in a household or commercial setting by selecting the most efficient combination of electrical appliances. It utilizes the Knapsack algorithm to efficiently select appliances based on their power consumption and daily usage.

## How it works

The program takes input data for each electrical appliance including its name, power consumption (in watts), and daily energy consumption (in units). It then calculates the optimal selection of appliances that maximize power consumption while staying within a specified daily energy consumption limit.

The Knapsack algorithm is employed to solve this optimization problem, treating the daily energy consumption limit as the capacity of the knapsack and the power consumption of each appliance as its weight. The goal is to maximize the total power consumption while ensuring that the total energy consumption does not exceed the specified limit.

## Usage

To use the Energy Audit Tool:

1. Define the electrical appliances by creating instances of the `ElectricalEquipment` class, specifying the name, power consumption, and daily energy consumption for each appliance.
2. Set the maximum daily energy consumption limit (`maxBurn` variable) according to the requirements.
3. Run the program, and it will output the selected appliances that maximize power consumption while staying within the specified daily energy consumption limit.

## Example

```java
public class Solution {
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
        // Implementation of knapsack algorithm
    }
}
```

## Contributing

Contributions are welcome! If you have suggestions for improvements or find any issues, feel free to open an issue or create a pull request on GitHub.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Note:** This tool provides a basic implementation for energy audit using the Knapsack algorithm. Depending on specific requirements and constraints, additional features and optimizations may be necessary.

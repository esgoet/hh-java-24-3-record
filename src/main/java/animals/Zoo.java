package animals;

import java.util.List;

public record Zoo(
        List<Animal> animals
) {
    public int calculateTotalFoodRequired() {
        int totalFoodRequired = 0;
        for (Animal animal : animals) {
            totalFoodRequired += animal.species().dailyFoodRequiredInGrams();
        }
        return totalFoodRequired;
    }
}

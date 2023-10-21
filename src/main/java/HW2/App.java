package HW2;

public class App {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(1, "Teddy bear", 10, 20);
        toyStore.addToy(2, "Doll", 5, 10);
        toyStore.addToy(3, "Car", 8, 15);
        toyStore.addToy(4, "Action figure", 12, 5);

        toyStore.setFrequency(1, 30);

        for (int i = 0;
             i < 20; i++) {
            toyStore.playGame();
        }
    }
}

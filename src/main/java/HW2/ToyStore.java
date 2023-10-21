package HW2;

import java.util.ArrayList;

public class ToyStore {
    private ArrayList<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(int id, String name, int quantity, double frequency) {
        toys.add(new Toy(id, name, quantity, frequency));
    }

    public void setFrequency(int id, double frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
                break;
            }
        }
    }

    public void playGame() {
        boolean hasToys = false;
        for (Toy toy : toys) {
            if (toy.getQuantity() > 0) {
                hasToys = true;
                break;
            }
        }
        if (!hasToys) {
            System.out.println("Sorry, we're out of toys.");
            return;
        }
        Toy randomToy = null;
        while (randomToy == null) {
            int randomIndex = (int) (Math.random() * toys.size());
            if (toys.get(randomIndex).getQuantity() > 0) {
                randomToy = toys.get(randomIndex);
            }
        }
        randomToy.play();
    }
}

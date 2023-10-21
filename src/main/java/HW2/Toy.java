package HW2;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double frequency;

    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void addToy(int quantity) {
        this.quantity += quantity;
    }

    public void play() {
        double randomNum = Math.random() * 100;
        if (randomNum <= frequency) {
            System.out.println("Congratulations! You won a " + name);
            quantity--;
        } else {
            System.out.println("Sorry, you didn't win anything.");
        }
    }
}


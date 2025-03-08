package org.example.enums;  // enum paketi içinde yer alıyor

public enum Plan {
    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200),
    DELUXE("Deluxe Plan", 300);

    private String name;
    private int price;

    // Enum constructor
    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

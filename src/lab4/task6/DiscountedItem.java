package lab4.task6;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == Item.class) return super.equals(otherObject);
        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
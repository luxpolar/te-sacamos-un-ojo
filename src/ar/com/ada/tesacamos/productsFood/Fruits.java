package ar.com.ada.tesacamos.productsFood;

import ar.com.ada.tesacamos.categories.Food;

import java.util.Objects;

public class Fruits extends Food {
    public Fruits() {

    }

    public Fruits(Double listPrice) {
        this.listPrice = listPrice;
    }


    @Override
    public int hashCode() {
        return -52 * Objects.hash(this.quantity, this.listPrice, this.discount, this.getDay());
    }

    @Override
    public String toString() {
        return "Fruits { listPrice = " + this.listPrice +
                ", quantity = " + this.quantity +
                ", discount = " + this.discount +
                ", day = " + this.getDay() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Fruits)) return false;
        Fruits that = (Fruits) obj;
        return super.equals(that);
    }
}

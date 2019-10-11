package ar.com.ada.tesacamos.productsFood;

import ar.com.ada.tesacamos.categories.Food;

import java.util.Objects;

public class Vegetables extends Food {
    public Vegetables() {

    }

    public Vegetables(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -53 * Objects.hash(this.quantity, this.listPrice, this.discount, this.getDay());
    }

    @Override
    public String toString() {
        return "Vegetables { listPrice = " + this.listPrice +
                ", quantity = " + this.quantity +
                ", discount = " + this.discount +
                ", day = " + this.getDay() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vegetables)) return false;
        Vegetables that = (Vegetables) obj;
        return super.equals(that);
    }
}

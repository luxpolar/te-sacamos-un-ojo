package ar.com.ada.tesacamos.productsFood;

import ar.com.ada.tesacamos.categories.Food;

import java.util.Objects;

public class Cookies extends Food {
    public Cookies() {

    }

    public Cookies(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -51 * Objects.hash(this.quantity, this.listPrice, this.discount, this.getDay());
    }

    @Override
    public String toString() {
        return "Cookies { listPrice = " + this.listPrice +
                ", quantity = " + this.quantity +
                ", discount = " + this.discount +
                ", day = " + this.getDay() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Cookies)) return false;
        Cookies that = (Cookies) obj;
        return super.equals(that);
    }
}

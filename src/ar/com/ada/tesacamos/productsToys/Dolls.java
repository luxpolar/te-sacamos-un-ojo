package ar.com.ada.tesacamos.productsToys;

import ar.com.ada.tesacamos.categories.Toys;

import java.util.Objects;

public class Dolls extends Toys {
    public Dolls() {

    }

    public Dolls(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -17 * Objects.hash(this.listPrice, this.discount, this.quantity);
    }

    @Override
    public String toString() {
        return "Dolls { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Dolls)) return false;
        Dolls that = (Dolls) obj;
        return super.equals(that);
    }
}

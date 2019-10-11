package ar.com.ada.tesacamos.productsToys;

import ar.com.ada.tesacamos.categories.Toys;

import java.util.Objects;

public class Cars extends Toys {
    public Cars() {

    }

    public Cars(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -16 * Objects.hash(this.listPrice, this.discount, this.quantity);
    }

    @Override
    public String toString() {
        return "Cars { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Cars)) return false;
        Cars that = (Cars) obj;
        return super.equals(that);
    }
}

package ar.com.ada.tesacamos.productsTools;

import ar.com.ada.tesacamos.categories.Tools;

import java.util.Objects;

public class Drills extends Tools {
    public Drills() {

    }

    public Drills(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "Drills { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + this.quantity +
                ", paymentType = " + this.getPaymentType() + " }";
    }

    @Override
    public int hashCode() {
        return -71 * Objects.hash(this.getPaymentType(), this.quantity, this.discount, this.listPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Drills)) return false;
        Drills that = (Drills) obj;
        return super.equals(that);
    }

}

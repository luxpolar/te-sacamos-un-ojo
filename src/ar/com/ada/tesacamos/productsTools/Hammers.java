package ar.com.ada.tesacamos.productsTools;

import ar.com.ada.tesacamos.categories.Tools;

import java.util.Objects;

public class Hammers extends Tools {
    public Hammers() {

    }

    public Hammers(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "Hammers { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + this.quantity +
                ", paymentType = " + this.getPaymentType() + " }";
    }

    @Override
    public int hashCode() {
        return -72 * Objects.hash(this.getPaymentType(), this.discount, this.quantity, this.listPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Hammers)) return false;
        Hammers that = (Hammers) obj;
        return super.equals(that);
    }

}

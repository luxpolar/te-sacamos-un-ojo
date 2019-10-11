package ar.com.ada.tesacamos.productsTools;

import ar.com.ada.tesacamos.categories.Tools;

import java.util.Objects;

public class Screwdriver extends Tools {
    public Screwdriver() {

    }

    public Screwdriver(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "Screwdriver { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + this.quantity +
                ", paymentType = " + this.getPaymentType() + " }";
    }

    @Override
    public int hashCode() {
        return -73 * Objects.hash(this.getPaymentType(), this.quantity, this.discount, this.listPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Screwdriver)) return false;
        Screwdriver that = (Screwdriver) obj;
        return super.equals(that);
    }
}

package ar.com.ada.tesacamos.categories;

import ar.com.ada.tesacamos.abst.Product;

import java.util.Objects;

public class Toys extends Product {

    public Toys() {

    }

    public Toys(Integer quantity, Double listPrice) {
        this.quantity = quantity;
        this.listPrice = listPrice;
    }


    @Override
    public Double calculateDiscount() {
        if (quantity >= 3 || listPrice > 3000) {
            this.setDiscount(quantity * listPrice * 0.25);
        } else {
            this.setDiscount(0.0);
        }
        return discount;
    }

    @Override
    public Double calculatePrice() {
        return listPrice * quantity;
    }

    @Override
    public Double calculateFinalPrice() {
        return this.calculatePrice() - discount;
    }

    @Override
    public int hashCode() {
        return -24 * Objects.hash(this.listPrice, this.discount, this.quantity);
    }

    @Override
    public String toString() {
        return "Toys { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Toys)) return false;
        Toys that = (Toys) obj;
        return super.equals(that);
    }
}

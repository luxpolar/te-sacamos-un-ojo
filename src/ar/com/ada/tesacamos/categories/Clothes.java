package ar.com.ada.tesacamos.categories;

import ar.com.ada.tesacamos.abst.Product;

import java.util.Objects;

public class Clothes extends Product {
    private String type;

    public Clothes() {

    }

    public Clothes(String type) {
        this.type = type;
    }

    public Clothes(String type, Double listPrice, Integer quantity) {
        this.type = type;
        this.listPrice = listPrice;
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Double calculateDiscount() {
        if (type.equals("Mujer") || type.equals("Niño")) {
            this.setDiscount(quantity * listPrice * 0.15);
        } else {
            this.setDiscount(0.0);
        }
        return this.discount;
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
    public String toString() {
        return "Clothes { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + this.quantity +
                ", type = " + this.type + " }";
    }

    @Override
    public int hashCode() {
        return -21 * Objects.hash(this.type, this.discount, this.quantity, this.listPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Clothes)) return false;
        Clothes that = (Clothes) obj;
        return this.type.equals(that.type) &&
                super.equals(that);
    }
}

package ar.com.ada.tesacamos.productsClothes;

import ar.com.ada.tesacamos.categories.Clothes;

import java.util.Objects;

public class WomenClothes extends Clothes {
    public WomenClothes() {

    }

    public WomenClothes(String type, Double listPrice) {
        this.setType(type);
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -14 * Objects.hash(this.listPrice, this.discount, this.quantity, this.getType());
    }

    @Override
    public String toString() {
        return "WomenClothes { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity +
                ", type: " + this.getType() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof WomenClothes)) return false;
        WomenClothes that = (WomenClothes) obj;
        return super.equals(that);
    }
}

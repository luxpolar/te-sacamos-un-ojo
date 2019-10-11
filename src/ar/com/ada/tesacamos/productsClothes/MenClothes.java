package ar.com.ada.tesacamos.productsClothes;

import ar.com.ada.tesacamos.categories.Clothes;

import java.util.Objects;

public class MenClothes extends Clothes {
    public MenClothes() {

    }

    public MenClothes(String type, Double listPrice) {
        this.setType(type);
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -13 * Objects.hash(this.listPrice, this.discount, this.quantity, this.getType());
    }

    @Override
    public String toString() {
        return "MenClothes { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity +
                ", type: " + this.getType() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof MenClothes)) return false;
        MenClothes that = (MenClothes) obj;
        return super.equals(that);
    }
}

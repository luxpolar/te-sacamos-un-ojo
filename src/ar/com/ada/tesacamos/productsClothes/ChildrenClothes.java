package ar.com.ada.tesacamos.productsClothes;

import ar.com.ada.tesacamos.categories.Clothes;
import ar.com.ada.tesacamos.categories.Toys;

import java.util.Objects;

public class ChildrenClothes extends Clothes {
    public ChildrenClothes() {

    }


    public ChildrenClothes(String type, Double listPrice) {
        this.setType(type);
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -12 * Objects.hash(this.listPrice, this.discount, this.quantity, this.getType());
    }

    @Override
    public String toString() {
        return "ChildrenClothes { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity +
                ", type: " + this.getType() + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof ChildrenClothes)) return false;
        ChildrenClothes that = (ChildrenClothes) obj;
        return super.equals(that);
    }
}

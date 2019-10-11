package ar.com.ada.tesacamos.productsToys;

import ar.com.ada.tesacamos.categories.Toys;

import java.util.Objects;

public class BoardGames extends Toys {
    public BoardGames() {

    }

    public BoardGames(Double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public int hashCode() {
        return -15 * Objects.hash(this.listPrice, this.discount, this.quantity);
    }

    @Override
    public String toString() {
        return "BoardGames { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", quantity = " + quantity + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof BoardGames)) return false;
        BoardGames that = (BoardGames) obj;
        return super.equals(that);
    }
}

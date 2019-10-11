package ar.com.ada.tesacamos.abst;

import java.util.Objects;

public abstract class Product {
    protected Double listPrice;
    protected Double discount;
    protected Integer quantity;

    public Product() {

    }

    public Product(Double listPrice, Integer quantity) {
        this.listPrice = listPrice;
        this.quantity = quantity;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public abstract Double calculateDiscount();

    public abstract Double calculatePrice();

    public abstract Double calculateFinalPrice();

    @Override
    public int hashCode() {
        return -34 * Objects.hash(this.quantity, this.listPrice, this.discount);
    }

    @Override
    public String toString() {
        return "Product { listPrice = " + this.listPrice +
                ", quantity = " + this.quantity +
                ", discount = " + this.discount + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Product)) return false;
        Product that = (Product) obj;
        return this.listPrice.equals(that.listPrice) &&
                this.discount.equals(that.discount) &&
                this.quantity.equals(that.quantity);
    }

}

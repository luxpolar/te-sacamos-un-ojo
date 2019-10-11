package ar.com.ada.tesacamos.categories;

import ar.com.ada.tesacamos.abst.Product;

import java.util.Objects;

public class Tools extends Product {
    private String paymentType;

    public Tools() {

    }

    public Tools(String paymentType) {
        this.paymentType = paymentType;
    }

    public Tools(String paymentType, Double listPrice, Integer quantity) {
        this.paymentType = paymentType;
        this.listPrice = listPrice;
        this.quantity = quantity;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public Double calculateDiscount() {
        if (paymentType.equals("TDC")) {
            this.setDiscount(quantity * listPrice * 0.5);
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
        return "Tools { listPrice = " + this.listPrice +
                ", discount = " + this.discount +
                ", paymentType = " + this.paymentType + " }";
    }

    @Override
    public int hashCode() {
        return -21 * Objects.hash(this.paymentType, this.discount, this.listPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Tools)) return false;
        Tools that = (Tools) obj;
        return this.paymentType.equals(that.paymentType) &&
                super.equals(that);
    }
}

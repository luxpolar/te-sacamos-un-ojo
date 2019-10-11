package ar.com.ada.tesacamos.categories;

import ar.com.ada.tesacamos.abst.Product;

import java.util.Objects;

public class Food extends Product {
    private String day;

    public Food() {

    }

    public Food(String day) {
        this.day = day;
    }

    public Food(String day, Double listPrice, Integer quantity) {
        this.day = day;
        this.listPrice = listPrice;
        this.quantity = quantity;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public Double calculateDiscount() {
        if (day.equals("Martes") || day.equals("Jueves")) {
            this.setDiscount(this.getQuantity() * this.getListPrice() * 0.10);
            return discount;
        } else {
            this.setDiscount(0.00);
            return discount;
        }
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
        return -13 * Objects.hash(this.quantity, this.listPrice, this.discount, this.day);
    }

    @Override
    public String toString() {
        return "Food { listPrice = " + this.listPrice +
                ", quantity = " + this.quantity +
                ", discount = " + this.discount +
                ", day = " + day + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Food)) return false;
        Food that = (Food) obj;
        return this.day.equals(that.day) &&
                super.equals(that);
    }

}

import ar.com.ada.tesacamos.abst.Product;
import ar.com.ada.tesacamos.categories.Clothes;
import ar.com.ada.tesacamos.categories.Food;
import ar.com.ada.tesacamos.categories.Tools;
import ar.com.ada.tesacamos.categories.Toys;
import ar.com.ada.tesacamos.productsClothes.ChildrenClothes;
import ar.com.ada.tesacamos.productsClothes.MenClothes;
import ar.com.ada.tesacamos.productsClothes.WomenClothes;
import ar.com.ada.tesacamos.productsFood.Cookies;
import ar.com.ada.tesacamos.productsFood.Fruits;
import ar.com.ada.tesacamos.productsFood.Vegetables;
import ar.com.ada.tesacamos.productsTools.Drills;
import ar.com.ada.tesacamos.productsTools.Hammers;
import ar.com.ada.tesacamos.productsTools.Screwdriver;
import ar.com.ada.tesacamos.productsToys.BoardGames;
import ar.com.ada.tesacamos.productsToys.Cars;
import ar.com.ada.tesacamos.productsToys.Dolls;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Scanner keyboard = new Scanner(System.in);
        int choice, choice1;
        String answer;
        System.out.println("¡Bienvenido o bienvenida a la tienda 'Te sacamos un ojo'!");
        do {
            System.out.println("Elija qué categoría de producto desea comprar: (1) Comidas, " +
                    "(2) Juguetes, (3) Ropa, (4) Herramientas");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Elija qué tipo de comida desea comprar: (1) Frutas, " +
                            "(2) Verduras, (3) Galletas.");
                    choice1 = keyboard.nextInt();
                    switch (choice1) {
                        case 1:
                            Food fruit = new Fruits(1500.00);
                            System.out.println("Ingrese la cantidad de frutas que quiere comprar: ");
                            fruit.setQuantity(keyboard.nextInt());
                            System.out.println("¿Qué día es hoy?");
                            fruit.setDay(keyboard.next());
                            products.add(fruit);
                            break;
                        case 2:
                            Food vegetable = new Vegetables(2000.00);
                            System.out.println("Ingrese la cantidad de verduras que quiere comprar: ");
                            vegetable.setQuantity(keyboard.nextInt());
                            System.out.println("¿Qué día es hoy?");
                            vegetable.setDay(keyboard.next());
                            products.add(vegetable);
                            break;
                        case 3:
                            Food cookie = new Cookies(3000.00);
                            System.out.println("Ingrese la cantidad de galletas que quiere comprar: ");
                            cookie.setQuantity(keyboard.nextInt());
                            System.out.println("¿Qué día es hoy?");
                            cookie.setDay(keyboard.next());
                            products.add(cookie);
                            break;
                        default:
                            System.out.println("Opción no disponible.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese qué tipo de juguete desea comprar: (1) Muñecas, " +
                            "(2) Autos, (3) Juegos de mesa.");
                    choice1 = keyboard.nextInt();
                    switch (choice1) {
                        case 1:
                            Toys doll = new Dolls(1000.00);
                            System.out.println("Ingrese la cantidad de muñecas que quiere comprar:");
                            doll.setQuantity(keyboard.nextInt());
                            products.add(doll);
                            break;
                        case 2:
                            Toys car = new Cars(2000.00);
                            System.out.println("Ingrese la cantidad de autos que quiere comprar: ");
                            car.setQuantity(keyboard.nextInt());
                            products.add(car);
                            break;
                        case 3:
                            Toys boardGame = new BoardGames(3000.00);
                            System.out.println("Ingrese la cantidad de juegos de mesa que quiere comprar: ");
                            boardGame.setQuantity(keyboard.nextInt());
                            products.add(boardGame);
                            break;
                        default:
                            System.out.println("Opción no disponible.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el tipo de ropa que quiere comprar: (1) Mujer, (2) Hombre, (3) Niño. ");
                    choice1 = keyboard.nextInt();
                    switch (choice1) {
                        case 1:
                            Clothes women = new WomenClothes("Mujer", 1500.00);
                            System.out.println("Ingrese la cantidad de prendas que quiere comprar: ");
                            women.setQuantity(keyboard.nextInt());
                            products.add(women);
                            break;
                        case 2:
                            Clothes men = new MenClothes("Hombre", 2000.00);
                            System.out.println("Ingrese la cantidad de prendas que quiere comprar: ");
                            men.setQuantity(keyboard.nextInt());
                            products.add(men);
                            break;
                        case 3:
                            Clothes children = new ChildrenClothes("Niño", 750.00);
                            System.out.println("Ingrese la cantidad de prendas que quiere comprar: ");
                            children.setQuantity(keyboard.nextInt());
                            products.add(children);
                            break;
                        default:
                            System.out.println("Opción no disponible.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el tipo de herramienta que quiere comprar: " +
                            "(1) Martillo, (2) Taladro, (3) Destornillador. ");
                    choice1 = keyboard.nextInt();
                    switch (choice1) {
                        case 1:
                            Tools hammer = new Hammers(1000.00);
                            System.out.println("Ingrese la cantidad de martillos que quiere comprar: ");
                            hammer.setQuantity(keyboard.nextInt());
                            System.out.println("Ingrese el tipo de pago, escriba 'TDC' " +
                                    "para tarjeta de crédito o 'EF' para efectivo: ");
                            hammer.setPaymentType(keyboard.next());
                            products.add(hammer);
                            break;
                        case 2:
                            Tools drill = new Drills(4000.00);
                            System.out.println("Ingrese la cantidad de taladros que quiere comprar:");
                            drill.setQuantity(keyboard.nextInt());
                            System.out.println("Ingrese el tipo de pago, escriba 'TDC' " +
                                    "para tarjeta de crédito o 'EF' para efectivo: ");
                            drill.setPaymentType(keyboard.next());
                            products.add(drill);
                            break;
                        case 3:
                            Tools screwdriver = new Screwdriver(500.00);
                            System.out.println("Ingrese la cantidad de destornilladores que quiere comprar: ");
                            screwdriver.setQuantity(keyboard.nextInt());
                            System.out.println("Ingrese el tipo de pago, escriba 'TDC' " +
                                    "para tarjeta de crédito o 'EF' para efectivo: ");
                            screwdriver.setPaymentType(keyboard.next());
                            products.add(screwdriver);
                            break;
                        default:
                            System.out.println("Opción no disponible.");
                    }
                    break;
                default:
                    System.out.println("Opción no disponible.");
            }
            System.out.println("¿Desea comprar algo más? Tipee 'si' o 'no'.");
            answer = keyboard.next();
        } while (answer.equals("si"));

        double payment = 0.00;
        double paymentDiscount = 0.00;
        int finalQuantity = 0;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            product.calculateDiscount();
            paymentDiscount = paymentDiscount + product.calculateFinalPrice();
            payment = payment + product.calculatePrice();
            finalQuantity = finalQuantity + product.getQuantity();
            System.out.println(product.toString());
        }
        System.out.println("El precio final a pagar con descuento es $" + paymentDiscount +
                ". Sin descuento, tendría que pagar $" + payment +
                ". Cantidad de productos comprados: " + finalQuantity);
    }
}

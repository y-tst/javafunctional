package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer first = new Customer("Maria", 8883322);

        // Ordinary realization

        greetCustomer(first);

        // Consumer Functional Interface

        greetCustomerConsumer.accept(first);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Dear " + customer.name
                + ", thanks for registering with phone: "
                + customer.phone);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Dear " + customer.name
                    + ", thanks for registering with phone: "
                    + customer.phone);

    static class Customer {
        private final String name;
        private final int phone;

        Customer(String name, int phone){
            this.name = name;
            this.phone = phone;
        }

    }
}
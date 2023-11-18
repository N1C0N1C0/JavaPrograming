package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customersList = new ArrayList<>();
        Customer customerT = new Customer(10010, "Tomas");
        Customer customerJ = new Customer(10020, "James");
        Customer customerE = new GoldCustomer(10030, "Edward");
        Customer customerP = new GoldCustomer(10040, "Pack");
        Customer customerK = new VIPCustomer(10050, "Kim");

        customersList.add(customerT);
        customersList.add(customerJ);
        customersList.add(customerE);
        customersList.add(customerP);
        customersList.add(customerK);

        for(Customer customer : customersList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        for(Customer customer : customersList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님의 " + cost + "원 지불했습니다.");
            System.out.println(customer.getCustomerName() + "님의 보너스는 " + customer.bonusPoint + "원입니다.");
        }

    }

}

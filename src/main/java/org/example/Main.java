package org.example;

import org.example.entity.Customer;
import org.example.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Ranil");
        customer.setAddress("Bambalapitiya");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(customer);//Inset
//        session.update(customer);//Update
        transaction.commit();
        session.close();
    }
}
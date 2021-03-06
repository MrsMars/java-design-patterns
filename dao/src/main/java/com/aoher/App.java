package com.aoher;

import com.aoher.dao.CustomerDao;
import com.aoher.dao.impl.DbCustomerDaoImpl;
import com.aoher.dao.impl.InMemoryCustomerDaoImpl;
import com.aoher.model.Customer;
import com.aoher.model.CustomerSchemaSql;
import org.h2.jdbcx.JdbcDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    private static final String DB_URL = "jdbc:h2:~/dao";
    private static Logger log = LoggerFactory.getLogger(App.class);

    /**
     * Program entry point.
     *
     * @param args command line args.
     * @throws Exception if any error occurs.
     */
    public static void main(final String[] args) throws Exception {
        final CustomerDao inMemoryDao = new InMemoryCustomerDaoImpl();
        performOperationsUsing(inMemoryDao);

        final DataSource dataSource = createDataSource();
        createSchema(dataSource);
        final CustomerDao dbDao = new DbCustomerDaoImpl(dataSource);
        performOperationsUsing(dbDao);
        deleteSchema(dataSource);
    }

    private static void deleteSchema(DataSource dataSource) throws SQLException {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(CustomerSchemaSql.DELETE_SCHEMA_SQL);
        }
    }

    private static void createSchema(DataSource dataSource) throws SQLException {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(CustomerSchemaSql.CREATE_SCHEMA_SQL);
        }
    }

    private static DataSource createDataSource() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL(DB_URL);
        return dataSource;
    }

    private static void performOperationsUsing(final CustomerDao customerDao) throws Exception {
        addCustomers(customerDao);
        log.info("customerDao.getAllCustomers(): ");
        try (Stream<Customer> customerStream = customerDao.getAll()) {
            customerStream.forEach((customer) -> log.info(String.valueOf(customer)));
        }
        log.info(String.format("customerDao.getCustomerById(2): %s", customerDao.getById(2)));
        final Customer customer = new Customer(4, "Dan", "Danson");
        customerDao.add(customer);
        log.info(String.format("customerDao.getAllCustomers(): %s", customerDao.getAll()));
        customer.setFirstName("Daniel");
        customer.setLastName("Danielson");
        customerDao.update(customer);
        log.info("customerDao.getAllCustomers(): ");
        try (Stream<Customer> customerStream = customerDao.getAll()) {
            customerStream.forEach((cust) -> log.info(String.valueOf(cust)));
        }
        customerDao.delete(customer);
        log.info(String.format("customerDao.getAllCustomers(): %s", customerDao.getAll()));
    }

    private static void addCustomers(CustomerDao customerDao) throws Exception {
        for (Customer customer : generateSampleCustomers()) {
            customerDao.add(customer);
        }
    }

    /**
     * Generate customers.
     *
     * @return list of customers.
     */
    public static List<Customer> generateSampleCustomers() {
        final Customer customer1 = new Customer(1, "Adam", "Adamson");
        final Customer customer2 = new Customer(2, "Bob", "Bobson");
        final Customer customer3 = new Customer(3, "Carl", "Carlson");
        final List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        return customers;
    }
}

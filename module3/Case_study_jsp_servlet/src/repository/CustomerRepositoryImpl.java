package repository;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_jsp_servlet";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Baolatao1";

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_id, customer_type_id, customer_name, " +
            "customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ALL_CUSTOMERS = "select * from customer";
    private static final String DELETE_CUSTOMER_SQL = "delete from customer where customer_id = ?";
    private static final String UPDATE_CUSTOMER_SQL = "update customer set customer_type_id = ?,customer_name= ?, customer_birthday =?, " +
            "customer_gender = ?, customer_id_card= ?, customer_phone =?, customer_email = ?, customer_address= ? where customer_id = ?;";
    private static final String SELECT_CUSTOMER = "select * from customer where customer_id = ?";
    private static final String SELECT_CUSTOMER_BY_NAME = "select * from customer where customer_name like ?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("customer_id");
                String typeId = null;
                switch (resultSet.getInt("customer_type_id")) {
                    case 1: typeId = "Diamond"; break;
                    case 2: typeId = "Platinum"; break;
                    case 3: typeId = "Gold"; break;
                    case 4: typeId = "Silver"; break;
                    case 5: typeId = "Member"; break;
                }
                String birthday = resultSet.getString("customer_birthday");
                String gender = null;
                switch (resultSet.getInt("customer_gender")) {
                    case 0: gender = "Female"; break;
                    case 1: gender = "Male"; break;
                    case 2: gender = "Other"; break;
                }
                String name = resultSet.getString("customer_name");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                customerList.add(new Customer(id, typeId, name, birthday, gender, idCard,phone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(String id) {
        Customer customer = null;
        try (Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER)) {
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String typeId = resultSet.getString("customer_type_id");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String name = resultSet.getString("customer_name");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                customer = new Customer(id, typeId,name, birthday, gender,idCard,phone, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void insert(Customer customer) throws SQLException {
        try (Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getCusType());
            preparedStatement.setString(3, customer.getCusName());
            preparedStatement.setString(4, customer.getCusDob());
            preparedStatement.setString(5, customer.getCusGender());
            preparedStatement.setString(6, customer.getCusIdNum());
            preparedStatement.setString(7, customer.getCusPhone());
            preparedStatement.setString(8, customer.getCusEmail());
            preparedStatement.setString(9, customer.getCusAddress());
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update(Customer customer) throws SQLException {
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL)) {
            statement.setString(1, customer.getCusType());
            statement.setString(2, customer.getCusName());
            statement.setString(3, customer.getCusDob());
            statement.setString(4, customer.getCusGender());
            statement.setString(5, customer.getCusIdNum());
            statement.setString(6, customer.getCusPhone());
            statement.setString(7, customer.getCusEmail());
            statement.setString(8, customer.getCusAddress());
            statement.setString(9, customer.getId());
            statement.executeUpdate();
        }
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME)){
            statement.setString(1,"%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString("customer_id");
                String typeId = resultSet.getString("customer_type_id");
                String name1 = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, typeId, name1, birthday, gender, idCard, phone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void delete(String id) {
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_SQL)) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

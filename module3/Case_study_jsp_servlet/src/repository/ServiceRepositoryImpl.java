package repository;

import model.Customer;
import model.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServiceRepositoryImpl {
    private static final String INSERT_SERVICE_SQL = "INSERT INTO service (service_id, service_name, service_area, " +
            "service_cost, service_max_people, rent_type_id, service_type_id, standard_room, " +
            "description_other_convenience, pool_area, number_of_floors) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    ConnectionDatabase connectionDatabase = new ConnectionDatabase();

    public void insert(Service service) throws SQLException {
        try (Connection connection = connectionDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE_SQL)) {
            preparedStatement.setInt(1, service.getId());
            preparedStatement.setString(2, service.getName());
            preparedStatement.setInt(3, service.getArea());
            preparedStatement.setDouble(4, service.getCost());
            preparedStatement.setInt(5, service.getMaxPeople());
            preparedStatement.setInt(6, service.getRentTypeId());
            preparedStatement.setInt(7, service.getServiceTypeId());
            preparedStatement.setString(8, service.getRoomStandard());
            preparedStatement.setString(9, service.getOtherConvenience());
            preparedStatement.setDouble(10, service.getPoolArea());
            preparedStatement.setInt(11, service.getFloors());
            preparedStatement.executeUpdate();
        }
    }
}

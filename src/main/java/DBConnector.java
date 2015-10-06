import java.sql.*;
import java.util.UUID;

public class DBConnector {

    private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/timothycavell";
    private Connection connection;

    public void init(String user, String password) {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, user, password);
            System.out.println(!connection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT description FROM PRODUCT WHERE product_id = 'c6262bea-7763-4d4a-b135-bc06219c05a2';";
            ResultSet resultSet = statement.executeQuery(sql);

            resultSet.next();

            String s = resultSet.getString(1);
            System.out.println(s);

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet execute(String sql) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            statement.close();
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    public Product getProductByUUID(UUID uuid) {

        String sql = "";

        execute(sql);

        return new Product();
    }
}

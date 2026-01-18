import java.sql.*;

public class MenuItemDAO {

    //Create
    public void addMenuItem(String name, double price) throws SQLException {
        String sql = "INSERT INTO menu_item (name, price) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.executeUpdate();
        }
    }

    //Read
    public void getMenuItems() throws SQLException {
        String sql = "SELECT * FROM menu_item";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " $" +
                                rs.getDouble("price")
                );
            }
        }
    }

    //Update
    public void updatePrice(int id, double price) throws SQLException {
        String sql = "UPDATE menu_item SET price = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, price);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    //Delete
    public void deleteMenuItem(int id) throws SQLException {
        String sql = "DELETE FROM menu_item WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

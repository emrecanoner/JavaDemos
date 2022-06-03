import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        selectData();
        insertData();
        /*updateData();
        deleteData();*/

    }

    public static void selectData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<Country>();
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country where Continent = 'Asia' and Region='Middle East'");
            while (resultSet.next()) {
/*                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("code"));
                System.out.println(resultSet.getString("continent"));
                System.out.println(resultSet.getString("region"));*/
                countries.add(new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql="insert into city(Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Selim");
            statement.setString(2,"TUR");
            statement.setString(3,"Selim");
            statement.setInt(4,2500);
            statement.executeUpdate();
            System.out.println("kayıt eklendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

   /* public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql="update city set population=100000,district='Turkey' where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            statement.executeUpdate();
            System.out.println("kayıt güncellendi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql="delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4083);
            statement.executeUpdate();
            System.out.println("kayıt silindi");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }*/

}

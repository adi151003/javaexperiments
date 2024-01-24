import java.sql.*;
public class MySqlCommand {
public static void main(String[] args)
{
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqluser","root","adi1510");
}
}
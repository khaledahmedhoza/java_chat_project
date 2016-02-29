/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author khoza
 */
import java.sql.*;
public class database {
    
    public Connection conn;
    private Statement statement;
    public static database db;
    
       //constructor for class variables
    private database(){
        String url = "jdbc:mysql://localhost:3306/";
        String dbname = "chating_app";
        String username = "khaled";
        String password = "iti";
        
         try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            this.conn = (Connection)DriverManager.getConnection(url+dbname,username,password);
            statement  = conn.createStatement() ;
        }
        catch (SQLException exp) {
            exp.printStackTrace();
        }
    }
     /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized database getdbcon() {
        if ( db == null ) {
            db = new database();
        }
        return db;
 
    }
    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException{
       // statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     * could be insert ,update , delete
     */
    public int insert(String insertQuery) throws SQLException {
        //statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }
    public int getLastid() throws SQLException
    {
        ResultSet res = statement.executeQuery("select max(id) from users");
        return Integer.parseInt(res.getString("id"));
    }
    
}

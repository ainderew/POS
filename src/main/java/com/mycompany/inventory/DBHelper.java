/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventory;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class DBHelper {

    Connection con = null;
    Statement stmnt = null;

    //CREATE DB CONNECTION
    public boolean connectDB() {

        String dbURL = "jdbc:sqlserver://ANDREW\\SQLEXPRESS;databaseName=dbPOS";
        String user = "root";
        String password = "root";
        boolean flag = false;

        try {

            if (con == null) {
                flag = true;
                con = DriverManager.getConnection(dbURL, user, password);

                System.out.println("DB connected");
            } else {
                con.close();
                System.out.println("DB not connected");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, e);

        }

        return flag;
    }

    public boolean addItem(String barcode, String name, float price, int qty) {
        boolean flag = false;

        try {
            stmnt = con.createStatement();
            String toInsert = "INSERT INTO tblitems (barcode, name, price, quantity) VALUES" + "('" + barcode + "', '" + name + "', " + price + ", " + qty + " )";
            if (stmnt.executeUpdate(toInsert) == 1) {
                flag = true;
                //add action if data is added to db
            }
        } catch (Exception e) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, e);

        }

        return flag;

    }
}

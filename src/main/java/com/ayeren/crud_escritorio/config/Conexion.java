
package com.ayeren.crud_escritorio.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anthony Davis Yeren Martinez
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/bdcrud_escritorio","root","root");
        } catch (Exception e) {
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}

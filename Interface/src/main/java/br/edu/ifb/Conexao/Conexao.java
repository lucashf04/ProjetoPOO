/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.Conexao;

import br.edu.ifb.DAO.ContatoDAO;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vaio LG
 */
public class Conexao {
    
   private static final String URL = "jdbc:sqlite:bancoAgenda.db";
    public static Connection getConnection() {
        
       try {
           return DriverManager.getConnection(URL);
       } catch (SQLException ex) {
           System.out.println("Banco não conectado!");
           Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
    
    public static void closeConnection(Connection con){
       try {
           con.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
       closeConnection(con);
        try {  
           
           stmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
       try {
           rs.close();
       } catch (SQLException ex) {
           Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
    
    public static void main(String[] args) {
        ContatoDAO ver = new ContatoDAO();
        ver.lerBanco();
    }
}

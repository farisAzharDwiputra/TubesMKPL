///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package wi.go.jim;
//
//import static org.junit.Assert.*; // Pastikan ini diimpor
//import org.junit.Test;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// *
// * @author LENOVO
// */
//public class MemberTerdaftarTest {
//
//    private static final String DB_URL = "jdbc:mysql://localhost/tubespbo";
//    private static final String USER = "root";
//    private static final String PASS = "";
//
//    @Test
//    public void testUserTerdaftarDiDatabase() {
//        String emailDicari = "faris@gmail.com";
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//            String query = "SELECT * FROM dbregister WHERE Email = ?";
//            stmt = conn.prepareStatement(query);
//            stmt.setString(1, emailDicari); 
//
//            rs = stmt.executeQuery();
//
//            boolean ditemukan = false;
//            if (rs.next()) {
//                ditemukan = true;
//
//                String role = rs.getString("Role");
//                String nama = rs.getString("Nama");
//
//                System.err.println("Data ditemukan: Email = " + emailDicari + ", Role = " + role + ", Nama = " + nama);
//
//                assertEquals("Role harus Member", "member", role.toLowerCase());
//                assertEquals("Nama harus faris", "faris", nama.toLowerCase());
//            }
//
//            assertTrue("User dengan email " + emailDicari + " tidak ditemukan di database", ditemukan);
//
//        } catch (SQLException e) {
//            fail("Gagal koneksi atau query database: " + e.getMessage());
//        } 
//    }
//}
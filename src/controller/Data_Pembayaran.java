package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Data_Pembayaran {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_pembayaran;
    public String kelompok;
    public String biaya;
    
    public void simpan()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "INSERT INTO pembayaran(id_pembayaran,kelompok,biaya)VALUE(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_pembayaran);
        pst.setString(2,kelompok);
        pst.setString(3,biaya);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "UPDATE pembayaran set kelompok=?, biaya=? where id_pembayaran=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,kelompok);
        pst.setString(2,biaya);
        pst.setString(3,id_pembayaran);
        pst.execute();
        pst.close();
    }
    
    public void hapus() throws SQLException{
        conn=koneksi.getkoneksi();
        String sql="DELETE from pembayaran where id_pembayaran=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, id_pembayaran);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet UpdatetblPembayaran()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "select id_pembayaran,kelompok,biaya from pembayaran";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
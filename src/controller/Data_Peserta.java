package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Data_Peserta {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String no_pendaftaran;
    public String nama_peserta;
    public String jk;
    public String nisn;
    public String ttl;
    public String agama;
    public String alamat;
    
    public void simpan()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "INSERT INTO peserta(no_pendaftaran,nama_peserta,jk,nisn,ttl,agama,alamat)VALUE(?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,no_pendaftaran);
        pst.setString(2,nama_peserta);
        pst.setString(3,jk);
        pst.setString(4,nisn);
        pst.setString(5,ttl);
        pst.setString(6,agama);
        pst.setString(7,alamat);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "UPDATE peserta set nama_peserta=?, jk=?,nisn=?,ttl=?,agama=?,alamat=? where no_pendaftaran=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,nama_peserta);
        pst.setString(2,jk);
        pst.setString(3,nisn);
        pst.setString(4,ttl);
        pst.setString(5,agama);
        pst.setString(6,alamat);
        pst.setString(7,no_pendaftaran);
        pst.execute();
        pst.close();
    }
    
    public void hapus() throws SQLException{
        conn=koneksi.getkoneksi();
        String sql="DELETE from peserta where no_pendaftaran=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, no_pendaftaran);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet UpdatetbPerserta()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "select no_pendaftaran,nama_peserta,jk,nisn,ttl,agama,alamat from peserta";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
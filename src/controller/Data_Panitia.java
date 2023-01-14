package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Data_Panitia {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String no_panitia;
    public String nama_panitia;
    public String nip_panitia;
    public String notelp;
    public String alamat;
    
    public void simpan()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "INSERT INTO panitia(no_panitia,nama_panitia,nip_panitia,notelp,alamat)VALUE(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,no_panitia);
        pst.setString(2,nama_panitia);
        pst.setString(3,nip_panitia);
        pst.setString(4,notelp);
        pst.setString(5,alamat);
        pst.execute();
        pst.close();
    }
    
    public void edit()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "UPDATE panitia set nama_panitia=?, nip_panitia=?,notelp=?,alamat=?where no_panitia=?";
        pst = conn.prepareStatement(sql);
        pst.setString(1,nama_panitia);
        pst.setString(2,nip_panitia);
        pst.setString(3,notelp);
        pst.setString(4,alamat);
        pst.setString(5,no_panitia);
        pst.execute();
        pst.close();
    }
    
    public void hapus() throws SQLException{
        conn=koneksi.getkoneksi();
        String sql="DELETE from peserta where no_pendaftaran=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, no_panitia);
            pst.execute();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet UpdatetblPanitia()throws SQLException{
        conn = koneksi.getkoneksi();
        sql = "select no_panitia,nama_panitia,nip_panitia,notelp,alamat from panitia";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
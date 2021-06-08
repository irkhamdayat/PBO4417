/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Koneksi;

import mvc.Dao.DaoInterface;
import mvc.Model.ModelUser;
import java.sql.Connection;
import mvc.Dao.DaoInterface;
import mvc.Model.ModelUser;
import mvc.View.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class KoneksiQuery implements DaoInterface{
    public static String insert = "INSERT INTO tbl_pendaftaran (nik, nama, jenis_kelamin, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    public static String update = "UPDATE tbl_pendaftaran SET nama=?,jenis_kelamin=?,alamat=?,usia=?,alasan=? WHERE nik=?;";
    public static String delete = "DELETE FROM tbl_pendaftaran WHERE nik=?;";
    public static String select = "SELECT * FROM tbl_pendaftaran;";
    
    Connection connection;
    
    public KoneksiQuery() {
        connection = Koneksi.connect();
    }
    
    public void insert(ModelUser user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(insert);
            stmt.setString(1, user.getNik());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.setString(4, user.getAlamat());
            stmt.setInt(5, user.getUsia());
            stmt.setString(6, user.getAlasan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    
    public void update(ModelUser user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(KoneksiQuery.update);
            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getJk());
            stmt.setString(3, user.getAlamat());
            stmt.setInt(4, user.getUsia());
            stmt.setString(5, user.getAlasan());
            stmt.setString(6, user.getNik());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 

   
    @Override
    public void delete(String nik) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, nik);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    public List<ModelUser> getAll() {
        List<ModelUser> listUser = null;
        try {
            listUser = new ArrayList<ModelUser>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelUser user = new ModelUser();
                user.setNik(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jenis_kelamin"));
                user.setAlamat(rs.getString("alamat"));
                user.setUsia(rs.getInt("usia"));
                user.setAlasan(rs.getString("alasan"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(KoneksiQuery.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

    @Override
    public void delete(int nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }







}

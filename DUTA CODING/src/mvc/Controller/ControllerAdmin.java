/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.Koneksi.*;
import mvc.Model.*;
import mvc.View.*;
import mvc.Dao.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public final class ControllerAdmin {
    FormAdmin form;
    DaoInterface iuser;
    List<ModelUser> listUser;
    
    public ControllerAdmin(FormAdmin form) {
        this.form = form;
        iuser = new KoneksiQuery();
        listUser = iuser.getAll();
    }
    public void showData() {
        listUser = iuser.getAll();
        TabelModel tmUser = new TabelModel(listUser);
        form.getTabelData().setModel(tmUser);
    }
    public void delete() {
     if(!form.getTxtNik().getText().trim().isEmpty()){
            String id = form.getTxtNik().getText();
            iuser.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        }else {
            JOptionPane.showMessageDialog(form, "Pilih Data yang akan di hapus");
    }
    }
    
    public void reset() {
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtUsia().setText("");
        form.getTxtAlamat().setText("");
    }
    public void editData(int row) {
        form.getTxtNik().setText(listUser.get(row).getNik());
        form.getTxtNama().setText(listUser.get(row).getNama());
        form.getCmbJK().setSelectedItem(listUser.get(row).getJk());
        form.getTxtAlamat().setText(listUser.get(row).getAlamat());
        form.getTxtUsia().setText(listUser.get(row).getUsia().toString());
        form.getTxtAlasan().setText(listUser.get(row).getAlasan());   
    }
    public void update() {
        if (!form.getTxtNik().getText().trim().isEmpty()) {
            ModelUser user = new ModelUser();
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getCmbJK().getSelectedItem().toString());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setUsia(Integer.parseInt(form.getTxtUsia().getText()));
            user.setAlasan(form.getTxtAlasan().getText());
            iuser.update(user);
            reset();
            JOptionPane.showMessageDialog(null, "Update Success");
            
        } else {
            JOptionPane.showMessageDialog(form, "Please select data first");
        }
    }

}




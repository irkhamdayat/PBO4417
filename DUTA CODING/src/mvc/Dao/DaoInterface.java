/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Dao;
import mvc.Model.ModelUser;
import java.util.List;
/**
 *
 * @author user
 */
public interface DaoInterface {
    public void insert(ModelUser user);
    public void update(ModelUser user);
    public void delete(int nik);
    public List<ModelUser> getAll();

    public void delete(String id);
}

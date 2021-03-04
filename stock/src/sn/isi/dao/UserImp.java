package sn.isi.dao;

import sn.isi.enitities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserImp implements IUser{
    DB db = new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(User U) throws Exception {
        String sql = "INSERT INTO user VALUES(NULL, ?,?,?,?)";
        db.initPrepar(sql);
        db.getPstm().setString(1,U.getNom());
        db.getPstm().setString(2,U.getPrenom());
        db.getPstm().setString(3,U.getMail());
        db.getPstm().setString(4,U.getPassword());
        ok = db.executeMaj();
        return ok;
    }

    @Override
    public List<User> liste() throws Exception {
        List<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM user";
        db.initPrepar(sql);
        rs = db.executeSelect();
        while (rs.next())
        {
            User user = new User();
            user.setIdU(rs.getInt(1));
            user.setNom(rs.getString(2));
            user.setPrenom(rs.getString(3));
            user.setMail(rs.getString(4));
            user.setPassword(rs.getString(5));
            users.add(user);
        }

        return users;
    }

    @Override
    public int update(User U) throws Exception {
        String sql = "UPDATE user SET nom = ? ,prenom = ?, mail= ?, password = ? WHERE idU = ?";
        db.initPrepar(sql);
        db.getPstm().setString(1,U.getNom());
        db.getPstm().setString(2,U.getPrenom());
        db.getPstm().setString(3,U.getMail());
        db.getPstm().setString(4,U.getPassword());
        db.getPstm().setInt(5,U.getIdU());
        ok = db.executeMaj();
        db.closeConnection();
        return ok;
    }


    @Override
    public int delete(int id) throws Exception {
        String sql = "DELETE FROM user WHERE idU = ?";
        db.initPrepar(sql);
        db.getPstm().setInt(1,id);
        ok = db.executeMaj();
        return ok;
    }
}

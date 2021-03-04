package sn.isi.dao;

import sn.isi.enitities.Produit;
import sn.isi.enitities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduitImp implements IProduit{
    DB db = new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(Produit p) throws Exception {
        User user = new User();
        String sql = "INSERT INTO produit VALUES(?,?,?)";
        db.initPrepar(sql);
        db.getPstm().setString(1,p.getRef());
        db.getPstm().setString(2,p.getNomProd());
        db.getPstm().setInt(3,p.getUser().getIdU());
        ok = db.executeMaj();
        return ok;
    }

    @Override
    public List<Produit> liste() throws Exception {
        List<Produit> produits = new ArrayList<Produit>();
        String sql = "SELECT * FROM produit";
        db.initPrepar(sql);
        rs = db.executeSelect();
        while (rs.next())
        {
            User user = new User();
            Produit produit = new Produit();
            produit.setRef(rs.getString(1));
            produit.setNomProd(rs.getString(2));
            //produit.setUser(rs.getInt(3));
            produits.add(produit);
        }
        return produits;
    }

    @Override
    public int update(Produit p) throws Exception {
        String sql = "UPDATE produit SET ref = ? ,nomProd = ?, user = ? WHERE ref = ?";
        db.initPrepar(sql);
        db.getPstm().setString(1,p.getRef());
        db.getPstm().setString(2,p.getNomProd());
        db.getPstm().setInt(3,p.getUser().getIdU());
        db.getPstm().setString(4,p.getRef());
        ok = db.executeMaj();
        db.closeConnection();
        return ok;
    }

    @Override
    public int delete(Produit p) throws Exception {
        String sql = "DELETE FROM produit WHERE ref = ?";
        db.initPrepar(sql);
        db.getPstm().setString(1,p.getRef());
        ok = db.executeMaj();
        return ok;
    }
}

package sn.isi.dao;

import sn.isi.enitities.Produit;

import java.util.List;

public interface IProduit {
    public int add(Produit p) throws Exception;
    public List<Produit> liste() throws Exception;
    public int update(Produit p) throws Exception;
    public int delete(Produit p) throws Exception;
}

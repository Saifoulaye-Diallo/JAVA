package sn.isi.entities;

public class Employe extends Personne{
    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}

package sn.isi.entities;

public class Medecin extends Personne{
    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}

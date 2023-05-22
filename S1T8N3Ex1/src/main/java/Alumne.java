public class Alumne {

    private String nom;
    private int edat;
    private String curs;
    private double nota;

    public Alumne(String nom,int edat,String curs,double nota){
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCurs() {
        return this.curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString(){
        return this.nom + " amb " + this.edat + " anys, va al curs " + this.curs + " i té una nota de " + this.nota;
    }
}

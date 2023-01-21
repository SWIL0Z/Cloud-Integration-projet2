package com.RichemeVyas.Domain;

public class Address {
    private String owner;
    private String ligne1;
    private String ligne2;
    private String cp;
    private String ville;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getLigne1() {
        return ligne1;
    }
    public void setLigne1(String ligne1) {
        this.ligne1 = ligne1;
    }
    public String getLigne2() {
        return ligne2;
    }
    public void setLigne2(String ligne2) {
        this.ligne2 = ligne2;
    }
    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return ligne1 + "(" + ligne2 + ")" + ", " + cp + " " + ville + " of user \"" + owner + "\"";
    }
}

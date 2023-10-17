package lt.codeacademy.biudzetas;

public class IrasasDTO {

    int suma;
    String kategorija;
    boolean arIBanka;
    String papildomaInfo;
    String atsiskaitymoBudas;

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public void setArIBanka(boolean arIBanka) {
        this.arIBanka = arIBanka;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public int getSuma() {
        return suma;
    }

    public String getKategorija() {
        return kategorija;
    }

    public boolean isArIBanka() {
        return arIBanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }
}

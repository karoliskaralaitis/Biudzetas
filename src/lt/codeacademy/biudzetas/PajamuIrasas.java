package lt.codeacademy.biudzetas;

import java.time.LocalDate;

public class PajamuIrasas {

    private int suma;
    private LocalDate data;
    private String kategorija;
    private boolean pozymisArIBanka;
    private String papildomaInfo;
    private int id;

    public PajamuIrasas(int id, int suma, String kategorija, boolean pozymisArIBanka, String papildomaInfo) {
        this.suma = suma;
        this.data = LocalDate.now();
        this.kategorija = kategorija;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format( "ID: %d Pajamu suma: %d data: %tF kategorija : %s ar pervesta i banka? %b papildoma informacija: %s", id,
                suma, data, kategorija, pozymisArIBanka, papildomaInfo);
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public boolean isPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(boolean pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
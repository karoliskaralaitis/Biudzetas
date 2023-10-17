package lt.codeacademy.biudzetas;

import java.time.LocalDate;

public class IslaiduIrasas {

    private int suma;
    private LocalDate data;
    private String kategorija;
    private String atsiskaitymoBudas;
    private String papildomaInfo;
    private int id;

    public IslaiduIrasas(int id, int suma, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.data = LocalDate.now();
        this.kategorija = kategorija;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d Islaidu suma: %d data: %tF kategorija: %s atsiskaitymo budas: %s papildoma informacija: %s", id,
                suma, data, kategorija, atsiskaitymoBudas, papildomaInfo);
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

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
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
package lt.codeacademy.biudzetas;

import java.util.ArrayList;

public class Biudzetas {

    private final ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
    private final ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();

    public void pridetiPajamuIrasa(IrasasDTO irasas) {
        int id = idGeneratorPajamos();
        pajamos.add(new PajamuIrasas(id ,irasas.getSuma(), irasas.getKategorija(), irasas.isArIBanka(), irasas.getPapildomaInfo()));
    }
    public void pridetiIslaiduIrasa (IrasasDTO irasas){
        int id = idGeneratorIslaidos();
        islaidos.add(new IslaiduIrasas(id, irasas.getSuma(), irasas.getKategorija(), irasas.getAtsiskaitymoBudas(), irasas.getPapildomaInfo()));
    }
    public void rodytiPajamas(){
        System.out.println("Pajamu irasai:");
        for (PajamuIrasas pajamuIrasas : pajamos){
            System.out.println(pajamuIrasas);
        }
    }
    public void rodytiIslaidas(){
        System.out.println("Islaidu irasai:");
        for (IslaiduIrasas islaiduIrasas : islaidos){
            System.out.println(islaiduIrasas);
        }
    }
    public double balansas(){
        double pajamuSuma = 0;
        double islaiduSuma = 0;

        for (PajamuIrasas pajamosIrasas : pajamos) {
            pajamuSuma += pajamosIrasas.getSuma();
        }
        for (IslaiduIrasas islaiduIrasas : islaidos) {
            islaiduSuma += islaiduIrasas.getSuma();
        }
        return pajamuSuma - islaiduSuma;
    }
    public int idGeneratorPajamos(){
        int id = 0;
        if (pajamos.isEmpty()){
            id = 1;
        }else {
            PajamuIrasas pajamuIrasas = pajamos.get(pajamos.size() - 1);
            id = pajamuIrasas.getId() + 1;
        }
        return  id;
    }
    public int idGeneratorIslaidos(){
        int id = 0;
        if (islaidos.isEmpty()){
            id = 1;
        }else {
            IslaiduIrasas islaiduIrasas = islaidos.get(islaidos.size() - 1);
            id = islaiduIrasas.getId() + 1;
        }
        return  id;
    }
    public void istrintiPajamuIrasa(int idIstrinti){
        pajamos.remove(idIstrinti - 1);
    }
    public void istrintiIslaiduIrasa(int idIstrinti){
        islaidos.remove(idIstrinti - 1);
    }
}

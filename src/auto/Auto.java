package auto;

public class Auto {

    private String marca;
    private String modello;
    private double prezzo;

    public void setMarca(String newMarca){
        marca = newMarca;
    }
    public void setModello(String newModello){
        modello = newModello;
    }
    public void setPrezzo(double newPrezzo){
        prezzo = newPrezzo;
    }

    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public double getPrezzo(){
        return prezzo;
    }

    public Auto(){
        // non necessario
        marca = null;
        modello = null;
        prezzo = 0;
    }

    public Auto(String newMarca, String newModello, double newPrezzo){
        marca = newMarca;
        modello = newModello;
        if (prezzo < 0)
            prezzo = 0;
        prezzo = newPrezzo;
    }
    public Auto(String newMarca, String newModello){
        marca = newMarca;
        modello = newModello;
    }

    public Auto(double newPrezzo){
        if (prezzo < 0)
            prezzo = 0;
        prezzo = newPrezzo;
    }

}

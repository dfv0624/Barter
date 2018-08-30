package daniel_vasquez.change;

/**
 * Created by USER on 2/04/2018.
 */

public class Anunciosmodelo {
    private String Cambio;
    private int ImgCambio;

    public Anunciosmodelo() {
    }

    public Anunciosmodelo(String cambio, int imgCambio) {
        Cambio = cambio;
        ImgCambio = imgCambio;
    }

    public String getCambio() {
        return Cambio;
    }

    public void setCambio(String cambio) {
        Cambio = cambio;
    }

    public int getImgCambio() {
        return ImgCambio;
    }

    public void setImgCambio(int imgCambio) {
        ImgCambio = imgCambio;
    }
}

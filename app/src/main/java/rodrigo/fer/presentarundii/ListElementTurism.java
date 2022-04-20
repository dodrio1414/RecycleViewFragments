package rodrigo.fer.presentarundii;

import java.io.Serializable;

public class ListElementTurism implements Serializable {

    private int photo;
    private String nameturism;
    private String descrip;
    private String pais;

    public ListElementTurism(int photo, String nameturism, String descrip, String pais) {
        this.photo = photo;
        this.nameturism = nameturism;
        this.descrip = descrip;
        this.pais = pais;
    }

    public String getNameturism() {
        return nameturism;
    }

    public void setNameturism(String nameturism) {
        this.nameturism = nameturism;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

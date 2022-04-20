package rodrigo.fer.presentarundii;

public class ListElementTurismCusco {
    private int photo;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
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

    private String nameturism;
    private String descrip;


    public ListElementTurismCusco(int photo, String nameturism, String descrip) {
        this.photo = photo;
        this.nameturism = nameturism;
        this.descrip = descrip;
    }


}

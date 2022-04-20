package rodrigo.fer.presentarundii;

public class ListElementMusic {

    public String name;
    public String artista;
    public String status;

    public ListElementMusic(String name, String artista, String status) {

        this.name = name;
        this.artista = artista;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

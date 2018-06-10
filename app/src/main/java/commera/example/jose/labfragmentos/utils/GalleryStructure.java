package commera.example.jose.labfragmentos.utils;

public class GalleryStructure {
    private Integer casa;
    private String image;
    public GalleryStructure(Integer casa, String image){
        casa = 0;
        image = null;
    }

    public GalleryStructure() {

    }

    public void setCasa(Integer casa){
        this.casa = casa;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getCasa() {
        return this.casa;
    }
}

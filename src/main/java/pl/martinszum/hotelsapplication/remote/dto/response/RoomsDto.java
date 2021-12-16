package pl.martinszum.hotelsapplication.remote.dto.response;

public class RoomsDto {
    private Integer id;
    private Integer beds;
    private float price;

    public RoomsDto() {
    }

    public RoomsDto(Integer id, Integer beds, float price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

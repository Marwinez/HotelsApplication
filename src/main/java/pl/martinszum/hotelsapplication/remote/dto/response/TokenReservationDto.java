package pl.martinszum.hotelsapplication.remote.dto.response;

public class TokenReservationDto {
    private String token;

    public TokenReservationDto() {
    }

    public TokenReservationDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

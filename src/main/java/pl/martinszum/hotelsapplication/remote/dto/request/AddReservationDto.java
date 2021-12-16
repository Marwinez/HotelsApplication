package pl.martinszum.hotelsapplication.remote.dto.request;

import java.util.List;

public class AddReservationDto {
    private List<HotelsReservationDto> roomsReservation;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<HotelsReservationDto> roomsReservation, PersonReservationDto person) {
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public List<HotelsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<HotelsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}

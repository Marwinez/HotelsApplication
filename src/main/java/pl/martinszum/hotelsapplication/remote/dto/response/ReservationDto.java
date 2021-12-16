package pl.martinszum.hotelsapplication.remote.dto.response;

import pl.martinszum.hotelsapplication.domain.model.StatusDto;
import pl.martinszum.hotelsapplication.remote.dto.request.HotelsReservationDto;
import pl.martinszum.hotelsapplication.remote.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private StatusDto status;
    private List<HotelsReservationDto> roomsReservation;
    private PersonReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, StatusDto status, List<HotelsReservationDto> roomsReservation, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusDto getStatus() {
        return status;
    }

    public void setStatus(StatusDto status) {
        this.status = status;
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

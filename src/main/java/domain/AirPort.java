package domain;

import domain.City;


import java.util.Objects;


public class AirPort {


    private int id;
    private String name;
    private String code;

    private City city;

    public AirPort() {
    }

    public AirPort(String code) {
        this.code = code;
    }

    public AirPort(int id, String name, String code, City city) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCity_id() {
        return city;
    }

    public void setCity_id(City city_id) {
        this.city = city_id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPort airport = (AirPort) o;
        return Objects.equals(code, airport.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
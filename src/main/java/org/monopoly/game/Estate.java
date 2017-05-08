package org.monopoly.game;

public class Estate extends Property {

    private String color;
    private int housePrice;
    private int hotelPrice;
    private int rentWithOneHouse;
    private int rentWithTwoHouses;
    private int rentWithThreeHouses;
    private int rentWithFourHouses;
    private int rentWithAHotel;
    private int housesAmount;
    private boolean hotel;
    private boolean buildable;
    private boolean sellable;

    public Estate(String location, String color,int housePrice, int hotelPrice, int propertyPrice, int mortgageValue, int rent, 
              int rentWithOneHouse, int rentWithTwoHouses, int rentWithThreeHouses, int rentWithFourHouses, int rentWithAHotel) {
        super(location, propertyPrice, mortgageValue, rent);
        this.color = color;
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
        this.rentWithOneHouse = rentWithOneHouse;
        this.rentWithTwoHouses = rentWithTwoHouses;
        this.rentWithThreeHouses = rentWithThreeHouses;
        this.rentWithFourHouses = rentWithFourHouses;
        this.rentWithAHotel = rentWithAHotel;
        this.housesAmount = 0;
        this.hotel = false;
        this.buildable = false;
        this.sellable = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(int hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public int getRentWithOneHouse() {
        return rentWithOneHouse;
    }

    public void setRentWithOneHouse(int rentWithOneHouse) {
        this.rentWithOneHouse = rentWithOneHouse;
    }

    public int getRentWithTwoHouses() {
        return rentWithTwoHouses;
    }

    public void setRentWithTwoHouses(int rentWithTwoHouses) {
        this.rentWithTwoHouses = rentWithTwoHouses;
    }

    public int getRentWithThreeHouses() {
        return rentWithThreeHouses;
    }

    public void setRentWithThreeHouses(int rentWithThreeHouses) {
        this.rentWithThreeHouses = rentWithThreeHouses;
    }

    public int getRentWithFourHouses() {
        return rentWithFourHouses;
    }

    public void setRentWithFourHouses(int rentWithFourHouses) {
        this.rentWithFourHouses = rentWithFourHouses;
    }

    public int getRentWithAHotel() {
        return rentWithAHotel;
    }

    public void setRentWithAHotel(int rentWithAHotel) {
        this.rentWithAHotel = rentWithAHotel;
    }

    public int getHousesAmount() {
        return housesAmount;
    }

    public void setHousesAmount(int housesAmount) {
        this.housesAmount = housesAmount;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public boolean isSellable() {
        return sellable;
    }

    public void setSellable(boolean sellable) {
        this.sellable = sellable;
    }

}

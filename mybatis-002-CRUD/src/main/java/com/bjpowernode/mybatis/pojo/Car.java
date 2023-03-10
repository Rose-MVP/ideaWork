package com.bjpowernode.mybatis.pojo;

public class Car {
    //
    private Long id;
    private String CarNum;
    private  String brand;
    private  Double guidePrice;
    private String produceTime;
    private String carType;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", CarNum='" + CarNum + '\'' +
                ", brand='" + brand + '\'' +
                ", guidePrice=" + guidePrice +
                ", produceTime='" + produceTime + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getCarNum() {
        return CarNum;
    }

    public String getBrand() {
        return brand;
    }

    public Double getGuidePrice() {
        return guidePrice;
    }

    public String getProduceTime() {
        return produceTime;
    }

    public String getCarType() {
        return carType;
    }

    public Car() {
    }

    public Car(Long id, String CarNum, String brand, Double guidePrice, String produceTime, String carType) {
        this.id = id;
        this.CarNum = CarNum;
        this.brand = brand;
        this.guidePrice = guidePrice;
        this.produceTime = produceTime;
        this.carType = carType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCarNum(String CarNum) {
        this.CarNum = CarNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGuidePrice(Double guidePrice) {
        this.guidePrice = guidePrice;
    }

    public void setProduceTime(String produceTime) {
        this.produceTime = produceTime;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

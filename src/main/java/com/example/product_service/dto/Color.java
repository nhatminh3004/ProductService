package com.example.product_service.dto;

public class Color {
    private int colorID;
    private String name;
    private String code;
    private int productID;

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
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

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Color(int colorID, String name, String code, int productID) {
        this.colorID = colorID;
        this.name = name;
        this.code = code;
        this.productID = productID;
    }

    public Color() {
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorID=" + colorID +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", productID=" + productID +
                '}';
    }
}

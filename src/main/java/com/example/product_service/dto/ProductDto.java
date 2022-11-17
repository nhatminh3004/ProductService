package com.example.product_service.dto;

public class ProductDto {
    private int productID;
    private String name;
    private int price;
    private boolean hightLight;
    private boolean newProduct;
    private String moTa;
    private int soLuong;
    private int categoryID;
    private int colorID;
    private String nameColor;
    private String codeColor;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHightLight() {
        return hightLight;
    }

    public void setHightLight(boolean hightLight) {
        this.hightLight = hightLight;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getCodeColor() {
        return codeColor;
    }

    public void setCodeColor(String codeColor) {
        this.codeColor = codeColor;
    }

    public ProductDto(int productID, String name, int price, boolean hightLight, boolean newProduct, String moTa, int soLuong, int categoryID, int colorID, String nameColor, String codeColor) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.hightLight = hightLight;
        this.newProduct = newProduct;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.categoryID = categoryID;
        this.colorID = colorID;
        this.nameColor = nameColor;
        this.codeColor = codeColor;
    }

    public ProductDto() {
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hightLight=" + hightLight +
                ", newProduct=" + newProduct +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", categoryID=" + categoryID +
                ", colorID=" + colorID +
                ", nameColor='" + nameColor + '\'' +
                ", codeColor='" + codeColor + '\'' +
                '}';
    }
}

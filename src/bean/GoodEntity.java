package bean;

/**
 * Created by lenovo on 2016/12/17.
 */
public class GoodEntity {
    private int goodId;
    private int shopId;
    private int typeId;
    private String name;
    private String brand;
    private int originalPrice;
    private int currentPrice;
    private String description;
    private int isRented;
    private int hitCount;
    private int onSaleTime;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIsRented() {
        return isRented;
    }

    public void setIsRented(int isRented) {
        this.isRented = isRented;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public int getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(int onSaleTime) {
        this.onSaleTime = onSaleTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodEntity that = (GoodEntity) o;

        if (goodId != that.goodId) return false;
        if (shopId != that.shopId) return false;
        if (typeId != that.typeId) return false;
        if (originalPrice != that.originalPrice) return false;
        if (currentPrice != that.currentPrice) return false;
        if (isRented != that.isRented) return false;
        if (hitCount != that.hitCount) return false;
        if (onSaleTime != that.onSaleTime) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodId;
        result = 31 * result + shopId;
        result = 31 * result + typeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + originalPrice;
        result = 31 * result + currentPrice;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + isRented;
        result = 31 * result + hitCount;
        result = 31 * result + onSaleTime;
        return result;
    }
}

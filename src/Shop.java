import java.util.ArrayList;
import java.util.List;

public class Shop {

    private int shopId;
    private String shopName;
    private String shopType;
    //private  ShopApplicationProduct product;
    public List<ShopProduct> productList=new ArrayList<>();

    public Shop() {
    }

    public Shop(int shopId, String shopName, String shopType, List<ShopProduct> productList) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopType = shopType;
        this.productList = productList;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public List<ShopProduct> getProductList() {
        return productList;
    }

    public void getProduct(ShopProduct p) {
        this.productList.add(p);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopType='" + shopType + '\'' +
                ", productList=" + productList +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

public class ShopApplicationBLClass {

    private static List<Shop> shopList=new ArrayList<>();
    static Shop s=new Shop();
    //=========================================================================================
    public void addShop(Shop s){
        shopList.add(s);
    }
    //=========================================================================================
    public void displayShop(){
        System.out.println("-----------------------------------------------------");
        for (Shop s:shopList){
            System.out.println("Shop Id="+s.getShopId()+"\t"+"Shop Name="+s.getShopName()+"\t"+"Shop Type="+s.getShopType());
        }
        System.out.println("-------------------------------------------------------");
    }
    //=========================================================================================
    public void displayProduct(){
        for (Shop s:shopList){
            System.out.println("Shop Name:"+s.getShopName()+"\t"+s.getProductList());
        }
    }
    //=========================================================================================
    public void removeProduct(String name,String product) {
        boolean status2=false;
        for (Shop s:shopList){
            for (int i=0;i<shopList.size();i++) {
                for (int j = 0; j < s.productList.size(); j++) {
                    if (shopList.get(i).getShopName().equalsIgnoreCase(name) && shopList.get(i).getProductList().get(j).getProductName().equalsIgnoreCase(product)) {
                        shopList.get(i).getProductList().remove(j);
                        System.out.println("ShopApplicationProduct Deleted Successfully");
                        System.out.println("----------------------------------");
                        status2=true;
                        break;
                    }
                }
            }
        }if (!status2){
            System.out.println("Invalid Choice");
        }
    }
    //=========================================================================================
    public void updateProduct(String sName,String pName,double price){
        boolean status2=false;
        for (Shop s:shopList){
            for (int i=0;i<shopList.size();i++) {
                for (int j = 0; j < s.productList.size(); j++) {
                    if (shopList.get(i).getShopName().equalsIgnoreCase(sName) && shopList.get(i).getProductList().get(j).getProductName().equalsIgnoreCase(pName)) {
                        shopList.get(i).getProductList().get(j).setProductPrice(price);
                        System.out.println("Price Updated Successfully");
                        System.out.println("----------------------------------");
                        status2=true;
                        break;
                    }
                }
            }
        }if (!status2){
            System.out.println("Invalid Choice");
        }
    }
}

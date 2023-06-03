import java.util.Scanner;

public class ShopMainApp {
    static Scanner sc1=new Scanner(System.in);

    static ShopApplicationBLClass b1=new ShopApplicationBLClass();
    public static void main(String[] args) {
        boolean status=true;
        do {
            System.out.println("1:Add Shop");
            System.out.println("2:Display Shop");
            System.out.println("3:Display ShopApplicationProduct In Shop");
            System.out.println("4:Remove ShopApplicationProduct From Shop");
            System.out.println("5:Update ShopApplicationProduct In Shop");
            System.out.println("6:Exit");
            int choice= sc1.nextInt();
            switch (choice){
                case  1:
                    addShop();
                    break;
                case 2:
                    displayShop();
                    break;
                case 3:
                    displayProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    updateProduct();
                    break;
                case 6:
                    status=false;
                    break;
                default:
                    System.out.println("Choose Valid Choice");
                    System.out.println("----------------------------");
            }
        }while (status);

    }
    //========================================================================================
    private static void updateProduct() {
        System.out.println("Enter Shop Name");
        String sName= sc1.next();
        System.out.println("Enter ShopApplicationProduct Name");
        String pName= sc1.next();
        System.out.println("Enter ShopApplicationProduct Price");
        double price= sc1.nextDouble();
        b1.updateProduct(sName,pName,price);
    }

    //========================================================================================
    private static void displayShop() {
        b1.displayShop();
    }


    //========================================================================================
    private static void addShop() {
        System.out.println("Enter Shop Id ");
        int id= sc1.nextInt();
        System.out.println("Enter Shop Name");
        String name= sc1.next();
        System.out.println("Enter Shop Type");
        String type= sc1.next();
        Shop s=new Shop();
        s.setShopId(id);
        s.setShopName(name);
        s.setShopType(type);
        boolean status=true;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1:Add ShopApplicationProduct Details");
            System.out.println("2:Save");
            int choice= sc1.nextInt();
            switch (choice){
                case 1:
                    s.getProduct(addProduct());
                    System.out.println("Detail Added Successfully");
                    break;
                case 2:
                    status=false;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (status);
        b1.addShop(s);
    }
    //===========================================================================================
    private static ShopProduct addProduct(){
        System.out.println("Enter ShopApplicationProduct Id");
        int id = sc1.nextInt();
        System.out.println("Enter ShopApplicationProduct Name");
        String name = sc1.next();
        System.out.println("Enter ShopApplicationProduct Price");
        double price = sc1.nextDouble();
        ShopProduct p=new ShopProduct(id,name,price);
        return p;
    }
    //=============================================================================================
    public static void displayProduct() {
        b1.displayProduct();
    }
    //=============================================================================================
    private static void removeProduct() {
        System.out.println("Enter Shop Name");
        String name= sc1.next();
        System.out.println("Enter ShopApplicationProduct Name");
        String product= sc1.next();
        b1.removeProduct(name,product);
    }
}

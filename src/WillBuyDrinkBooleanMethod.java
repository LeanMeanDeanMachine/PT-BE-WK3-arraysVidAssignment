public class WillBuyDrinkBooleanMethod {
    public static void main(String[] args) {
        boolean isHotOutside = true;
        double moneyInPocket = 43.34;
        boolean willBuy = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(willBuy);
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}

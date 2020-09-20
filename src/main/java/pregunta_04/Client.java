package pregunta_04;

import java.text.DecimalFormat;

public class Client {

    public static void main(String[] args) {
    	Sandwich smallBreadSandwich = new SmallBreadSandwich();
    	smallBreadSandwich = new Egg(smallBreadSandwich);
    	smallBreadSandwich = new Chicken(smallBreadSandwich);
    	smallBreadSandwich = new Beef(smallBreadSandwich);
    	smallBreadSandwich = new Bacon(smallBreadSandwich);
    	System.out.println(smallBreadSandwich.getDescription());
    	System.out.println(smallBreadSandwich.make());

    	Sandwich largeBreadSandwich = new LargeBreadSandwich();
    	System.out.println(largeBreadSandwich.getDescription());
    	System.out.println(largeBreadSandwich.make());
    }

    public static double round(double value) {
        DecimalFormat newFormat = new DecimalFormat("#.#");
        return Double.valueOf(newFormat.format(value));
    }
}

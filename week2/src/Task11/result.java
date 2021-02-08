package Task11;

import sun.plugin.javascript.navig.Link;

public class TestDemo {
    public static void main(String args[]) {
        PetShop shop = new PetShop() ;
        shop.add(new Cat("波斯猫",1));
        shop.add(new Cat("短尾猫",2));
        shop.add(new Dog("金毛",1));
        shop.add(new Cat("拉布拉多",1));
        Link all = shop.search("波") ；
        Object obj[] = all.toArray() ;
        for (int x = 0 ; x<obj.length ; x++) {
            System.out.println(obj[x]);
        }
    }
}
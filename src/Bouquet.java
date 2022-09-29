public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers){
        this.flowers = flowers;
    }

    public void printText(Bouquet bouquet){
        System.out.println("Букет простоит " + getExpiryDays() + " дней.");
        System.out.println("Букет стоит " + getCost() + " рублей.");
    }

    public void printInfo(Bouquet bouquet){
        for (int i= 0; i < flowers.length; i++) {
            System.out.println(flowers[i].getName());
        }
    }

    public int getExpiryDays(){
        int minlifeSpan = 10;
        for (int i= 0; i < flowers.length; i++) {
            if(flowers[i].getLifeSpan() <  minlifeSpan){
                minlifeSpan = flowers[i].getLifeSpan();
            }
        }
        return  minlifeSpan;
    }

    public double getCost(){
        double sum = 0;
        for (int i= 0; i < flowers.length; i++) {
            sum = sum + flowers[i].getCost();
        }
        sum = sum * 1.1;
        return sum;
    }
}

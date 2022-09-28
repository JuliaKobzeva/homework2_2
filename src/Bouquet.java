public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers){
        this.flowers = flowers;
    }

    public void printText(Bouquet bouquet){
        System.out.println("Букет простоит " + getExpiryDays() + " дней.");
        System.out.println("Букет стоит " + getCost() + " рублей.");
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
        return sum;
    }
}

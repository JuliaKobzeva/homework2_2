public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "", "Голандия", 35.59,3);
        Flower chrizantema = new Flower("Хризантема", "", "", 15.0, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gipsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrizantema);
        System.out.println(pion);
        System.out.println(gipsophila);

        Flower[] flowers = new Flower[9];
        flowers[0] = rose;
        flowers[1] = rose;
        flowers[2] = rose;
        flowers[3] = chrizantema;
        flowers[4] = chrizantema;
        flowers[5] = chrizantema;
        flowers[6] = chrizantema;
        flowers[7] = chrizantema;
        flowers[8] = gipsophila;

        Bouquet bouquet1 = new Bouquet(flowers);

        System.out.println("Букет простоит " + bouquet1.getExpiryDays() + " дней.");
        System.out.println("Букет стоит " + bouquet1.getCost() + " рублей.");
    }
}
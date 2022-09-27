public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "", "Голандия", 35.59,0);
        Flower chrizantema = new Flower("Хризантема", "", "", 15.0, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gipsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrizantema);
        System.out.println(pion);
        System.out.println(gipsophila);
    }
}
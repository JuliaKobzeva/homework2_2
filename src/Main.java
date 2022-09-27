public class Main {

    public static void main(String[] args) {
        Human maxim = new Human ("Максим", 1987, "Минск", "бренд-менеджера.", "м");
        Human anna = new Human ("Аня", 1993, "Москва", "методиста образовательных программ.", "ж");
        Human katya = new Human ("Катя", 1994, "Калининград", "продакт-менеджера.", "ж");
        Human artem = new Human ("Артем", 1995, "Москва", "директора по развитию бизнеса.", "м");
        Human vladimir = new Human ("Владимир", 2001, "Казань", " ", "м");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

    }
}
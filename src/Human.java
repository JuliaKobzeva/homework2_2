public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    private String job;
    private String gender;

    public Human(String name, int yearOfBirth, String town, String job, String gender){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public String getTown(){
        return town;
    }

    public String getJob(){
        return job;
    }

    @Override
    public String toString() {
        if (gender == "м") {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + " Будем знакомы!";
        } else
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в " + yearOfBirth + " году. Я работаю на должности " + job + " Будем знакомы!";
    }

}

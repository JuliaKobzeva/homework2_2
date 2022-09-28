public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    private String job;
    private String gender;

    public Human(String name, int yearOfBirth, String town, String job, String gender){
        if(name == null) {
            this.name = "Информация не указана";
        } else this.name = name;

        if(yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        } else this.yearOfBirth = Math.abs(yearOfBirth );

        if(town == null) {
        this.town = "Информация не указана";
        } else this.town = town;

        if(job == null || job.isEmpty() || job.isBlank()) {
            this.job = "Информация не указана";
        } else this.job = job;

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

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        } else{
            this.yearOfBirth = 0;
        }
    }

    public void setTown(String town) {
        if(town != null && !town.isEmpty() && !town.isBlank()){
            this.town = town;
        } else{
            this.town = "Информация не указана";
        }

    }

    @Override
    public String toString() {
        if (gender == "м") {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + " Будем знакомы!";
        } else
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в " + yearOfBirth + " году. Я работаю на должности " + job + " Будем знакомы!";
    }

}

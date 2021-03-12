public class Cricketer {

    public String Name = "";
    public String Country = "";
    public String Gender = "";
    public int Age = 0;

    public Cricketer() {

    }

    public static Cricketer CreateCricketer(String name, int age, String country, String gender) {
        Cricketer c = new Cricketer();
        c.Name = name;
        c.Age = age;
        c.Country = country;
        c.Gender = gender;
        return c;
    }
}

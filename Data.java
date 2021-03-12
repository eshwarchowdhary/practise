import java.util.ArrayList;

public class Data {

    public ArrayList<Cricketer> cricketers = new ArrayList<Cricketer>();

    public Data() {
        cricketers = new ArrayList<Cricketer>();

        // Indian Players
        cricketers.add(Cricketer.CreateCricketer("Yuvi", 38, "ind", "M"));
        cricketers.add(Cricketer.CreateCricketer("Dhoni", 38, "ind", "M"));
        cricketers.add(Cricketer.CreateCricketer("Kohli", 33, "ind", "M"));
        cricketers.add(Cricketer.CreateCricketer("Sachin", 41, "ind", "M"));
        cricketers.add(Cricketer.CreateCricketer("Sewagh", 40, "ind", "M"));
        cricketers.add(Cricketer.CreateCricketer("pandya", 30, "ind", "M"));

        // Australian Players
        cricketers.add(Cricketer.CreateCricketer("Hayden", 36, "aus", "M"));
        cricketers.add(Cricketer.CreateCricketer("Grilchrist", 41, "aus", "M"));
        cricketers.add(Cricketer.CreateCricketer("Ponting", 41, "aus", "M"));
        cricketers.add(Cricketer.CreateCricketer("Symonds", 36, "aus", "M"));
        cricketers.add(Cricketer.CreateCricketer("Maxwell", 34, "aus", "M"));
        cricketers.add(Cricketer.CreateCricketer("Watson", 35, "aus", "M"));
    }
}

package exercises;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneData 
{
    public PhoneData(String initFN, String initLN, String initPN) 
    {
        firstName = initFN;
        lastName = initLN;
        mobilePhone = initPN;
    }

    public String firstName; // Имя 
    public String lastName; // Фамилия
    public String address; // Адрес
    public String mobilePhone; // Номер телефона
    public String workPhone; // Номер рабочего телефона
    public Date bDate; // Дата рождения
    public Map<String, Objects> customParams = new HashMap<>(); // Дополнительные параметры
}

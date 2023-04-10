package tamirlan.bloated_person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class ChangePerson {

    private final String forenames;
    private final String surname;
    private LocalDate dayOfBirth;
    private Map<String, String> data = new HashMap<>(); // для данных об адресе

    private final String nationalInsuranceNumber;

    public ChangePerson(String forenames, String surname, LocalDate dayOfBirth, String nationalInsuranceNumber) {
        this.forenames = forenames;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public void addAddressData(int houseNumber, String address1, String address2, String postCode) {
        data.put("houseNumber", Integer.toString(houseNumber));
        data.put("address1", address1);
        data.put("address2", address2);
        data.put("postCode", postCode);
    }

    public Map<String, String> getData() {
        return data;
    }

    public boolean sameAddress(ChangePerson other) {
        return data.equals(other.getData());
    }

    public String getInitials() {
        final StringBuilder result = new StringBuilder();
        StringTokenizer strTok = new StringTokenizer(forenames);
        while (strTok.hasMoreTokens()) {
            result.append(strTok.nextToken().charAt(0));
        }
        return result.toString() + surname.charAt(0);
    }

    private boolean isLeapYear() {
        return ( ( (dayOfBirth.getYear() % 4 == 0 ) && ( dayOfBirth.getYear() % 100 != 0 ) ) || ( dayOfBirth.getYear() % 400 == 0 ) ); // високосный год не так проверяется
    }

    @Override
    public String toString() {
        return "ChangePerson{" +
                "forenames='" + forenames + '\'' +
                ", surname='" + surname + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", data=" + data +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }
}


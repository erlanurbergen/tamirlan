package tamirlan.bloated_person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ChangePerson {

    private final String forenames;
    private LocalDate dayOfBirth;
    private Map<String, String> data = new HashMap<>(); // для данных об адресе

    private final String nationalInsuranceNumber;

    public ChangePerson(String forenames, LocalDate dayOfBirth, String nationalInsuranceNumber) {
        this.forenames = forenames;
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

    private boolean isLeapYear() {
        return dayOfBirth.isLeapYear();
    }

    @Override
    public String toString() {
        return "ChangePerson{" +
                "forenames='" + forenames + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", data=" + data +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }
}


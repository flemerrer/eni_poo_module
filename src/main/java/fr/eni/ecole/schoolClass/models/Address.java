package fr.eni.ecole.schoolClass.models;

public class Address {

    private String additionalInfos;
    private int number;
    private String numberComplementaryInfos;
    private String street;
    private String postalCode;
    private String city;

    public Address() {}

    public Address(String additionalInfos, int number, String numberComplementaryInfos, String street, String postalCode, String city) {
        this.additionalInfos = additionalInfos;
        this.number = number;
        this.numberComplementaryInfos = numberComplementaryInfos;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return
                printAdditionalInfos() +
                getStreetDefinition() + '\n' +
                getCityDefinition()
                ;
    }

    private String printAdditionalInfos() {
        if (additionalInfos != null && !additionalInfos.isBlank()) {
            return getAdditionalInfos() + '\n';
        }
        return "";
    }

    public String getAdditionalInfos() {
        return additionalInfos;
    }

    public void setAdditionalInfos(String additionalInfos) {
        this.additionalInfos = additionalInfos;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumberComplementaryInfos() {
        return numberComplementaryInfos;
    }

    public void setNumberComplementaryInfos(String numberComplementaryInfos) {
        this.numberComplementaryInfos = numberComplementaryInfos;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city.toUpperCase();
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetDefinition() {
        return getNumber() + getNumberComplementaryInfos() + " " + getStreet();
    }

    public String getCityDefinition() {
        return getPostalCode() + " " + getCity();
    }

}

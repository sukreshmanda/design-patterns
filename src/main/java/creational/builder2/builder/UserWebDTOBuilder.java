package creational.builder2.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;

    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        Period period = Period.between(birthDay, LocalDate.now());
        this.age = Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    @Override
    public UserDTO build() throws Exception {
        if(address == null) throw new Exception("Address is not valid");
        if(firstName == null) throw new Exception("Name is partially build");
        if(lastName == null) throw new Exception("Name is partially build");
        if(age == null) throw new Exception("Age is not build");

        if(userWebDTO == null) userWebDTO = new UserWebDTO(firstName+lastName, address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUser() throws Exception {
        if(userWebDTO == null) throw new Exception("Builder is not build");
        return userWebDTO;
    }
}

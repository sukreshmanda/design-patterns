package creational.builder;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Getter
public class UserDTO {
    private String name;
    private String address;
    private String age;

    private UserDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userWebDTO;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withBirthDay(LocalDate birthDay) {
            Period period = Period.between(birthDay, LocalDate.now());
            this.age = Integer.toString(period.getYears());
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address.toString();
            return this;
        }

        public UserDTO build() throws Exception {
            if(address == null) throw new Exception("Address is not valid");
            if(firstName == null) throw new Exception("Name is partially build");
            if(lastName == null) throw new Exception("Name is partially build");
            if(age == null) throw new Exception("Age is not build");

            if(userWebDTO == null) userWebDTO = new UserDTO(firstName+lastName, address, age);
            return userWebDTO;
        }

        public UserDTO getUser() throws Exception {
            if(userWebDTO == null) throw new Exception("Builder is not build");
            return userWebDTO;
        }
    }
}

package creational.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthDay(LocalDate birthDay);
    UserDTOBuilder withAddress(Address address);
    UserDTO build() throws Exception;
    UserDTO getUser() throws Exception;
}

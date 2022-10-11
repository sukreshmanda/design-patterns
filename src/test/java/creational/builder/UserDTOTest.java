package creational.builder;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class UserDTOTest {

    @Test
    public void shouldReturnUserDTOWhenBuilderIsBuild() throws Exception {
        UserDTO user = UserDTO.builder()
                .withBirthDay(LocalDate.of(2001, 01, 25))
                .withAddress(new Address("2-144", "Bangalore", "", "524317", "Andhra Pradesh"))
                .withFirstName("Sukresh")
                .withLastName("Manda")
                .build();
        assertNotEquals(null, user);
    }

    @Test
    public void shouldThrowExceptionWhenBuildIsInComplete() {
        UserDTO.Builder builder = UserDTO.builder()
                .withBirthDay(LocalDate.of(2001, 01, 25))
                .withAddress(new Address("2-144", "Bangalore", "", "524317", "Andhra Pradesh"))
                .withLastName("Manda");
        assertThrows(Exception.class, builder::build);
    }
}

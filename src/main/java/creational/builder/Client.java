package creational.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) throws Exception {
        Address address = new Address("2-144", "Pedaputhedu", "Nellore", "524317", "Andhra Pradesh");
        User user = new User("sukresh", "manda", LocalDate.of(2001, 1, 25), address);

        UserDTO userDTO = UserDTO.builder()
                .withAddress(user.getAddress())
                .withBirthDay(user.getBirthday())
                .withLastName(user.getLastName())
                .withFirstName(user.getFirstName())
                .build();
        System.out.println(userDTO.getAddress());
    }
}

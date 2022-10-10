package creational.builder2.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserWebDTO implements UserDTO{
    private String name;
    private String address;
    private String age;
}

package creational.builder2.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipcode;
    private String state;

    @Override
    public String toString() {
        return houseNumber+", "+street+"\n"+city+"\n"+state+"\n"+zipcode;
    }
}

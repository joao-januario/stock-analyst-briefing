package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Price {

    @JsonProperty("d")
    private String date;

    @JsonProperty("p")
    private double price;

}

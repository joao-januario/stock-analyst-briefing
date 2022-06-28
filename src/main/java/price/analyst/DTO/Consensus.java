package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Consensus {

    @JsonProperty
    private double priceTarget;

    @JsonProperty
    private double high;

    @JsonProperty
    private double low;
}

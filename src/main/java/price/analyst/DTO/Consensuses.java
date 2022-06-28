package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Consensuses {

    @JsonProperty
    private int rating;

    @JsonProperty("nB")
    private int numberBuys;

    @JsonProperty("nH")
    private int numberHolds;

    @JsonProperty("nS")
    private int numberSell;
}

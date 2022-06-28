package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StockInfo {

    @JsonProperty
    private String sectorName;

    private Overview overview;
}

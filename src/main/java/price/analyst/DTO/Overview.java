package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Overview {

    @JsonProperty
    private String ticker;

    @JsonProperty
    private String companyFullName;

    @JsonProperty
    private Integer numOfAnalysts;

    @JsonProperty
    private double yearlyDividend;

    @JsonProperty
    //Latest entry in the list is the most recent price
    private List<Price> prices;

    @JsonProperty
    private List<Consensuses> consensuses;

    @JsonProperty
    private List<Consensus> ptConsensus;
}

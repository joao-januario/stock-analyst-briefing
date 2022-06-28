package price.analyst.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockInfoResponse {

    @JsonProperty
    private double lastPrice;

    @JsonProperty
    private double priceTarget;

    @JsonProperty
    private double high;

    @JsonProperty
    private double low;

    @JsonProperty
    private double buyRecommendations;

    @JsonProperty
    private double holdRecommendations;

    @JsonProperty
    private double sellRecommendations;

    @JsonProperty
    private double yearlyDividend;

    //PERCENTAGES
    @JsonProperty
    private double highUpside;

    @JsonProperty
    private double averageUpside;

    @JsonProperty
    private double lowUpside;
}

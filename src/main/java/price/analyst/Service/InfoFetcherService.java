package price.analyst.Service;

import price.analyst.DTO.StockInfo;
import price.analyst.DTO.StockInfoResponse;

import java.util.List;

public interface InfoFetcherService {

    StockInfoResponse getInfoForTicker(String ticker);

    List<StockInfoResponse> getInfoForTickers(List<String> tickers);
}

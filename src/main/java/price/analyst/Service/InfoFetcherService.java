package price.analyst.Service;

import price.analyst.DTO.StockInfo;
import price.analyst.DTO.StockInfoResponse;

public interface InfoFetcherService {

    StockInfoResponse getInfoForTicker(String ticker);
}

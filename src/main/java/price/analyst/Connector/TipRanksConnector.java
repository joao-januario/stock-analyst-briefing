package price.analyst.Connector;

import price.analyst.DTO.StockInfo;

public interface TipRanksConnector {

    StockInfo getDataForTicker(String ticker);

}

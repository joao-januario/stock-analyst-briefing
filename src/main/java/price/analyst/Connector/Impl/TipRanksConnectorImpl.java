package price.analyst.Connector.Impl;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import price.analyst.Connector.TipRanksConnector;
import price.analyst.DTO.StockInfo;

@Component
public class TipRanksConnectorImpl implements TipRanksConnector {

    String baseUrl="https://widgets.tipranks.com/api/etoro/dataForTicker?ticker=";

    @Override
    public StockInfo getDataForTicker(String ticker) {
        String urlString = baseUrl+ticker;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(urlString, StockInfo.class).getBody();
    }

    @Async
    public StockInfo getDataForTickerAsync(String ticker){
        return getDataForTicker(ticker);
    }
}

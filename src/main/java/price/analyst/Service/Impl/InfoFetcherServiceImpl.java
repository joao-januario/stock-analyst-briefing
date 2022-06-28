package price.analyst.Service.Impl;

import org.springframework.stereotype.Service;
import price.analyst.Connector.TipRanksConnector;
import price.analyst.DTO.StockInfo;
import price.analyst.DTO.StockInfoResponse;
import price.analyst.Service.InfoFetcherService;

@Service
public class InfoFetcherServiceImpl implements InfoFetcherService {

    private final TipRanksConnector tipRanksConnector;

    public InfoFetcherServiceImpl(final TipRanksConnector tipRanksConnector){
        this.tipRanksConnector = tipRanksConnector;
    }

    @Override
    public StockInfoResponse getInfoForTicker(String ticker) {
        StockInfo stockInfo = tipRanksConnector.getDataForTicker(ticker);
        double lastPrice = stockInfo.getOverview().getPrices().get(stockInfo.getOverview().getPrices().size()-1).getPrice();
        return StockInfoResponse
                .builder()
                .high(stockInfo.getOverview().getPtConsensus().get(0).getHigh())
                .low(stockInfo.getOverview().getPtConsensus().get(0).getLow())
                .lastPrice(lastPrice)
                .priceTarget(stockInfo.getOverview().getPtConsensus().get(0).getPriceTarget())
                .buyRecommendations(stockInfo.getOverview().getConsensuses().get(0).getNumberBuys())
                .sellRecommendations(stockInfo.getOverview().getConsensuses().get(0).getNumberSell())
                .holdRecommendations(stockInfo.getOverview().getConsensuses().get(0).getNumberHolds())
                .yearlyDividend(stockInfo.getOverview().getYearlyDividend())
                .highUpside(((stockInfo.getOverview().getPtConsensus().get(0).getHigh()-lastPrice)/lastPrice)*100)
                .averageUpside(((stockInfo.getOverview().getPtConsensus().get(0).getPriceTarget()-lastPrice)/lastPrice)*100)
                .lowUpside(((stockInfo.getOverview().getPtConsensus().get(0).getLow()-lastPrice)/lastPrice)*100)
                .build();
    }
}

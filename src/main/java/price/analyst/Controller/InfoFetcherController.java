package price.analyst.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import price.analyst.DTO.StockInfo;
import price.analyst.DTO.StockInfoResponse;
import price.analyst.Service.InfoFetcherService;

import java.util.List;

@RestController
public class InfoFetcherController {

    InfoFetcherService infoFetcherService;

    public InfoFetcherController (final InfoFetcherService infoFetcherService){
        this.infoFetcherService = infoFetcherService;
    }

    @GetMapping("/v1/getInfoForTicker")
    public StockInfoResponse getInfoForTicker(@RequestParam final String ticker){
        return infoFetcherService.getInfoForTicker(ticker);
    }

    @GetMapping("/v1/getInfoForTickers")
    public List<StockInfoResponse> getInfoForTicker(@RequestParam final List<String> tickers){
        return infoFetcherService.getInfoForTickers(tickers);
    }
}

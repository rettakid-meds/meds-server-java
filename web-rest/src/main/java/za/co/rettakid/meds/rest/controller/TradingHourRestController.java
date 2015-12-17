package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/tradingHours")
public class TradingHourRestController {

    @Autowired
    private TradingHourService tradingHourService;
    
    @RequestMapping(method = RequestMethod.GET)
    public TradingHourListDto getTradingHours()   {
        return tradingHourService.getTradingHours();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public TradingHourDto getTradingHours(@PathVariable("id") Long id)   {
        return tradingHourService.getTradingHours(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public TradingHourDto postTradingHours(@RequestBody TradingHourDto tradingHourDto)   {
        return tradingHourService.postTradingHours(tradingHourDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putTradingHours(@PathVariable("id") Long id,@RequestBody TradingHourDto tradingHourDto)   {
        tradingHourService.putTradingHours(tradingHourDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteTradingHours(@PathVariable("id") Long id)   {
        tradingHourService.deleteTradingHours(id);
    }

}
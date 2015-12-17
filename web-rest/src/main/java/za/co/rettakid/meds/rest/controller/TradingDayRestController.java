package za.co.rettakid.meds.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;

@RestController
@RequestMapping("/tradingDays")
public class TradingDayRestController {

    @Autowired
    private TradingDayService tradingDayService;
    
    @RequestMapping(method = RequestMethod.GET)
    public TradingDayListDto getTradingDays()   {
        return tradingDayService.getTradingDays();
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public TradingDayDto getTradingDays(@PathVariable("id") Long id)   {
        return tradingDayService.getTradingDays(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public TradingDayDto postTradingDays(@RequestBody TradingDayDto tradingDayDto)   {
        return tradingDayService.postTradingDays(tradingDayDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public void putTradingDays(@PathVariable("id") Long id,@RequestBody TradingDayDto tradingDayDto)   {
        tradingDayService.putTradingDays(tradingDayDto);
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteTradingDays(@PathVariable("id") Long id)   {
        tradingDayService.deleteTradingDays(id);
    }

}
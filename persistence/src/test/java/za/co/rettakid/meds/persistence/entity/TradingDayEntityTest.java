package za.co.rettakid.meds.persistence.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/persistence-context-test.xml"})
@Transactional
public class TradingDayEntityTest {

    private TradingDayEntity tradingDayEntity = new TradingDayEntity();


    @Test
    public void testGetTradingDayId() throws Exception {
        Long expected = 512L;
        tradingDayEntity.setTradingDayId(expected);
        Assert.assertEquals(expected,tradingDayEntity.getTradingDayId());
    }

    @Test
    public void testSetTradingDayId() throws Exception {
        Long expected = 512L;
        tradingDayEntity.setTradingDayId(expected);
        Assert.assertEquals(expected,tradingDayEntity.getTradingDayId());
    }


    @Test
    public void testGetMonday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setMonday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getMonday());
    }

    @Test
    public void testSetMonday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setMonday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getMonday());
    }


    @Test
    public void testGetTuesday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setTuesday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getTuesday());
    }

    @Test
    public void testSetTuesday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setTuesday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getTuesday());
    }


    @Test
    public void testGetWednesday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setWednesday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getWednesday());
    }

    @Test
    public void testSetWednesday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setWednesday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getWednesday());
    }


    @Test
    public void testGetThursday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setThursday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getThursday());
    }

    @Test
    public void testSetThursday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setThursday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getThursday());
    }


    @Test
    public void testGetFriday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setFriday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getFriday());
    }

    @Test
    public void testSetFriday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setFriday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getFriday());
    }


    @Test
    public void testGetSaturday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setSaturday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getSaturday());
    }

    @Test
    public void testSetSaturday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setSaturday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getSaturday());
    }


    @Test
    public void testGetSunday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setSunday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getSunday());
    }

    @Test
    public void testSetSunday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setSunday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getSunday());
    }


    @Test
    public void testGetPubicHoliday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setPubicHoliday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getPubicHoliday());
    }

    @Test
    public void testSetPubicHoliday() throws Exception {
        TradingHourEntity expected = new TradingHourEntity();
        tradingDayEntity.setPubicHoliday(expected);
        Assert.assertEquals(expected,tradingDayEntity.getPubicHoliday());
    }



    @Test
    public void testGetPracticeTradingDays() throws Exception {
        tradingDayEntity.setPracticeTradingDays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingDayEntity.getPracticeTradingDays());
    }

    @Test
    public void testSetPracticeTradingDays() throws Exception {
        tradingDayEntity.setPracticeTradingDays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingDayEntity.getPracticeTradingDays());
    }


    @Test
    public void testGetDoctorTradingDays() throws Exception {
        tradingDayEntity.setDoctorTradingDays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingDayEntity.getDoctorTradingDays());
    }

    @Test
    public void testSetDoctorTradingDays() throws Exception {
        tradingDayEntity.setDoctorTradingDays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingDayEntity.getDoctorTradingDays());
    }


}
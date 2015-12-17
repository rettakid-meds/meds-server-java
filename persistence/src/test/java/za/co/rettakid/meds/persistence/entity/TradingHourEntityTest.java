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
public class TradingHourEntityTest {

    private TradingHourEntity tradingHourEntity = new TradingHourEntity();


    @Test
    public void testGetTradingHourId() throws Exception {
        Long expected = 512L;
        tradingHourEntity.setTradingHourId(expected);
        Assert.assertEquals(expected,tradingHourEntity.getTradingHourId());
    }

    @Test
    public void testSetTradingHourId() throws Exception {
        Long expected = 512L;
        tradingHourEntity.setTradingHourId(expected);
        Assert.assertEquals(expected,tradingHourEntity.getTradingHourId());
    }


    @Test
    public void testGetEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getEffFrm());
    }

    @Test
    public void testSetEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getEffFrm());
    }


    @Test
    public void testGetEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getEffTo());
    }

    @Test
    public void testSetEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getEffTo());
    }


    @Test
    public void testGetBreakAEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakAEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakAEffFrm());
    }

    @Test
    public void testSetBreakAEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakAEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakAEffFrm());
    }


    @Test
    public void testGetBreakAEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakAEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakAEffTo());
    }

    @Test
    public void testSetBreakAEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakAEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakAEffTo());
    }


    @Test
    public void testGetBreakBEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakBEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakBEffFrm());
    }

    @Test
    public void testSetBreakBEffFrm() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakBEffFrm(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakBEffFrm());
    }


    @Test
    public void testGetBreakBEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakBEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakBEffTo());
    }

    @Test
    public void testSetBreakBEffTo() throws Exception {
        Date expected = new Date();
        tradingHourEntity.setBreakBEffTo(expected);
        Assert.assertEquals(expected,tradingHourEntity.getBreakBEffTo());
    }


    @Test
    public void testGetOpen() throws Exception {
        Boolean expected = false;
        tradingHourEntity.setOpen(expected);
        Assert.assertEquals(expected,tradingHourEntity.getOpen());
    }

    @Test
    public void testSetOpen() throws Exception {
        Boolean expected = false;
        tradingHourEntity.setOpen(expected);
        Assert.assertEquals(expected,tradingHourEntity.getOpen());
    }



    @Test
    public void testGetTradingDayMondays() throws Exception {
        tradingHourEntity.setTradingDayMondays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayMondays());
    }

    @Test
    public void testSetTradingDayMondays() throws Exception {
        tradingHourEntity.setTradingDayMondays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayMondays());
    }


    @Test
    public void testGetTradingDayTuesdays() throws Exception {
        tradingHourEntity.setTradingDayTuesdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayTuesdays());
    }

    @Test
    public void testSetTradingDayTuesdays() throws Exception {
        tradingHourEntity.setTradingDayTuesdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayTuesdays());
    }


    @Test
    public void testGetTradingDayWednesdays() throws Exception {
        tradingHourEntity.setTradingDayWednesdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayWednesdays());
    }

    @Test
    public void testSetTradingDayWednesdays() throws Exception {
        tradingHourEntity.setTradingDayWednesdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayWednesdays());
    }


    @Test
    public void testGetTradingDayThursdays() throws Exception {
        tradingHourEntity.setTradingDayThursdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayThursdays());
    }

    @Test
    public void testSetTradingDayThursdays() throws Exception {
        tradingHourEntity.setTradingDayThursdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayThursdays());
    }


    @Test
    public void testGetTradingDayFridays() throws Exception {
        tradingHourEntity.setTradingDayFridays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayFridays());
    }

    @Test
    public void testSetTradingDayFridays() throws Exception {
        tradingHourEntity.setTradingDayFridays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayFridays());
    }


    @Test
    public void testGetTradingDaySaturdays() throws Exception {
        tradingHourEntity.setTradingDaySaturdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDaySaturdays());
    }

    @Test
    public void testSetTradingDaySaturdays() throws Exception {
        tradingHourEntity.setTradingDaySaturdays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDaySaturdays());
    }


    @Test
    public void testGetTradingDaySundays() throws Exception {
        tradingHourEntity.setTradingDaySundays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDaySundays());
    }

    @Test
    public void testSetTradingDaySundays() throws Exception {
        tradingHourEntity.setTradingDaySundays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDaySundays());
    }


    @Test
    public void testGetTradingDayPubicHolidays() throws Exception {
        tradingHourEntity.setTradingDayPubicHolidays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayPubicHolidays());
    }

    @Test
    public void testSetTradingDayPubicHolidays() throws Exception {
        tradingHourEntity.setTradingDayPubicHolidays(new ArrayList());
        Assert.assertEquals(new ArrayList(),tradingHourEntity.getTradingDayPubicHolidays());
    }


}

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author msi
 */
public class Ticket {

    private int id;
    private Period period;
    private Slot slot;
    private String name;
    private Date buyTime;

    public Ticket() {
    }

    public Ticket(int id, Period period, Slot slot, String name, Date buyTime) {
        this.id = id;
        this.period = period;
        this.slot = slot;
        this.name = name;
        this.buyTime = buyTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

}

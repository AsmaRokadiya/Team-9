/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team9;

import java.util.*;
/**
 *
 * @author 1895324
 */
public class order {
 
    Date date;
    String number;
    
    public order(String num,Date date1)
    {
    
        this.number = num;
        this.date = date1;
    
    }
    
    public Date getDate()
    {
    
        return date;
    
    }
    
    public String getnumber()
    {
    
        return number;
    
    }
    
    public void setDate(Date date1)
    {
    
        Date date = date1;
    
    }
}

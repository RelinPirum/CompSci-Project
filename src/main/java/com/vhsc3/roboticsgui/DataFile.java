/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vhsc3.roboticsgui;

import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class DataFile implements Serializable{
    
    public DefaultTableModel softT;
    public DefaultTableModel hardT;
    public DefaultTableModel marT;
    public DataFile(){
        
    }
    public DataFile(DefaultTableModel softT, DefaultTableModel hardT, DefaultTableModel marT){
        this.softT = softT;
        this.hardT = hardT;
        this.marT = marT;
    }
    
    public DefaultTableModel getSW(){
        return softT;
    }
    public DefaultTableModel getHW(){
        return hardT;
    }
    public DefaultTableModel getMK(){
        return marT;
    }
}

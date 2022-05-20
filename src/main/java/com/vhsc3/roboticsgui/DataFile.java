/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vhsc3.roboticsgui;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class DataFile implements Serializable{
    
    public ArrayList<String> softT;
    public ArrayList<String> hardT;
    public ArrayList<String> marT;
    public String[][] tools;
    public String[][] parts;

    public DataFile(ArrayList<String> softT, ArrayList<String> hardT, ArrayList<String> marT, String[][] tools, String[][]parts){
        this.softT = softT;
        this.hardT = hardT;
        this.marT = marT;
        this.tools = tools;
        this.parts = parts;
    }
    
    public ArrayList<String> getSW(){
        return softT;
    }
    public ArrayList<String> getHW(){
        return hardT;
    }
    public ArrayList<String> getMK(){
        return marT;
    }
    public String[][] getTool(){
        return tools;
    }
    public String[][] getParts(){
        return parts;
    }
}

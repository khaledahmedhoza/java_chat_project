/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import client.ClientInt;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author start
 */
public interface ChatServerInt extends Remote {
    /*kol el mesthods fel interface heya public static finaly ya3ny 
     lma 23mlha implment lazem teb2a public*/   
    void sigupData_Int(String name,String email,String username,String password,String country,String gender)throws RemoteException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author start
 */
public interface ClientInt extends Remote{
    
    void receiveFromFriend(String message,int fid) throws RemoteException;
    void receiveFromGroup(String message,int gid) throws RemoteException;
    void receiveAnnouncement(String announce) throws RemoteException;
    void receiveNotification(String notification) throws RemoteException;
    void refreshPage()throws RemoteException;
    
}

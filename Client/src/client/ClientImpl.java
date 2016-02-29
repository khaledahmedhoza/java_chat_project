/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author start
 */
public class ClientImpl extends UnicastRemoteObject implements ClientInt {

    Client c ;
    public ClientImpl(Client c) throws RemoteException {
        this.c = c;
    }

    public void receiveFromFriend(String message,int fid) {}
    public void receiveFromGroup(String message,int gid) {}
    public void receiveAnnouncement(String announce) {}
    public void receiveNotification(String notification) {}
    public void refreshPage() {}

}

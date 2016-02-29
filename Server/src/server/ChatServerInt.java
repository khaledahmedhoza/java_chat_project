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
    int sigupData_Int(String name,String email,String username,String password,String country,String gender)throws RemoteException;
    
    boolean siginData_Int(String name,String password)throws RemoteException;
    
    String [][] loadContactList(int id)throws RemoteException;//return array 2d (name,fid,image,status)
    
    String [][] loadGroup(int id)throws RemoteException;// return array 2d (gid,gname, string of names)
    
    String [] loadProfile(int id)throws RemoteException; // return array (name,image,status)
    
    void changeStatus(int id,String status)throws RemoteException; 
    
    void editProfile(String colName,String colValue)throws RemoteException; 
    
    void logout(int id)throws RemoteException; 
    
    void sendMessageToFriend(int fid,String message)throws RemoteException; 
    
    void sendMessageToGroup(int gid,String message)throws RemoteException; 
    
    String[] addFriend(String mail)throws RemoteException;//  return (name,id,image,status)
    
    String [] createGroup(String gName,String friendIDs)throws RemoteException;// return array (gid,gname, string of names)
    
    //void unfriend(id);
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import client.ClientInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author start
 */
public class ChatserverImpl extends UnicastRemoteObject implements ChatServerInt {

    //public static Vector<ClientInt> clientVector = new Vector<ClientInt>();

    public ChatserverImpl() throws RemoteException {

    }

    ;
    
    public  void sigupData_Int(String name,String email,String username,String password,String country,String gender)
    {
         String q = "insert into users (name,email,username,password,gender,country,status) values ('"+name+"','"+email+"','"+username+"',"+password.hashCode()+",'"+gender+"','"+country+"','Busy')";
                
                   database dd = database.getdbcon();
                   try{
                   int  rs = dd.insert(q) ;
                   
                    }catch(Exception e){
                        e.printStackTrace();
                    }
        System.out.println(name+" "+email+" "+username+" "+password+" "+country+" "+gender);
    }

    

}

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
    
    public  int sigupData_Int(String name,String email,String username,String password,String country,String gender)
    {
        String q = "insert into users (name,email,username,password,gender,country,status) values ('"+name+"','"+email+"','"+username+"',"+password.hashCode()+",'"+gender+"','"+country+"','Busy')";     
        database dd = database.getdbcon();
        try{
        int  rs = dd.insert(q) ;
        return dd.getLastid();

        }catch(Exception e){
            //e.printStackTrace();
            return 0;
        }
       // System.out.println(name+" "+email+" "+username+" "+password+" "+country+" "+gender);
    }
    public boolean siginData_Int(String email,String password)
    {
        String q = "select password from users where email="+email;
                
        database dd = database.getdbcon();
        try{
            return dd.query(q).getString("password").equals(password.hashCode());
        }catch(Exception e){
            //e.printStackTrace();
            return false;
        }

    }
    public String [][] loadContactList(int id){
        String [][] result = null;
        return result;
    }
    public String [][] loadGroup(int id){
        String [][] result = null;
        return result;
    }
    public String [] loadProfile(int id){
        String [] result = null;
        return result;
    }
    public void changeStatus(int id,String status){
    }
    public void editProfile(String colName,String colValue){
    }
    public void logout(int id){
    }
    public void sendMessageToFriend(int fid,String message){
    }
    public void sendMessageToGroup(int gid,String message){
    }
    public String[] addFriend(String mail){
        String [] result = null;
        return result;
    }
    public String [] createGroup(String gName,String friendIDs){
        String [] result = null;
        return result;
    }
}

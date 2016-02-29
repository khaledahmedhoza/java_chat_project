/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.ChatServerInt;

/**
 *
 * @author start
 */
public class Client {

    ChatServerInt serverRef;
    ClientInt clientRef;
    SignUp signUp;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        try {
            clientRef = new ClientImpl(this);
            signUp=new SignUp(this);
            signUp.setVisible(true);
           // clientGui.setVisible(true);
            Registry reg = LocateRegistry.getRegistry();
            serverRef = (ChatServerInt) reg.lookup("ChatRoom");
           

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    void sigupData(String name,String email,String username,String password,String country,String gender) {
        try {
            serverRef.sigupData(name,email,username,password,country,gender);
            signUp.setVisible(false);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    }


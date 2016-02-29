/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author start
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Server();
    }
    
    public Server(){
        
        try
        {
          ChatserverImpl obj = new ChatserverImpl();
          Registry reg = LocateRegistry.createRegistry(1099);
          reg.rebind("ChatRoom",obj);
          
//          obj.register(ClientInt clientRef);
        
        }catch(RemoteException ex){
            ex.printStackTrace();
            
        }
    }
    
}

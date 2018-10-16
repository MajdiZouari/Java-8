package com.sdz.executor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
*
*serveur multi-threads qui va traiter les connexions entrantes dans un thread différent
*
* */
public class ServerLauncher {
    public static void main(String[] args){
        //On se sert d'un pool de thread pour limiter le nombre de threads en mémoire
        final ExecutorService service = Executors.newFixedThreadPool(100);
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10000);
            int i = 0;
            while (true) {
                try {
                    final Socket socket = serverSocket.accept();
                    //On traite la requète via notre executor
                    service.execute(new Runnable(){
                        @Override
                        public void run() {
                            traitementRequete(socket);
                        }
                    });
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                serverSocket.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void traitementRequete(Socket socket){
        System.out.println("socket");
    }
}

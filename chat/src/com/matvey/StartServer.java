package com.matvey;


import com.matvey.filters.NoRacismFilter;
import com.matvey.filters.PoliteSpeechFilter;
import com.matvey.server.Server;

public class StartServer {

    public static final String SERVER_HOST = "localhost"; //127.0.0.1
    public static final int SERVER_PORT = 9933;
    public static final String DB_NAME = "chat.db";

    public static void main(String[] args) {
        Server server = new Server(SERVER_PORT, DB_NAME);
        //чтобы основной поток не "замирал" в этом месте

        new Thread(server::waitForClient).start();
        server.addFilter(new PoliteSpeechFilter());
        server.addFilter(new NoRacismFilter());
        //и т.д. - по ходу программы можем добавлять новые фильтры
    }
}
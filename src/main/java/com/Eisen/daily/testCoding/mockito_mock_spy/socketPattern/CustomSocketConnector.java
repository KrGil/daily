package com.Eisen.daily.testCoding.mockito_mock_spy.socketPattern;

import java.io.IOException;
import java.nio.charset.Charset;

public class CustomSocketConnector {
    SocketConnector connector;

    public CustomSocketConnector connect(String hostName, int port) throws IOException {
        this.connector = new SocketConnector(hostName, port);
        return this;
    }

    public void send(String message) throws IOException {
        connector.send(message);
    }

    public String receive() throws IOException {
        return connector.receiveLine();
    }

    public void close() throws IOException {
        connector.close();
    }
}

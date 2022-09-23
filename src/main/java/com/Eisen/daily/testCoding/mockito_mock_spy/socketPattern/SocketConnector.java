package com.Eisen.daily.testCoding.mockito_mock_spy.socketPattern;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;

@Slf4j
public class SocketConnector {
    Socket socket;
    BufferedWriter bw;
    BufferedReader br;

    public SocketConnector(String hostName, int port) throws IOException {
        this.init(hostName, port, null, null);
    }

    private void init(String hostName, int port, Charset read, Charset write) throws IOException{
        SocketAddress socketAddress = new InetSocketAddress(hostName, port);
        this.socket = new Socket();
        this.socket.connect(socketAddress, 1);
        this.socket.setSoTimeout(10000);
        if (write != null) {
            this.bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream(), write));
        } else {
            this.bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
        }

        if (read != null) {
            this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), read));
        } else {
            this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        }
    }
    public void close() throws IOException{
        if (this.bw != null) {
            this.bw.close();
        }

        if (this.br != null) {
            this.br.close();
        }

        if (this.socket != null) {
            this.socket.close();
        }
    };
    public void send(String message) throws IOException {
        this.bw.write(message);
        this.bw.flush();
    }
    public String receiveLine() throws IOException {
        return this.br.readLine();
    }

}

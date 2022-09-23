package com.Eisen.daily.testCoding.mockito_mock_spy.socketPattern;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class MailService {
    public String afterConnection(String msg, String ip, int portNo){

        ResponseDto response = connectWithYou(msg, ip, portNo);

        return response.message;
    }
    public ResponseDto connectWithYou(String msg, String ip, int portNo){
        String receivedMsg = "";
//        SocketConnector connector = null;
//        try {
//            connector = new SocketConnector(ip, portNo);
//            connector.send(msg);
//            receivedMsg = connector.receiveLine();
//            connector.close();
//        } catch (IOException e) {
//            log.debug(ExceptionUtils.getStackTrace(e));
//            throw new RuntimeException(e);
//        }
        CustomSocketConnector connector = new CustomSocketConnector();
        try {
            connector.connect(ip, portNo);
            connector.send(msg);
            receivedMsg = connector.receive();
            connector.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(new ResponseDto(msg, receivedMsg))
            .orElseThrow(() -> new RuntimeException());
    }
}

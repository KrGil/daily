package com.Eisen.daily.testCoding.mockito_mock_spy.socketPattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.Socket;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MailServiceTest {

    @Mock
    SocketConnector socketConnector;

    @Mock
    CustomSocketConnector customSocketConnector;
    @InjectMocks
    MailService mailService;


    @Test
    void connection_테스트() throws IOException {
        /* given */
        String ip = "localhost";
        int port = 8080;
        String msg = "연결테스트!!";
        String receivedMsg = "returnMsg";
        ResponseDto dto = generateResponseDto(msg, receivedMsg);
        given(customSocketConnector.connect(ip, port)).willReturn(new CustomSocketConnector());
        /* when */
        mailService.afterConnection(msg, ip, port);

        /* then */
        assertEquals(mailService.afterConnection(msg,ip,port), msg);
    }

//    @Mock
//    SocketConnector socketConnector;
//    @InjectMocks
//    MailService mailService;
//
//    @Test
//    void connection_테스트() throws IOException {
//        /* given */
//        String ip = "localhost";
//        int port = 8080;
//        String msg = "연결테스트!!";
//        String receivedMsg = "returnMsg";
//        ResponseDto dto = generateResponseDto(msg, receivedMsg);
//        given(socketConnector.receiveLine()).willReturn(receivedMsg);
//        /* when */
//        mailService.afterConnection(msg, ip, port);
//
//        /* then */
//        assertEquals(mailService.afterConnection(msg,ip,port), msg);
//    }

    private ResponseDto generateResponseDto(String msg, String receivedMsg) {
        return new ResponseDto(msg, receivedMsg);
    }
}
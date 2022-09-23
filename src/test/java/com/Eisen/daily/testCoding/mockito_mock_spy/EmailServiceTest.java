package com.Eisen.daily.testCoding.mockito_mock_spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {
    private final String testEmail = "user@mail.com";
    private final String success = "SUCCESS";

    @Mock
    EmailService emailService;
    @Spy
    EmailService emailServiceSpy;



    @Test
    @Description("When mock is called, we can return any response we like")
    public void simpleTest1() {
        when(emailService.sendMail(testEmail)).thenReturn(success);
        assertEquals(success, emailService.sendMail(testEmail));
    }

    @Test
    @Description("When mock is called but not stubbed, we receive a null value")
    public void simpleTest2() {
        assertNull(emailService.sendMail(testEmail));
    }

    @Test
    @Description("When spy is called but not stubbed, the concrete impl is called")
    public void simpleTest3() {
        assertTrue(emailServiceSpy.sendMail(testEmail).contains(testEmail));
    }

    @Test
    @Description("When spy is called and stubbed, stubbed value is returned")
    public void simpleTest4() {
        when(emailServiceSpy.sendMail(testEmail)).thenReturn(success);
        assertEquals(success, emailServiceSpy.sendMail(testEmail));
    }
}
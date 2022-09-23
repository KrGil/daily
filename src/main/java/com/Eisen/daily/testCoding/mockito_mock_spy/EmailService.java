package com.Eisen.daily.testCoding.mockito_mock_spy;

public class EmailService {
    public String sendMail(String email) {
        return String.format("Email successfully send to %s", email);
    }
}

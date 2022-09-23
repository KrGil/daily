package com.Eisen.daily.testCoding.mockito_mock_spy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ElectionOfYear20XXTest {
//    @Mock
//    VotersOfBelow21 votersOfBelow21;
//
//    @Mock
//    VotersOfAbove21 votersOfAbove21;

    @Spy
    VotersOfBelow21 votersOfBelow21;

    @Spy
    VotersOfAbove21 votersOfAbove21;


    @InjectMocks
    ElectionOfYear20XX electionOfYear20XX;

    @Test
    @DisplayName("Mock test")
    public void testElectionResults() {
        Assertions.assertEquals(true, electionOfYear20XX.weElected("No Choice"));

    }

}
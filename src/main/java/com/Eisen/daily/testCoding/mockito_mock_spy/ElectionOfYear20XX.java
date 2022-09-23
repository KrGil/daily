package com.Eisen.daily.testCoding.mockito_mock_spy;

public class ElectionOfYear20XX {
    VotersOfAbove21 votersOfAbove21;
    VotersOfBelow21 votersOfBelow21;

    public boolean weElected(String weElectedTrump) {
        votersOfAbove21.weElected(weElectedTrump);
        System.out.println("We elected President Trump");

        votersOfBelow21.weElected(weElectedTrump);
        System.out.println("we elected President Trump");
        return true;
    }
}

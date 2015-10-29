package iad1.concensus2.voters;

import itest.consensus.Voter;

public class TrueVoter implements Voter {
    @Override
    public boolean vote() {
        return true;
    }
}

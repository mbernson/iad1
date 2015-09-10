package itest.consensus.impl;

import itest.consensus.Concensus;
import itest.consensus.Voter;

import java.util.ArrayList;

public class ConcensusImpl implements Concensus {
    @Override
    public boolean voting(ArrayList<Voter> voters) {
        for(final Voter v : voters) {
            if(null == v)
                continue;

            if(false == v.vote())
                return false;
        }
        return true;
    }
}

package iad1.concensus2;

import itest.consensus.Concensus;
import itest.consensus.Voter;

import java.util.ArrayList;

public class ConcensusImpl implements Concensus {
    private ArrayList<Integer> thingsThatHaveVoted = new ArrayList<>();

    @Override
    public boolean voting(ArrayList<Voter> voters) {
        if(voters == null || voters.isEmpty())
            throw new RuntimeException("Empty voters list!");

        boolean result = true;

        for(Voter voter : voters) {
            if(voter == null) {
                continue;
            }
            if(thingsThatHaveVoted.contains(voter.hashCode())) {
                continue;
            }
            if(false == voter.vote()) {
                result = false;
            }
            thingsThatHaveVoted.add(voter.hashCode());
        }

        if(thingsThatHaveVoted.isEmpty()) {
            throw new RuntimeException("Nobody voted!");
        }

        return result;
    }
}

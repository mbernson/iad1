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

        boolean everybodyReturnedTrue = true;

        for(Voter voter : voters) {
            if(isAllowedToVote(voter)) {
                if (false == voter.vote()) {
                    everybodyReturnedTrue = false;
                }
                thingsThatHaveVoted.add(voter.hashCode());
            }
        }

        if(thingsThatHaveVoted.isEmpty()) {
            throw new RuntimeException("Nobody voted!");
        }

        return everybodyReturnedTrue;
    }

    private boolean isAllowedToVote(Voter voter) {
        if(voter == null || thingsThatHaveVoted.contains(voter.hashCode())) {
            return false;
        }

        return true;
    }
}

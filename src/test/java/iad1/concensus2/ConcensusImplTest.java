package iad1.concensus2;

import iad1.concensus2.voters.FalseVoter;
import iad1.concensus2.voters.TrueVoter;
import itest.consensus.Concensus;
import itest.consensus.Voter;
import itest.consensus.impl.SimpleConcensus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ConcensusImplTest {
    private Concensus concensus;
    private ArrayList<Voter> voters;

    @Before
    public void setUp() throws Exception {
        concensus = new SimpleConcensus();
        voters = new ArrayList<>();
    }

    /**
     * Specificatie 1
     * De returnvalue van voting is alleen false als minimaal één stemmer als stem false geeft.
     */
    @Test
    public void testVotingReturnsFalseWhenAtLeastOneVoterReturnsFalse() {
        // Voorbereiding
        voters.add(new TrueVoter());
        voters.add(new FalseVoter());

        // Uitvoering
        boolean result = concensus.voting(voters);

        // Controle
        assertFalse(result);
    }

/**
 * Specificatie 2
 * Als alle stemgerechtigden true stemmen dan moet de returnvalue van voting true zijn.
 */
@Test
public void testVotingReturnsTrueWhenAllVotersReturnTrue() {
    voters.add(new TrueVoter());
    voters.add(new TrueVoter());
    voters.add(new TrueVoter());

    boolean result = concensus.voting(voters);

    assertTrue(result);
}

/**
 * Specificatie 3
 * Als specificatie 1 en 2 zich niet voordoen moet er een exception worden opgeworpen.
 */
@Test(expected = Exception.class)
public void testExceptionIsThrownWhenNobodyVotes() {
    concensus.voting(voters);
}

@Test(expected = Exception.class)
public void testExceptionIsThrownWhenAllVotersAreNull() {
    voters.add(null);
    voters.add(null);
    voters.add(null);
    voters.add(null);

    concensus.voting(voters);
}

/**
 * Specificatie 4
 * Iedere valide stemmer (dat wil zeggen, iedere niet null stemmer) moet stemmen.
 */
@Test
public void everyValidVoterMustVote() {
    Voter voterMock = mock(Voter.class);
    when(voterMock.vote()).thenReturn(false);

    voters.add(null);
    voters.add(new TrueVoter());
    voters.add(null);
    voters.add(new FalseVoter());
    voters.add(null);
    voters.add(voterMock);
    voters.add(null);

    concensus.voting(voters);

    verify(voterMock, times(1)).vote();
}

    /**
     * Specificatie 5
     * Geen stemgerechtigde mag vaker dan 1 keer stemmen.
     */
    @Test
    public void testVotersMayOnlyVoteOnce() {
        Voter falseVoterMock = mock(Voter.class),
              trueVoterMock = mock(Voter.class);

        when(falseVoterMock.vote()).thenReturn(false);
        when(trueVoterMock.vote()).thenReturn(true);

        voters.add(falseVoterMock);
        voters.add(falseVoterMock);
        voters.add(trueVoterMock);
        voters.add(trueVoterMock);
        voters.add(new TrueVoter());
        voters.add(new FalseVoter());

        concensus.voting(voters);
        concensus.voting(voters);

        verify(falseVoterMock, times(1)).vote();
        verify(trueVoterMock, times(1)).vote();
    }

    @After
    public void tearDown() throws Exception {
        concensus = null;
        voters = null;
    }
}
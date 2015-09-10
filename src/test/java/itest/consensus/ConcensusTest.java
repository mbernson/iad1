package itest.consensus;

import itest.consensus.impl.ConcensusImpl;
import itest.consensus.impl.voter.FalseVoter;
import itest.consensus.impl.voter.TrueVoter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ConcensusTest {
    private Concensus consensus;
    private ArrayList<Voter> voters;

    @Before
    public void setUp() throws Exception {
        voters = new ArrayList<>();
        consensus = new ConcensusImpl();
    }

    @Test
    public void testVotingReturnsFalseWhenOneVoterVotesFalse() {
        voters.add(new FalseVoter());

        assertFalse(consensus.voting(voters));
    }

    @Test
    public void testVotingReturnsTrueWhenAllVotersVoteTrue() {
        voters.add(new TrueVoter());
        voters.add(new TrueVoter());
        voters.add(new TrueVoter());

        assertTrue(consensus.voting(voters));
    }

    @Test
    public void testVoteIsCalledExactlyOnce() {
        Voter voterMock = mock(Voter.class);

        when(voterMock.vote()).thenReturn(false);

        voters.add(voterMock);

        consensus.voting(voters);

        verify(voterMock).vote();
    }

    @Test
    public void testConcencusIgnoresNullVoters() {
        voters.add(new TrueVoter());
        voters.add(null);
        voters.add(new FalseVoter());

        assertFalse(consensus.voting(voters));
    }

    @After
    public void tearDown() throws Exception {
        voters = null;
        consensus = null;
    }
}
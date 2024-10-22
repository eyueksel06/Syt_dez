package rest.model;

import java.util.List;

public class Party {
    private String partyID;
    private int amountVotes;
    private List<Vorzugsperson> personen;

    public Party(String partyID, int amountVotes) {
        this.partyID = partyID;
        this.amountVotes = amountVotes;
    }

    public String getPartyID() {
        return partyID;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public List<Vorzugsperson> getVorzugspersonen() {
        return personen;
    }

    public void setVorzugspersonen(List<Vorzugsperson> personen) {
        this.personen = personen;
    }
}

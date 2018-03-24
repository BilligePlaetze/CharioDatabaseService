package de.opencodes.chario.entities;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class TransactionId implements Serializable {

    @NotNull
    private String agentId;
    @NotNull
    private String donationCode;

    public TransactionId() {
    }

    public TransactionId(@NotNull String agentId, @NotNull String donationCode) {
        this.agentId = agentId;
        this.donationCode = donationCode;
    }

    public String getAgentId() {
        return agentId;
    }

    public TransactionId setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getDonationCode() {
        return donationCode;
    }

    public TransactionId setDonationCode(String donationCode) {
        this.donationCode = donationCode;
        return this;
    }
}

package org.sid.walletservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullWallet",types = Wallet.class)
public interface WalletProjection {

    Long getId();
    Double getSolde();
    Date getDateCeated();
    Double getDevise();
    Client getClient();


}

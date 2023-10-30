package org.sid.transferservice.entities;

import jakarta.persistence.Transient;
import org.sid.transferservice.Enums.Etat;
import org.sid.transferservice.module.Wallet;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="fullTransfert",types = Transfer.class)
public interface TransfertProjection {
    Long getId();
    Date getDate();
    Long getWalletId();
    Double getMontant();
    Etat getEtat();

}

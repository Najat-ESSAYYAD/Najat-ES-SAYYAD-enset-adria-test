package org.sid.transferservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.transferservice.Enums.Etat;
import org.sid.transferservice.module.Wallet;

import java.util.Date;

@Data
@Entity @NoArgsConstructor @AllArgsConstructor @Builder
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Long walletId;
    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestination;
    private Double montant ;
    private Etat etat ;

}

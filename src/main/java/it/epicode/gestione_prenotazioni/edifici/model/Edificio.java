package it.epicode.gestione_prenotazioni.edifici.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "edifici")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String indirizzo;

    @Column(nullable = false)
    private String citta;
}
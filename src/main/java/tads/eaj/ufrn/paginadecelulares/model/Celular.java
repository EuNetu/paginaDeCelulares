package tads.eaj.ufrn.paginadecelulares.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private Integer ram;
    private String memoria;
    private Double preco;
    private Integer anolancamento;
    private String imagem;
    private Date delete;


}

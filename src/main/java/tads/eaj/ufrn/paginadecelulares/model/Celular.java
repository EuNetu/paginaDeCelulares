package tads.eaj.ufrn.paginadecelulares.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2,max = 20, message = "digite uma marca de nome entre 2 e 20")
    private String marca;
    @Size(min = 3,max = 30)
    private String modelo;
    @Size(min = 3,max = 18)
    private String cor;
    private Integer ram;
    @Size(min = 1,max = 6)
    private String armazenamento;
    private Double preco;
    private String imageUri;
    private Date deleted;


}

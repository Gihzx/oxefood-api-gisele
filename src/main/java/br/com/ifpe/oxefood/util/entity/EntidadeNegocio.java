package br.com.ifpe.oxefood.util.entity;

import java.io.Serializable;

// acrecesnta codigo no caso do getter e setter 
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// gerar metodo equals
@EqualsAndHashCode(of = { "id" })
// serializable boa pratica pra definição de rede que vai navegar na iternet 
public abstract class EntidadeNegocio implements Serializable {

    private Long id;

    private Boolean habilitado;
    
}

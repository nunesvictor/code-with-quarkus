package org.acme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends AbstractEntity {
    public String descricao;
    public String sigla;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    public List<Produto> produtos = new ArrayList<>();
}

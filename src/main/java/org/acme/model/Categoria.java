package org.acme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria extends AbstractEntity {
    @Version
    @Column(columnDefinition = "int default 0")
    public Long version;

    public String descricao;
    public String sigla;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    public List<Produto> produtos = new ArrayList<>();
}

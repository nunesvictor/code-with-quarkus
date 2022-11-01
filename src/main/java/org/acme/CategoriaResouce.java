package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import org.acme.model.Categoria;

public interface CategoriaResouce extends PanacheEntityResource<Categoria, Long> {
    @Override
    @MethodProperties(exposed = false)
    boolean delete(Long aLong);
}

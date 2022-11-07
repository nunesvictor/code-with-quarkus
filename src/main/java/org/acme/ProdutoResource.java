package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;
import org.acme.model.Produto;

@ResourceProperties(path = "/produto")
public interface ProdutoResource extends PanacheEntityResource<Produto, Long> {
    @Override
    @MethodProperties(exposed = false)
    boolean delete(Long id);
}

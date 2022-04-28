package hello.project.reactor;

import reactor.core.publisher.Flux;

public class ProductService {

    public Flux<ProductModel> searchProducts(String choice) {
        return Flux.just();
    }
}

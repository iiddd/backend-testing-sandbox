package requestprovider;

import io.restassured.specification.RequestSpecification;

public class CatRequestProvider extends BaseRequestProvider {

    private static final String CATS_PATH = "/api/v1/cats/";

    public RequestSpecification prepareGetCatRequest(String catId) {
        return getDefaultRequestSpecBuilder()
                .setBasePath(CATS_PATH + catId)
                .build();
    }

    public RequestSpecification prepareGetCatListRequest() {
        return getDefaultRequestSpecBuilder()
                .setBasePath(CATS_PATH)
                .build();
    }
}

package requestprovider;

import io.restassured.specification.RequestSpecification;

public class ValheimRequestProvider extends BaseRequestProvider {

    private static final String VALHEIM_PATH = "/api/v1/valheim/characters";

    public RequestSpecification prepareGetValheimRequest(String ValheimId) {
        return getDefaultRequestSpecBuilder()
                .setBasePath(VALHEIM_PATH + ValheimId)
                .build();
    }

    public RequestSpecification prepareGetValheimListRequest() {
        return getDefaultRequestSpecBuilder()
                .setBasePath(VALHEIM_PATH)
                .addQueryParam("name", "bankamochi")
                .build();
    }
}

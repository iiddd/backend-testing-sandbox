import io.restassured.response.ValidatableResponse;
import models.CatResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requestprovider.CatRequestProvider;
import utils.RestUtils;

public class CatTest extends BaseTest {

    private final CatRequestProvider requestProvider = new CatRequestProvider();
    private static final String CAT_ID = "9e9d4241-20e9-4115-9831-e452c0ebfb29";

    @Test
    public void catTest() {
        ValidatableResponse response = RestUtils.get(requestProvider.prepareGetCatRequest(CAT_ID));
        response.statusCode(200);
        CatResponse cat = response.extract().body().as(CatResponse.class);
        Assertions.assertEquals(getExpectResponse(), cat);
    }

    private CatResponse getExpectResponse() {
        return new CatResponse()
                .setId("9e9d4241-20e9-4115-9831-e452c0ebfb29")
                .setCatName("Kvakos")
                .setAsleep(true)
                .setBorn("2022-04-11");
    }
}

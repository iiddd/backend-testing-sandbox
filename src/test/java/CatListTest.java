import io.restassured.response.ValidatableResponse;
import models.CatResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requestprovider.CatRequestProvider;
import utils.RestUtils;

import java.util.Arrays;
import java.util.List;

public class CatListTest extends BaseTest {
    private final CatRequestProvider requestProvider = new CatRequestProvider();

    @Test
    public void catTest() {
        ValidatableResponse response = RestUtils.get(requestProvider.prepareGetCatListRequest());
        response.statusCode(200);
        List<CatResponse> catList = Arrays.asList(response.extract().body().as(CatResponse[].class));
        Assertions.assertEquals(catList.size(), 2);
        Assertions.assertEquals(getExpectResponse(), catList);
    }

    private List<CatResponse> getExpectResponse() {
        return Arrays.asList(
                new CatResponse()
                        .setId("9e9d4241-20e9-4115-9831-e452c0ebfb29")
                        .setCatName("Kvakos")
                        .setAsleep(true)
                        .setBorn("2022-04-11"),
                new CatResponse()
                        .setId("f9f6a786-4864-4d06-8c63-ee1c6dd784b1")
                        .setCatName("Milka")
                        .setAsleep(false)
                        .setBorn("2024-07-11")
        );
    }

}

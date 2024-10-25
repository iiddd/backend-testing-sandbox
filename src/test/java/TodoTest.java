import io.restassured.response.ValidatableResponse;
import models.TodoResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requestprovider.TodoRequestProvider;
import utils.RestUtils;

public class TodoTest extends BaseTest {

    private final TodoRequestProvider requestProvider = new TodoRequestProvider();
    private static final String TODO_ID = "d8b25784-c16f-449a-9006-6972e8a9111b";

    @Test
    public void todoTest() {
        ValidatableResponse response = RestUtils.get(requestProvider.prepareGetTodoRequest(TODO_ID));
        response.statusCode(200);
        TodoResponse todo = response.extract().body().as(TodoResponse.class);
        Assertions.assertEquals(getExpectResponse(), todo);
    }

    private TodoResponse getExpectResponse() {
        return
                new TodoResponse()
                        .setId("d8b25784-c16f-449a-9006-6972e8a9111b")
                        .setTitle("Clean House")
                        .setActive(true)
                        .setCreated("2022-04-11");
    }
}

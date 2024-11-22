import io.restassured.response.ValidatableResponse;
import models.TodoResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import requestprovider.TodoRequestProvider;
import utils.RestUtils;

import java.util.Arrays;
import java.util.List;

public class TodoListTest extends BaseTest {
    private final TodoRequestProvider requestProvider = new TodoRequestProvider();

    @Test
    public void todoTest() {
        ValidatableResponse response = RestUtils.get(requestProvider.prepareGetTodoListRequest());
        response.statusCode(200);
        List<TodoResponse> todoList = Arrays.asList(response.extract().body().as(TodoResponse[].class));
        Assertions.assertEquals(2, todoList.size());
        Assertions.assertEquals(getExpectResponse(), todoList);
    }

    private List<TodoResponse> getExpectResponse() {
        return Arrays.asList(
                new TodoResponse()
                        .setId("d8b25784-c16f-449a-9006-6972e8a9111b")
                        .setTitle("Clean House")
                        .setActive(true)
                        .setCreated("2022-04-11"),
                new TodoResponse()
                        .setId("38ab7f0f-0cdc-4643-8cdb-42acf7d1a4c4")
                        .setTitle("Clean Car")
                        .setActive(true)
                        .setCreated("2022-04-12")
        );
    }
}

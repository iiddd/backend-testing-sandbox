package requestprovider;

import io.restassured.specification.RequestSpecification;

public class TodoRequestProvider extends BaseRequestProvider {

    private static final String TODOS_PATH = "/api/v1/todos/";

    public RequestSpecification prepareGetTodoRequest(String todoId) {
        return getDefaultRequestSpecBuilder()
                .setBasePath(TODOS_PATH + todoId)
                .build();
    }

    public RequestSpecification prepareGetTodoListRequest() {
        return getDefaultRequestSpecBuilder()
                .setBasePath(TODOS_PATH)
                .build();
    }
}

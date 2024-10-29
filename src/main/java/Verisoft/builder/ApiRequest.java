package Verisoft.builder;

import java.util.Map;

public class ApiRequest {

    private String url;
    private String method;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;

    public ApiRequest(ApiRequestBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.parameters = builder.parameters;
        this.body = builder.body;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public String getBody() {
        return body;
    }
}

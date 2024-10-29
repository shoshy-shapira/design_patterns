package Verisoft.builder;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestBuilder implements ApiRequestBuilderInterface{

    String url;
    String method;
    Map<String, String> headers = new HashMap<>();
    Map<String, String> parameters = new HashMap<>();
    String body;

    @Override
    public ApiRequestBuilderInterface setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public ApiRequestBuilderInterface setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public ApiRequestBuilderInterface setHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    @Override
    public ApiRequestBuilderInterface setParameter(String key, String value) {
        parameters.put(key, value);
        return this;
    }

    @Override
    public ApiRequestBuilderInterface setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public ApiRequest build() {
        return new ApiRequest(this);
    }
}


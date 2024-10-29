package Verisoft.builder;

public interface ApiRequestBuilderInterface {
    ApiRequestBuilderInterface setUrl(String url);
    ApiRequestBuilderInterface setMethod(String method);
    ApiRequestBuilderInterface setHeader(String key, String value);
    ApiRequestBuilderInterface setParameter(String key, String value);
    ApiRequestBuilderInterface setBody(String body);
    ApiRequest build();



}

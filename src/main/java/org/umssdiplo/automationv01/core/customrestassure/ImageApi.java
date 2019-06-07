package org.umssdiplo.automationv01.core.customrestassure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.security.NoSuchAlgorithmException;

/**
 * @autor Marcelo Garay
 */
public class ImageApi implements IEndPoint {
    private static ImageApi instance = new ImageApi();
    private RequestSpecification requestSpecification;

    private ImageApi(){
        initializeRequestSpecification();
    }

    public static ImageApi getInstance(){
        return instance;
    }

    @Override
    public void initializeRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(PropertyAccessor.getInstance().getBaseUri())
                .addFormParam("sol", "1000")
                .addFormParam("api_key", "DEMO_KEY")
                .build();
    }

    @Override
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
}

package com.tutorial.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String nombre , Context context) {
        context.getLogger().log("nombre: " + nombre);

        // TODO: implement your handler
        return "Hola" + nombre + "!!";
    }

}

package com.example.calculator.rpc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonRpcResponse {

    private String jsonrpc;
    private Object result;
    private Object error;
    private String id;
//tambahkan method getter dan setter

    public JsonRpcResponse(Object result, String id) {
        this.result = result;
        this.id = id;
    }

    
}

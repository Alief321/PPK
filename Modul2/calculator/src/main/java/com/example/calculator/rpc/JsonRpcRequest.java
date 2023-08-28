package com.example.calculator.rpc;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonRpcRequest {

    private String jsonrpc;
    private String method;
    private JsonNode params;
    private String id;
//tambahkan method getter dan setter
}

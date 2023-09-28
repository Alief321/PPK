package com.polstat.perpustakaan.rpc;

import com.polstat.perpustakaan.dto.BookDto;
import java.util.List;
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

    public JsonRpcResponse(List<BookDto> books, String id) {
        this.result = books;
        this.id = id;
    }
    public JsonRpcResponse(String jsonrpc, String id) {
        this.result = jsonrpc;
        this.id = id;
    }
}

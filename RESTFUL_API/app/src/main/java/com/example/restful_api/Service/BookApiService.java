
package com.example.restful_api.Service;
import com.example.restful_api.model.Book;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

public interface BookApiService {
    @GET("/books")
    Call<List<Book>> getBooks();
    @GET("/books/{id}")
    Call<Book> getBookById(@Path("id") int id);
    @POST("/books")
    Call<Book> createBook(@Body Book book);
    @PUT("/books/{id}")
    Call<Book> updateBook(@Path("id") int id, @Body Book book);
    @DELETE("/books/{id}")
    Call<Void> deleteBook(@Path("id") int id);
}

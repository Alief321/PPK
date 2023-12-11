package com.example.restful_api;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restful_api.Service.BookApiService;
import com.example.restful_api.model.Book;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private BookApiService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService =
            ApiClient.getRetrofitInstance().create(BookApiService.class);
// Contoh panggilan API
        getBooks();
    }
    private void getBooks() {
        Call<List<Book>> call = apiService.getBooks();
        call.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call,

                        Response<List<Book>> response) {

                if (response.isSuccessful()) {
                    List<Book> books = response.body();
                    for (Book book : books) {
                        Log.d(TAG, "Title: " + book.getTitle() +

                                ", Author: " + book.getAuthor());

                    }
                }
            }
            @Override
            public void onFailure(Call<List<Book>> call,

                Throwable t) {

                Log.e(TAG, "Error fetching books", t);
            }
        });
    }
// Implementasikan metode lain sesuai kebutuhan (create,update, delete)
}
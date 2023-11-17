package com.example.asynctaskpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MainActivity extends AppCompatActivity {
    URL imageUrl = null;
    InputStream is = null;
    Bitmap bmImg = null;
    ImageView imageView = null;
    Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.asyncTask);
        imageView = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menggunakan ExecutorService dan FutureTask
                ExecutorService executor = Executors.newFixedThreadPool(1);
                FutureTask<Bitmap> futureTask = new FutureTask<>(new DownloadTask("https://stis.ac.id/media/source/up.png "));
                executor.execute(futureTask);

                try {
                    bmImg = futureTask.get(); // Mendapatkan hasil dari FutureTask
                    imageView.setImageBitmap(bmImg);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }

                executor.shutdown();
            }
        });
    }

    // Callable untuk mendownload gambar secara asynchronous
    private static class DownloadTask implements Callable<Bitmap> {
        private final String imageUrl;

        public DownloadTask(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        @Override
        public Bitmap call() throws Exception {
            try {
                URL url = new URL(imageUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true);
                conn.connect();
                InputStream is = conn.getInputStream();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                return BitmapFactory.decodeStream(is, null, options);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}

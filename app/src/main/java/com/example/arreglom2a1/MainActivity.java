package com.example.arreglom2a1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        executeSortingProcess();
    }

    private void executeSortingProcess() {

        // Este es el còdigo nuevo que agregué para crear el arreglo de un millén de elmentos.
        int[] array = new int[1000000];
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            //Se supone que con el siguiente còdigo se ordena el arreglo.
            //Arrays.sort(array);


        }  //Esta llave la agregué porque me marcaba error.

        Arrays.sort(array);


        long endTime = System.currentTimeMillis();
        long finalL= endTime - startTime;
        Log.d("PPB", "" + finalL);
    }
}




package com.example.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnCero,btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnSuma, btnResta, btnMultiplica, btnDivide, btnClean, btnBorrar, btnPunto, btnIgual,btnFactorial,btnFibonacci,btnPrimo;
    TextView Resultado;
    double resultado;
    String operador, mostrar , reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCero=(Button)findViewById(R.id.Cero);
        btnUno = (Button)findViewById(R.id.Uno);
        btnDos = (Button)findViewById(R.id.Dos);
        btnTres = (Button)findViewById(R.id.Tres);
        btnCuatro = (Button)findViewById(R.id.Cuatro);
        btnCinco = (Button)findViewById(R.id.Cinco);
        btnSeis = (Button)findViewById(R.id.Seis);
        btnSiete = (Button)findViewById(R.id.Siete);
        btnOcho = (Button)findViewById(R.id.Ocho);
        btnNueve = (Button)findViewById(R.id.Nueve);
        btnSuma = (Button)findViewById(R.id.Suma);
        btnResta = (Button)findViewById(R.id.Resta);
        btnMultiplica = (Button)findViewById(R.id.Multiplica);
        btnDivide = (Button)findViewById(R.id.Divide);
        btnClean = (Button)findViewById(R.id.Clean);
        btnBorrar = (Button)findViewById(R.id.Borrar);
        Resultado = (TextView)findViewById(R.id.Etiqueta);
        btnPunto = (Button)findViewById(R.id.Punto);
        btnIgual = (Button)findViewById(R.id.Igual);
        btnFactorial = (Button)findViewById(R.id.factorial);
        btnFibonacci=(Button)findViewById(R.id.fibonacci);
        btnPrimo=(Button)findViewById(R.id.primo);


        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=Resultado.getText().toString();
                mostrar=mostrar+"0";
                Resultado.setText(mostrar);
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num= Integer.parseInt(Resultado.getText().toString());
                Resultado.setText(""+String.format(Locale.getDefault(),"%.0f",factorial(num)));
            }
        });
        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText(fibonacci(Integer.parseInt(Resultado.getText().toString())));
            }
        });
        btnPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor=Resultado.getText().toString();
                int num=Integer.parseInt(valor);

                int contador=2;
                boolean primo=true;
                String resul="";
                while ((primo)&&(contador!=num)){
                    if (num%contador==0||num==1)
                        primo=false;
                    contador++;
                }
                if (primo==false){
                    resul="NO ES PRIMO";
                }
                else{
                    resul="ES PRIMO";
                }
                Resultado.setText(resul);
            }
        });

    }
    private double factorial (double num){
        if (num<2)
            return 1;
        else
            return num*factorial(num-1);
    }
    private String fibonacci(int n){
        String text="";
        ArrayList<BigInteger> fib=new ArrayList<>();
        BigInteger first=new BigInteger("0");
        BigInteger second=new BigInteger("1");
        fib.add(first);
        fib.add(second);
        for (int i=1;i<n;i++)
            fib.add(fib.get(i).add(fib.get(i-1)));
        for (int i=1;i<=n;i++)
            text=text+fib.get(i)+" ";
        return text;
    }
}

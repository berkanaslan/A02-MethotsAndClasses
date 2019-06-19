package com.berkanaslan.methotsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate is called.");
        testMethod();

        System.out.println(math(3,5));
        System.out.println(newMethod("Berkan "));

        username = "Rob";
        makeMusicians();
        makeSimpsons();
    }

    public void testMethod() {
        int x = 4 + 4;
        System.out.println("Value of x:"+x);

        username = "Lars";
    }

    public int math(int a, int b) {
        username = "Kirk";
        return a+b;
    }

    public void makeMusicians() {

        //instance

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
        //james.age = 50;
        //james.instrument = "Guitar";
        //james.name = "James";

    }

    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");
        homer.setAge(51);
        System.out.println(homer.getAge()+" "+homer.getName());

    }

    public String newMethod(String string) {
        return string + "new method.";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume is called.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause is called.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("onStop is called.");
    }
}


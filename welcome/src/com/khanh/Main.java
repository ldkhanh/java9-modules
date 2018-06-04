package com.khanh;

import com.khanh.world.HelloWorld;
import com.khanh.youtube.HelloYoutube;

public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloYoutube helloYoutube = new HelloYoutube();
        helloWorld.print();
        helloYoutube.print();
    }
}

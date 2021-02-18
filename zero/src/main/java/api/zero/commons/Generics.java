package api.zero.commons;

import api.zero.watch.ConexaoDriver;

import java.io.IOException;

public class Generics extends ConexaoDriver {

    public static void espera(Long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getUrl(String canal){
        driver.get(canal);
    }
    public static void executeCmd() {
        String anyCommand="chrome.exe -remote-debugging-port=9015 --user-data-dir=\"C:\\Users\\Matheus Felipe\\Downloads\\zero ";
        try {
            Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
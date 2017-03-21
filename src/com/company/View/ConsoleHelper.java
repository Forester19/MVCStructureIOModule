package com.company.View;

import com.company.Model.Developer;

import java.io.*;

/**
 * Created by Владислав on 20.03.2017.
 */
public class ConsoleHelper {
    String developer;
    String s = "Enter please what you want: \n" +
            "1. - list developers \n" +
            "2. - create \n" +
            "3. - update \n" +
            "4. - delete \n";
    private int i;

    public int getI() {
        return i;
    }

    public String getDeveloper() {
        return developer;
    }

    public ConsoleHelper() {
        System.out.println(s);
    }

    public int getNumber() throws IOException {

        while (true){
           try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))){
            i = Integer.parseInt(read.readLine());
            if (i>4 || i<=0){
                System.out.println("chouse some (1 - 4)");

            }
            if (i == 2){
                informAboutDeveloper();
            }



            }
            catch (Exception e){
                System.out.println("");
                break;
            }
        }
       return 0;
    }
    private String informAboutDeveloper(){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
        developer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return developer;
    }




}

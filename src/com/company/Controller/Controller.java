package com.company.Controller;

import com.company.Model.Developer;
import com.company.Model.DevolopersDAO;
import com.company.View.ConsoleHelper;

import java.io.IOException;

/**
 * Created by Владислав on 21.03.2017.
 */
public class Controller {

    DevolopersDAO devolopersDAO = new DevolopersDAO();

    ConsoleHelper consoleHelper = new ConsoleHelper();

    public void doControl() {
        try {
            consoleHelper.getNumber();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index;

        index = consoleHelper.getI();

        switch (index) {
            case 1: {
                devolopersDAO.getAll();
                break;
            }
            case 2: {
                devolopersDAO.addToDoc(createDeveloper(consoleHelper.getDeveloper()));
                break;
            }
            case 3:
                System.out.println("i don't know how to update file");
            case 4: {
                devolopersDAO.delete();
                break;
            }
        }

    }

    private Developer createDeveloper(String developer) {
        String[] dev = developer.split(" ");
        Developer developer1 = new Developer(Integer.valueOf(dev[0]), dev[1], dev[2], dev[3], Integer.valueOf(dev[4]));
        return developer1;
    }
}

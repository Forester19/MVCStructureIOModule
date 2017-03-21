package com.company;

import com.company.Controller.Controller;
import com.company.Model.Developer;
import com.company.Model.DevolopersDAO;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Developer dev1 = new Developer(1,"Ani","Oslo", "js junior",1);
        Developer dev2 = new Developer(2,"Jack","Jonson", "Engineer",3);
        Developer dev3 = new Developer(3,"Fol","Groow", "PM",4);
        Developer dev4 = new Developer(4,"Frank","Sinatra", "Senior developer",5);
        DevolopersDAO devolopersDAO = new DevolopersDAO();
        devolopersDAO.getByID(1);
        Controller control = new Controller();
        control.doControl();





    }
}

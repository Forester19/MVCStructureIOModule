package com.company.Model;

import java.io.*;

/**
 * Class for connecting app with data.
 *
 * @author Владислав
 * @version 1.0
 */
public class DevolopersDAO {
    File file = new File("Resourses/Developers.txt");

    public void addToDoc(Developer dev) {
        try (FileWriter bw = new FileWriter(file.getAbsoluteFile(), true); FileReader fr = new FileReader(file.getAbsoluteFile())) {
            String developer = dev.getId() + " " + dev.getFirstName() + " " + dev.getLastName() + " " + dev.getSpeciality() + " " + dev.getExperiance() + "|";


            bw.write(developer);
            bw.append("\n");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getAll() {
        try (FileReader fr = new FileReader(file.getAbsoluteFile())) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    public void getByID(int id){
        try (FileReader fr = new FileReader(file.getAbsoluteFile())) {
            int c;
            while ((c = fr.read()) == id) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void save() {
        file.setReadOnly();
    }

    public void delete() {
        file.delete();
    }


}

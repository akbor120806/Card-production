package com.example.card_production.Akbor;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

import java.io.*;
import java.util.ArrayList;

public class StafPichartController {

    @FXML
    private PieChart StafRationPichart;

    private int Printing, cutting, binding, packaging, ItSupport;

    private void loadStaffPieData() {

        ArrayList<StaffPerformance> userList = new ArrayList<>();

        FileInputStream fis;
        ObjectInputStream ois = null;

        try {
            File f = new File("StaffPerformance.bin");

            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
            }

            while (true) {
                userList.add((StaffPerformance) ois.readObject());
            }

        } catch (Exception e) {
            try {
                if (ois != null) ois.close();
            } catch (IOException ex) {
                //
            }
        }


        Printing = cutting = binding = packaging = ItSupport = 0;

        for (StaffPerformance s : userList) {
            if (s.getDepartment().equals("Printing")) Printing++;
            else if (s.getDepartment().equals("cutting")) cutting++;
            else if (s.getDepartment().equals("binding")) binding++;
            else if (s.getDepartment().equals("packaging")) packaging++;
            else if (s.getDepartment().equals("ItSupport")) ItSupport++;
        }
    }

    @FXML
    public void initialize() {
        loadStaffPieData();
        StafRationPichart.getData().clear();

        StafRationPichart.getData().add(new PieChart.Data("Printing", Printing));
        StafRationPichart.getData().add(new PieChart.Data("cutting", cutting));
        StafRationPichart.getData().add(new PieChart.Data("binding", binding));
        StafRationPichart.getData().add(new PieChart.Data("packaging", packaging));
        StafRationPichart.getData().add(new PieChart.Data("ItSupport", ItSupport));
    }
}

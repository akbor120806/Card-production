//package com.example.card_production.Akbor;
//
//import javafx.scene.control.Alert;
//import javafx.scene.control.ButtonType;
//
//import java.time.LocalDate;
//import java.util.Random;
//
//public class demoCode {
//
//
//    boolean digitFound = false;
//        for(int i=0;i<nameTextfield.getText().length();i++){
//        if(nameTextfield.getText().charAt(i)>='0' &&
//                nameTextfield.getText().charAt(i)<='9') digitFound = true;
//    }
//        if(
//                idTextfield.getText().isEmpty() ||
//            nameTextfield.getText().isEmpty() ||
//            cgpaTextfield.getText().isEmpty() ||
//            dobDatepicker.getValue().isAfter(LocalDate.now()) ||
//    digitFound
//        ){
//        notificationLabel.setText("Fill up the form properly");
//        Alert e1 = new Alert(Alert.AlertType.ERROR);
//        e1.setContentText("Fill up the form properly");
//        e1.show();
//    }
//        else{
//        //unique id verification
//        boolean sameIdFound = false;
//        for(Student s: studentList){
//            if(s.getId()==Integer.parseInt(idTextfield.getText())){
//                sameIdFound = true;
//            }
//        }
//        if(sameIdFound) notificationLabel.setText("Same ID has been found.");
//        else{
//            String gender="";
//            if(maleRadioButton.isSelected()) gender = "Male";
//            else if(femaleRadioButton.isSelected()) gender = "Female";
//
//            String skills = "";
//            if(javaCheckbox.isSelected() && pythonCheckbox.isSelected()) skills = "Java, Python";
//            else if(javaCheckbox.isSelected()) skills = "Java";
//            else if(pythonCheckbox.isSelected()) skills = "Python";
//
//
//            Student s = new Student(
//                    Integer.parseInt(idTextfield.getText()),
//                    nameTextfield.getText(),
//                    majorCombobox.getValue(),
//                    gender,
//                    skills,
//                    Float.parseFloat(cgpaTextfield.getText()),
//                    dobDatepicker.getValue(),
//                    hasScholarshipCheckbox.isSelected()
//            );
//            Alert e2 = new Alert(Alert.AlertType.CONFIRMATION);
//            e2.setContentText("Are you sure?");
//            e2.showAndWait().ifPresent(response->{
//                if(response== ButtonType.OK){
//                    studentList.add(s);
//                    studentInfoTableview.getItems().add(s);
//                    notificationLabel.setText("Student added successfully");
//                }
//            });
//
//
//
//            //idTextfield.clear();
//            nameTextfield.clear();
//            cgpaTextfield.clear();
//            dobDatepicker.setValue(LocalDate.of(2000, 1,1));
//            maleRadioButton.setSelected(false);
//            femaleRadioButton.setSelected(false);
//            pythonCheckbox.setSelected(false);
//            javaCheckbox.setSelected(false);
//            hasScholarshipCheckbox.setSelected(false);
//            majorCombobox.setValue("");
//            Random r = new Random();
//            String id = String.format("%07d", r.nextInt(10000000));
//            idTextfield.setText(id);
//            idTextfield.setEditable(false);
//        }
//
//
//    }
//
//
//
//}

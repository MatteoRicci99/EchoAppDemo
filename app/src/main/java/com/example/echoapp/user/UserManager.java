//package com.example.echoapp.user;
//
//import com.example.echoapp.auto.Auto;
//import com.example.echoapp.database.DBManager;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserManager {
//
//    private List<User> userList;
//    private List<Auto> autoList;
//
//    public List<User> getAllUsers() throws SQLException {
//
//        ArrayList<User> users = new ArrayList<>();
//        Statement statement = DBManager.getConnection().createStatement();
//        String query = "SELECT * FROM Utente";
//        ResultSet rs = statement.executeQuery(query);
//
//    }
//}


//    public List<Student> getAllStudents() throws SQLException {
//        ArrayList<Student> students = new ArrayList<>();
//        Statement statement = DBManager.getConnection().createStatement();
//        String query = "SELECT * FROM students";
//        ResultSet rs = statement.executeQuery(query);
//        while (rs.next()) {
//            students.add(
//                    new Student(Utils.asUUID(rs.getBytes("id")),
//                            rs.getString("name"),
//                            rs.getString("surname"),
//                            rs.getDate("birthdate"))
//            );
//        }
//        statement.close();
//        return students;
//    }
//
//    public void update() {
//        try {
//            listStudents.clear();
//            listStudents.addAll(getAllStudents());
//            Student student = listStudents.get(selectedStudentIndex);
//
//            cbCoursesModel.removeAllElements();
//            cbCoursesModel.addAll(getAllCourses());
//            cbCourses.setSelectedIndex(0);
//            listCoursesModel.clear();
//            listCoursesModel.addAll(getStudentCourses(student));
//
//            tfID.setText(student.getID().toString());
//            tfName.setText(student.getName());
//            tfSurname.setText(student.getSurname());
//            tfBirthDate.setText(student.getBirthDate().toString());
//        } catch (IndexOutOfBoundsException | SQLException e) {
//            tfID.setText("n/a");
//            tfName.setText("n/a");
//            tfSurname.setText("n/a");
//            tfBirthDate.setText("n/a");
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
//    }
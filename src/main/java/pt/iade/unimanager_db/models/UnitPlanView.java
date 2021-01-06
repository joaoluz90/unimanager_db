package pt.iade.unimanager_db.models;

public interface UnitPlanView {
    String getCourseName();
    int getCourseId();
    int getSemester();
    int getId();
    String getName();
    int getCredits();
}
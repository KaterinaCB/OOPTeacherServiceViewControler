package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService  implements UserService<Teacher> {
    private int teacherId = 0;
    private final List<Teacher> teacherList = new ArrayList<>();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for(Teacher i : teacherList){
            if(maxId < i.getTeacherId()){
                maxId = i.getTeacherId();
            }
        }
        maxId++;
        teacherList.add(new Teacher(maxId, firstName,secondName,lastName));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}

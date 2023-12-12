package controler;

import model.Teacher;
import model.User;
import model.UserComparator;
import service.TeacherService;
import view.TeacherView;

public class TeacherControler implements UserControler<User>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public void sendOnConsole(){
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    public void sortByFio(){
        teacherService.getTeacherList().sort(new UserComparator<Teacher>());
    }

}

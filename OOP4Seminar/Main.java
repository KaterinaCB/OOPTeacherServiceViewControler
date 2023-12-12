import controler.StudentControler;
import controler.TeacherControler;
import model.StudentGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TeacherControler controller = new TeacherControler();
        controller.create("Иванов", "Иван", "Иванов");
        controller.create("Орлов", "Геннадий", "Васильевич");
        controller.create("Круглов", "Артем", "Дмитриевич");
        controller.create("Тужик", "Вячеслав", "Андреевич");
        controller.sendOnConsole();
        controller.sortByFio();
        System.out.println();
        controller.sendOnConsole();



    }
}
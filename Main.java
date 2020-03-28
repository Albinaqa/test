import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разработать список дел, которым можно
управлять командами в консоли.
Команды LIST, ADD, EDIT, DELETE.
LIST должен выводить дела с их
порядковыми номерами.
ADD - добавлять дело в конец
списка или дело на определённое
место, сдвигая остальные дела
вперёд, если указать номер.
EDIT - заменять дело с
указанным номером.
DELETE - удалять. Примеры команд:
    LIST
    ADD Какое-то дело
    ADD 4 Какое-то дело на четвёртом месте
    EDIT 3 Новое название дела
    DELETE 7
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Task myTask = new Task();
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!str.trim().equalsIgnoreCase("EXIT")) {
            System.out.println("------------SYNTAX------------");
            System.out.println("LIST - list of tasks");
            System.out.println("ADD <task> - ADD new task to the end of list");
            System.out.println("ADD [number] <task> - ADD new task before task [number]");
            System.out.println("EDIT <number> <task> - EDIT task with number <number>");
            System.out.println("DELETE <number> - DELETE task with number <number>");
            System.out.println("EXIT - exit the program");
            System.out.println("------------------------------");
            System.out.println("Enter your command: ");
            str = reader.readLine();
            myTask.doCmd(str);
        }

    }
}

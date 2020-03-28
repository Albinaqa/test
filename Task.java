import java.util.ArrayList;

public class Task {
    private ArrayList<String> toDoList;

    public Task() {
        toDoList = new ArrayList<String>();
    }

    public void list() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + "\t" + toDoList.get(i));
        }
    }

    public void add(String taskName) {
        toDoList.add(taskName);
    }

    public void add(int index, String taskName) {
            toDoList.add(index, taskName);
    }

    public void edit(int index, String newTaskName) {
            toDoList.set(index, newTaskName);
    }

    public void delete(int index) {
        toDoList.remove(index);
    }

    public void doCmd(String cmd) throws IndexOutOfBoundsException {
        String[] array = cmd.split(" ", 3);
        String command = array[0].toLowerCase();
        String index = "";
        String regex = "\\d+";
        String param = "";
        int idx = -1;
        if(array.length >= 2) index = array[1];
        if(array.length == 3) param = array[2];

        if(index.matches(regex)) {
            idx = Integer.parseInt(index);
        }

        switch(command) {
            case "list":
                list();
                break;
            case "add":
                if(idx > -1) {
                    try{
                        add(idx, param);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Wrong index!!!");
                    }
                }
                else add(index + " " + param);
                break;
            case "edit":
                if(idx > -1) {
                    try {
                        edit(idx, param);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Wrong index!!!");
                    }
                }
                break;
            case "delete":
                if(idx > -1) {
                    try {
                        delete(idx);
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Wrong index!!!");
                    }
                }
                break;
        }
    }





}

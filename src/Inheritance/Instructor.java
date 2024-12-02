package Inheritance;

import java.util.List;

public class Instructor extends User{
    private int hoursTaught;
    private List<String> modules;

    Instructor(){
        System.out.println("Instructor Constructor is called");
    }

    public int getHoursTaught() {
        return hoursTaught;
    }

    public void setHoursTaught(int hoursTaught) {
        this.hoursTaught = hoursTaught;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }
}

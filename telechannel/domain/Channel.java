package ru.vsuet.telechannel.domain;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String name;
    private List<Program> programs;

    public Channel(String name) {
        this.name = name;
        this.programs = new ArrayList<>();
    }

    public void addProgram(Program program) {
        programs.add(program);
    }

    public void removeProgram(Program program) {
        programs.removeIf(p -> p.getName().equalsIgnoreCase(program.getName()));
    }

    public String getName() {
        return name;
    }

    public List<Program> getPrograms() {
        return new ArrayList<>(programs);
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", programs=" + programs +
                '}';
    }
}

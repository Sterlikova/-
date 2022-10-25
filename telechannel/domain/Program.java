package ru.vsuet.telechannel.domain;
import java.time.LocalTime;

public class Program {

    private String name;
    private DayOfWeek dayOfWeek;
    private LocalTime time;

    public Program(String name, DayOfWeek dayOfWeek, LocalTime time) {
        this.name = name;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                ", time=" + time +
                '}';
    }

}
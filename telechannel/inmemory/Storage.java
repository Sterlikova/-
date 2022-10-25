package ru.vsuet.telechannel.inmemory;

import ru.vsuet.telechannel.domain.Channel;
import ru.vsuet.telechannel.domain.DayOfWeek;
import ru.vsuet.telechannel.domain.Program;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    private List<Channel> channels;

    private Storage() {
        channels = new ArrayList<>();
        init();
    }

    public List<Channel> getChannels() {
        return channels;
    }

    private void init() {
        Program program = new Program("Molodezhka", DayOfWeek.MONDAY, LocalTime.parse("06:05:00"));
        Program program1 = new Program("Ural dumpling", DayOfWeek.FRIDAY, LocalTime.parse("17:55:00"));

        Channel channel = new Channel("CTC");
        channel.addProgram(program);
        channel.addProgram(program1);

        Program program2 = new Program("Molodezhka TEST", DayOfWeek.MONDAY, LocalTime.parse("07:05:00"));
        Program program3 = new Program("Ural dumpling TEST", DayOfWeek.FRIDAY, LocalTime.parse("18:55:00"));

        Channel channel1 = new Channel("TNT");
        channel1.addProgram(program2);
        channel1.addProgram(program3);

        channels.add(channel);
        channels.add(channel1);
    }
}

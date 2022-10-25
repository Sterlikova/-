package ru.vsuet.telechannel;

import ru.vsuet.telechannel.domain.Channel;
import ru.vsuet.telechannel.domain.Program;
import ru.vsuet.telechannel.repository.InMemoryChannelRepository;
import ru.vsuet.telechannel.repository.InMemoryProgramRepository;
import ru.vsuet.telechannel.repository.Repository;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Repository<Channel> repository = new InMemoryChannelRepository();

        System.out.println(repository.list().stream()
                .map(Channel::toString)
                .collect(Collectors.joining("\n"))
        );

        Repository<Program> programRepository = new InMemoryProgramRepository();
        System.out.println(programRepository.list().stream()
                .map(Program::toString)
                .collect(Collectors.joining("\n"))
        );
    }

}

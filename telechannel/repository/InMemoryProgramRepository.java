package ru.vsuet.telechannel.repository;

import ru.vsuet.telechannel.domain.Program;
import ru.vsuet.telechannel.inmemory.Storage;

import java.util.List;
import java.util.stream.Collectors;

public class InMemoryProgramRepository implements Repository<Program> {

    private List<Program> programs;

    public InMemoryProgramRepository() {
        programs = Storage.getInstance().getChannels().stream()
                .flatMap(c -> c.getPrograms().stream())
                .collect(Collectors.toList());
    }

    @Override
    public Program find(String name) {
        return programs.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Program source) {
        throw new IllegalStateException("Method is not supported");
    }

    @Override
    public void remove(Program target) {
        throw new IllegalStateException("Method is not supported");
    }

    @Override
    public List<Program> list() {
        return programs;
    }
}

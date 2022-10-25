package ru.vsuet.telechannel.repository;

import ru.vsuet.telechannel.domain.Channel;
import ru.vsuet.telechannel.inmemory.Storage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryChannelRepository implements Repository<Channel> {

    private Storage storage;

    public InMemoryChannelRepository() {
        storage = Storage.getInstance();
    }

    @Override
    public Channel find(String name) {
        return storage.getChannels().stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Channel source) {
        storage.getChannels().add(source);
    }

    @Override
    public void remove(Channel target) {
        storage.getChannels().removeIf(c -> c.getName().equalsIgnoreCase(target.getName()));
    }

    @Override
    public List<Channel> list() {
        return new ArrayList<>(storage.getChannels());
    }
}

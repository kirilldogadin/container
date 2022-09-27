package io.metadevs.container;

public interface Container {
    void to(Msg msg);
    User from(User recipient);
}

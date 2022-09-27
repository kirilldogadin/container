package io.metadevs.container;

import java.util.UUID;

public interface User {
    UUID uuid();
    PublicKey publicKey();
}

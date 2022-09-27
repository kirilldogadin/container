package io.metadevs.container;

import java.util.UUID;

/**
 * Зашифровано открытым ключом ПОЛУЧАТЕЛЯ
 * имеет id? для различия разных сообщений, получатель может иметь больше чем одно сообщение
 *
 */
public interface Msg {
    //Todo ключевая фраза для поиска - жираф_в_атаке или что-то подобное
    //
    UUID uuid();
    User from();
    User to();
    String encodedPayload();
}

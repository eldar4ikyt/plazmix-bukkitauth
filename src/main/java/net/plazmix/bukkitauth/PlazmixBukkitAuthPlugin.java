package net.plazmix.bukkitauth;

import net.plazmix.bukkitauth.listener.GuardListener;
import org.bukkit.plugin.java.JavaPlugin;
import net.plazmix.bukkitauth.listener.PlayerVisibilityListener;
import net.plazmix.bukkitauth.listener.ServerListener;

/*  Leaked by https://t.me/leak_mine
    - Все слитые материалы вы используете на свой страх и риск.

    - Мы настоятельно рекомендуем проверять код плагинов на хаки!
    - Список софта для декопиляции плагинов:
    1. Luyten (последнюю версию можно скачать можно тут https://github.com/deathmarine/Luyten/releases);
    2. Bytecode-Viewer (последнюю версию можно скачать можно тут https://github.com/Konloch/bytecode-viewer/releases);
    3. Онлайн декомпиляторы https://jdec.app или http://www.javadecompilers.com/

    - Предложить свой слив вы можете по ссылке @leakmine_send_bot или https://t.me/leakmine_send_bot
*/

public final class PlazmixBukkitAuthPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GuardListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerVisibilityListener(), this);

        getServer().getPluginManager().registerEvents(new ServerListener(this), this);
    }

}

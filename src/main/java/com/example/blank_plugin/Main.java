package com.example.blank_plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  @Override
  public void onEnable() {
    // プラグインが有効になるとこの文字がコンソールに表示される
    getLogger().info("プラグインを有効にしました。");
  }
}

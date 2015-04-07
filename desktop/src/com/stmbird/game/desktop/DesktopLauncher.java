package com.stmbird.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.stmbird.game.STMBird;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "STMBird";
        config.width = 480;
        config.height = 320;
        new LwjglApplication(new STMBird(), config);
    }
}

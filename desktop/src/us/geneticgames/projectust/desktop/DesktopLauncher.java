package us.geneticgames.projectust.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import us.geneticgames.projectust.ProjectUST;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.addIcon("logo/icon_16x.png", FileType.Internal);
		config.addIcon("logo/icon_32x.png", FileType.Internal);
		config.addIcon("logo/icon_128x.png", FileType.Internal);
		config.foregroundFPS = 60;
		config.allowSoftwareMode= true;
		config.useGL30 = true;
		new LwjglApplication(new ProjectUST(), config);
		
	}
}

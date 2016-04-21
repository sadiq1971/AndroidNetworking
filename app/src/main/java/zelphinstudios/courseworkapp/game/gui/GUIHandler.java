package zelphinstudios.courseworkapp.game.gui;

import android.content.Context;

import java.util.Vector;

import zelphinstudios.courseworkapp.system.util.BitmapDecoder;

public class GUIHandler {

	// Variables
	private Vector<GUI> guis = new Vector<>();


	// Constructor
	public GUIHandler(Context context_) {
		BitmapDecoder bitmapDecoder = new BitmapDecoder(context_);

		GUI gui = new GUI(40, 600, bitmapDecoder.decode(""), true);
		gui.addButton(new Button(100, 144, 0,   144, 144, bitmapDecoder.decode("button_north"), true));
		gui.addButton(new Button(101, 288, 144, 144, 144, bitmapDecoder.decode("button_east"), true));
		gui.addButton(new Button(102, 144, 288, 144, 144, bitmapDecoder.decode("button_south"), true));
		gui.addButton(new Button(103, 0,   144, 144, 144, bitmapDecoder.decode("button_west"), true));
		guis.addElement(gui);
	}


	// Getters
	public Vector<GUI> getGUIs() {
		return guis;
	}

}
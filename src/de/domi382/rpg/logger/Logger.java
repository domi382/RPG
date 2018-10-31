package de.domi382.rpg.logger;

import java.io.File;
import java.io.IOException;

public class Logger {
	public static void log(String text) {
		File logfile = new File("log.txt");
		if(!logfile.exists()) {
			try {
				boolean created = logfile.createNewFile();
				if (de.domi382.rpg.config.Debugger.isDebugging) System.out.println("[DEBUG] Creating new logfile");
			}
			catch (IOException ex) {
				if (de.domi382.rpg.config.Debugger.isDebugging) System.out.println("[DEBUG] ERROR WHILE CREATING LOGFILE");
				ex.printStackTrace();
			}
		} else {
			
		}
	}
}

package com.Serviceobjectmodel.Utilities;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import java.awt.datatransfer.StringSelection;

public class FileUploadUtilities {

	public void FileUploadUsingRobotClass(String path) throws AWTException, InterruptedException {
		StringSelection s = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r = new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}

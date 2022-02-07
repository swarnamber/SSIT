import java.util.*;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.DataBuffer;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MatchImages {

	public static void main(String[] args) throws AWTException, IOException {
		File in = new File("g.png");
		File out = new File("g.png");

		DataBuffer indb = ImageIO.read(in).getData().getDataBuffer();
		int indbSize = indb.getSize();
		DataBuffer opdb = ImageIO.read(out).getData().getDataBuffer();
		int opdbSize = opdb.getSize();
		boolean flag = true;
		if (indbSize == opdbSize) {
			for (int i = 0; i < indbSize; i++) {
				if (indb.getElem(i) != opdb.getElem(i)) {
					flag = false;
					break;
				}
			}
		} else
			flag = false;
		Assert.assertTrue(flag, "not equal");
	}

}

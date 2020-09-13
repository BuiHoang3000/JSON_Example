import com.google.gson.Gson;

import model.Menu;
public class Example {

	public static void main(String[] args) {
		String json = "{\r\n" + 
				"    \"header\": \"SVG Viewer\",\r\n" + 
				"    \"items\": [\r\n" + 
				"        {\"id\": \"Open\"},\r\n" + 
				"        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\r\n" + 
				"        null,\r\n" + 
				"        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\r\n" + 
				"        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\r\n" + 
				"        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\r\n" + 
				"        null,\r\n" + 
				"        {\"id\": \"Quality\"},\r\n" + 
				"        {\"id\": \"Pause\"},\r\n" + 
				"        {\"id\": \"Mute\"},\r\n" + 
				"        null,\r\n" + 
				"        {\"id\": \"Find\", \"label\": \"Find...\"},\r\n" + 
				"        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\r\n" + 
				"        {\"id\": \"Copy\"},\r\n" + 
				"        {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\r\n" + 
				"        {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\r\n" + 
				"        {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\r\n" + 
				"        {\"id\": \"ViewSource\", \"label\": \"View Source\"},\r\n" + 
				"        {\"id\": \"SaveAs\", \"label\": \"Save As\"},\r\n" + 
				"        null,\r\n" + 
				"        {\"id\": \"Help\"},\r\n" + 
				"        {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\r\n" + 
				"    ]\r\n" + 
				"}";
		Menu menu = new Gson().fromJson(json, Menu.class);
		System.out.println(menu);
	}

}

package ch.cern.maps;

public class GenerateHTMLContent {

	private String HTML = "";

	public String getmHTML() {
		return HTML;
	}

	private int pngGPSWidth = 48, pngGPSHeight = 48, pngPosWidth = 20,
			pngPosHeight = 20;
	private String scriptPlaceGPS = "function mGPSPosition(mLeft, mTop) {var el = document.getElementById('gps'); el.style.display = 'block'; el.style.left = ((mLeft-"
			+ (pngGPSWidth / 2)
			+ ") + 'px'); el.style.top = ((mTop-"
			+ pngGPSHeight + ") + 'px'); }";
	private String pageScroll = "function pageScroll(mLeft, mTop) { window.scrollTo(mLeft, mTop); }";
	private String scriptPlacePos = "function mPosPosition(mLeft, mTop) {var el = document.getElementById('pos'); el.style.display = 'block'; el.style.left = ((mLeft-"
			+ (pngPosWidth / 2)
			+ ") + 'px'); el.style.top = ((mTop-"
			+ (pngPosHeight / 2) + ") + 'px'); }";
	private String scriptsRotatePos = "function mRotationPos(mDegree) { var el = document.getElementById('pos'); el.style.webkitTransform = 'rotate('+mDegree+'deg)'; }";
	private String scriptsHidePos = "function mHidePos() { var el = document.getElementById('gps'); el.style.display = 'none'; var el = document.getElementById('circle'); el.style.display = 'none'; }";
//TODO dimentions of the arrow: 20x20
	private String scriptsAccuracy = "function mAccuracy(mLeft, mTop, mRadius) {"
			+ "var el = document.getElementById('circle');"
			+ "el.style.display = 'block';"
			+ "el.style.left = ((mLeft-mRadius+8) + 'px');"
			+ "el.style.top = ((mTop-mRadius+8) + 'px');"
			+ "el.style.width = ((mRadius*2-4) + 'px');"
			+ "el.style.height = ((mRadius*2-4) + 'px');"
			+ "el.style.WebkitBorderRadius = ((mRadius*2-4) + 'px'); }";

	private String cssGPS = "#gps { display: none; position: absolute; margin: 0; z-index: 10 }";
	private String cssPOS = "#pos { display: none; position: absolute; margin: 0; z-index: 20 }";
	private String cssCIR = "#circle {display:none; position: absolute; background: #F08080;-webkit-opacity: 0.5;border: 2px solid #8B2323;z-index:2;}";

	public String setHtml(int searchLatitude, int searchLongitude,
			int myLatitude, int myLongitude) {

		HTML += "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" />";
		HTML += "<script>" + scriptsAccuracy + pageScroll + scriptPlaceGPS
				+ scriptsHidePos + scriptsRotatePos + scriptPlacePos
				+ "</script>";
		HTML += "<style type='text/css'>" + cssGPS + cssPOS + cssCIR
				+ "</style></head>";

		HTML += "<body style='height: 3192; width: 3644px; margin: 0; padding: 0;'>"
				+ "<div style='float:left;background-image:url(MAP1A1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1A2.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1B1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1B2.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP1A3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1A4.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1B3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP1B4.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP2A1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2A2.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2B1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2B2.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP2A3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2A4.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2B3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP2B4.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP3A1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3A2.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3B1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3B2.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP3A3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3A4.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3B3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP3B4.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP4A1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4A2.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4B1.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4B2.png);height:798px;width:911px;'></div>"
				+ "<div style='float:left;background-image:url(MAP4A3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4A4.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4B3.png);height:798px;width:911px;'></div><div style='float:left;background-image:url(MAP4B4.png);height:798px;width:911px;'></div>";

		HTML += "<div id=\"circle\"></div>";
		HTML += "<div id=\"gps\"><img src=\"gps.png\"></div>";
		HTML += "<div id=\"pos\"><img src=\"pos.png\"></div>";
		HTML += "</body>";
		return HTML;
	}
}
package com.calclab.hablar.signals.client.browserfocus;

public class BrowserFocusHandlerIE6 {
    /**
     * Adds the focus events to the browser
     */
    protected native void addFocusListenerEvents() /*-{
        $wnd.document.onfocusin = function() {
            this.@com.calclab.hablar.signals.client.browserfocus.BrowserFocusHandler::setFocus(Z)(true);
        };
        $wnd.document.onfocusout = function() {
            this.@com.calclab.hablar.signals.client.browserfocus.BrowserFocusHandler::setFocus(Z)(false);
        };
    }-*/;
}